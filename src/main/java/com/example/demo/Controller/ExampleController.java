package com.example.demo.Controller;

import com.example.demo.Service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ExampleController {
  private final ExampleService exampleService;

  @Autowired
  public ExampleController(ExampleService exampleService) {
    this.exampleService = exampleService;
  }

  @RequestMapping(value = {"/compute/pcl"}, method = RequestMethod.POST)
  public ResponseEntity<?> computePclWithBiometrics(){
    exampleService.test();
    return ResponseEntity.ok().build();
  }
  @GetMapping("/image")
  public String getImage(){
    return "404";
  }

}
