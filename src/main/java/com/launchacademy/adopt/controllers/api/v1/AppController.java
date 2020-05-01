package com.launchacademy.adopt.controllers.api.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
  @GetMapping(value={"/", "/pets"})
  public String index() {return "index";}

  @GetMapping(value="/**/{path:[^\\.]*}")
  public String forward() {return "forward:/";}
}
