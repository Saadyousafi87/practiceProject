package com.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"features/PatientReminder.feature"}, glue = {"com.stepdefs"})

public class Testrunner extends AbstractTestNGCucumberTests {

}
