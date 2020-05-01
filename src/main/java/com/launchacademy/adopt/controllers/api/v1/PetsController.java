package com.launchacademy.adopt.controllers.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/pets")
public class PetsController {
  @GetMapping
  public String getIndex() {
    return "static/index";
  }
}
