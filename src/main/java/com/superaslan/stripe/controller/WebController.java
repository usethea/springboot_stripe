package com.superaslan.stripe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class WebController {
  @GetMapping("/")
  public String home(Model model) {
    return "index";
  }

  @GetMapping("checkout")
  public String checkout(Model model) {
    return "checkout";
  }
}
