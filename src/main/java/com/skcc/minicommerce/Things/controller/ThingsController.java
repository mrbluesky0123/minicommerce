package com.skcc.minicommerce.Things.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThingsController {

  @GetMapping("/things/thingsinfo")
  public String getThingsInfo(){
    return "Things information.";
  }

}
