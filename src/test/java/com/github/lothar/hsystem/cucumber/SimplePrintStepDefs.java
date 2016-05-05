package com.github.lothar.hsystem.cucumber;

import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import javax.annotation.Resource;

import org.mockito.Mockito;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;

import com.github.lothar.hsystem.HSystemApplication;
import com.github.lothar.hsystem.InstructionProcessor;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@ContextConfiguration(classes = HSystemApplication.class, loader = SpringApplicationContextLoader.class)
public class SimplePrintStepDefs {

  @Resource
  private InstructionProcessor processor;
  private PrintStream sysoutMock = Mockito.mock(PrintStream.class);

  @Before
  public void before() {
    System.setOut(sysoutMock);
  }

  public void after() {
    System.setOut(System.out);
  }

  @When("^I say \"Print (.*) in the console\"$")
  public void i_say_print_in_the_console(String instruction) {
    processor.process("Print " + instruction + " in the console");
  }

  @Then("^\"([^\"]*)\" is printed in the console$")
  public void is_printed_in_the_console(String expectedOutput) {
    verify(sysoutMock).println(expectedOutput);
  }
}
