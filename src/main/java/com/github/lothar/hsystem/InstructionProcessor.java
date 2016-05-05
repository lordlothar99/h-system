package com.github.lothar.hsystem;

import org.springframework.stereotype.Component;

@Component
public class InstructionProcessor {

  public void process(String instruction) {
    System.out.println("Hello world !");
  }

}
