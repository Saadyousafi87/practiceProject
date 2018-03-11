package com.stepdefs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pageObjectModel.Homepage;
import com.pageObjectModel.Visit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientVisit {
	WebDriver driver;
	
	@Given("^user login to app with valid user name and password$")
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

	@When("^user select patient from patient finder$")
	public void user_select_patient_from_patient_finder() throws Throwable {
		Visit visit = new Visit(driver);
		visit.patientSearchButton().click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[3]/iframe")));
		driver.findElement(By.xpath("//*[@id=\"pid_1\"]")).click();
		driver.switchTo().defaultContent();
		
	    
	}

	@When("^click on patient/client button and click on visits button and click on create visit button$")
	public void click_on_patient_client_button_and_click_on_visits_button_and_click_on_create_visit_button() throws Throwable {
		Visit visit = new Visit (driver);
		Actions action = new Actions (driver);
		action.moveToElement(visit.patientclientButton()).build().perform();
		action.moveToElement(visit.visitsButton()).build().perform();
		visit.creatVisitButton().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	    
	}

	@When("^enter consultation brief description, visit category, facility, billing facility, sensitivity and date of service$")
	public void enter_consultation_brief_description_visit_category_facility_billing_facility_sensitivity_and_date_of_service() throws Throwable {
		Visit visit = new Visit(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[5]/iframe")));
		visit.descriptionTextArea().sendKeys("To link this encounter/consult to an existing issue, click the desired issue above to highlight it and then click [Save]. Hold down [Ctrl] button to select multiple issues.");
		Select select = new Select(visit.catagoryDropdown());
		select.selectByVisibleText("Established Patient");
		Select se = new Select(visit.sensibilityDropdown());
		se.selectByVisibleText("High");
		 visit.calendar1().click();
		 
		 while(!visit.calendarImg1().getText().contains("April, 2018")) {
			 visit.calendarNextButton1().click();
		 }
		 int count = driver.findElements(By.className("day")).size();
		 for (int i =0; i<count; i++) {
			 String text = driver.findElements(By.className("day")).get(i).getText();
			 if(text.equals("25")) {
				 driver.findElements(By.className("day")).get(i).click();
			 }
		 }
		
	}

	@When("^click on issue button and enter type, title, reffered by, out comes, click save button and click save button again$")
	public void click_on_issue_button_and_enter_type_title_reffered_by_out_comes_click_save_button_and_click_save_button_again() throws Throwable {
		Visit visit = new Visit(driver);
		visit.saveButton().click();
		
	    
	}

	@Then("^user receiving confirmation message and close the browser$")
	public void user_receiving_confirmation_message_and_close_the_browser() throws Throwable {
		driver.close();
	    
	}


}
