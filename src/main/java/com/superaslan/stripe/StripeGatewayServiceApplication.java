package com.superaslan.stripe;

import javax.annotation.PostConstruct;

import com.stripe.Stripe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StripeGatewayServiceApplication {
	
	@PostConstruct
	public void setup() {
		// This is your test secret API key.
    Stripe.apiKey = "sk_test_51KT9DOGobUdrXInMEgBSpxByQ4mwBkkdhvkBSSZGmrOzzA6mFv92SPY1SefXNnEOQ6mHcBpRW18HTg4gFMcbnLi400NcF7zVzu";
	}
	public static void main(String[] args) {
		SpringApplication.run(StripeGatewayServiceApplication.class, args);
	}

}
