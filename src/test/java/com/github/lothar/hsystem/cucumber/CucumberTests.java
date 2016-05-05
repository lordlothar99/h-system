package com.github.lothar.hsystem.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
    monochrome = true,
	features = "src/test/features",
	glue = { "com.github.lothar.hsystem.cucumber", "cucumber.api.spring" },
	tags = { "~@ignore", "@done" })
public class CucumberTests {

}
