package com.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pageObjectModel.Homepage;
import com.pageObjectModel.PatientReminder;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReminderMessage {
	WebDriver driver;
	
	@Given("^user login to  app with valid user name and password\\.$")
	public void user_login_to_app_with_valid_user_name_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe" );
		   driver = new ChromeDriver();
		   driver.get("http://demo.openemr.io/openemr");
		   driver.manage().window().maximize();
		   
		   Homepage hp = new Homepage(driver);
		   hp.username().sendKeys("admin");
		   hp.password().sendKeys("pass");
		   
		   if(hp.dromDown().isDisplayed()) {
		   Select dropdown = new Select (hp.dromDown());
		   dropdown.selectByVisibleText("English (Standard)");
		   }
		   hp.login().click();
	    
	}

	@When("^user select the patient from patient finder$")
	public void user_select_the_patient_from_patient_finder() throws Throwable {
		PatientReminder pr = new PatientReminder(driver);
		pr.patientFindButton().click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[3]/iframe")));
		pr.selectPatient().click();
		driver.switchTo().defaultContent();
	    
	}

	@When("^click on message button and click on add new link$")
	public void click_on_message_button_and_click_on_add_new_link() throws Throwable {
		PatientReminder pr = new PatientReminder(driver);
		pr.messageButton().click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[2]/iframe")));
		pr.addNewButton().click();
	    
	}

	@When("^enter type, patient, status, to, enter the message and click on send message button$")
	public void enter_type_patient_status_to_enter_the_message_and_click_on_send_message_button() throws Throwable {
		PatientReminder pr = new PatientReminder(driver);
		Select select = new Select(pr.typeDropdown());
		select.selectByVisibleText("Patient Reminders");
		Select status = new Select(pr.statusDropdown());
		status.selectByVisibleText("New");
		Select to = new Select (pr.toDrowdown());
		to.selectByVisibleText("Smith, Billy");
		pr.selectPatientButton().click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
		pr.patientSearchBar().sendKeys("Salim Ahmed");
		pr.searchButton().click();
		pr.selectAhmedButton().click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[2]/iframe")));
		pr.textArea().sendKeys("Please do not forget this patient");
		pr.sendMessageButton().click();
	    
	}

	@Then("^user receive confirmation message then close the browser$")
	public void user_receive_confirmation_message_then_close_the_browser() throws Throwable {
		driver.close();
	    
	}

}
