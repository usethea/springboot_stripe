package com.superaslan.stripe.controller;

import com.stripe.exception.StripeException;
import com.stripe.param.PaymentIntentCreateParams;
import com.superaslan.stripe.dto.CreatePayment;
import com.superaslan.stripe.dto.CreatePaymentResponse;
import com.stripe.model.PaymentIntent;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

  @PostMapping("/create-payment-intent")
  public CreatePaymentResponse createPaymentIntent(@RequestBody CreatePayment createPayment) throws StripeException {
        PaymentIntentCreateParams createParams  = new PaymentIntentCreateParams.Builder()
          .setAmount(20000L)
          .setCurrency("eur")
          .build();

      // Create a PaymentIntent with the order amount and currency
      PaymentIntent intent = PaymentIntent.create(createParams);

      return new CreatePaymentResponse(intent.getClientSecret()); 
  }
}



