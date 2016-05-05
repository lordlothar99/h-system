package com.github.lothar.hsystem;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class InstructionReader {

  private Scanner scanner = new Scanner(System.in);
  private Logger logger = LoggerFactory.getLogger(getClass());

  @Scheduled(fixedDelay = 10)
  public void readInstruction() {
    logger.info("Waiting for instructions");
    String line = scanner.nextLine();
    logger.info("Instruction received : {}", line);
  }

}
