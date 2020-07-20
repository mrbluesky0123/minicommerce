package com.skcc.minicommerce.Things.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThingsController {

  @GetMapping("/things/getthingsinfo")
  public String getThingsInfo(){
    return "Things information.";
  }

}
