package com.example.demo.controller;

import com.amazonaws.util.EC2MetadataUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping
  public String get() {
    return EC2MetadataUtils.getEC2InstanceRegion() + " " + EC2MetadataUtils.getAvailabilityZone();
  }
}
