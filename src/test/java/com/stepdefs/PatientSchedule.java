package com.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pageObjectModel.Homepage;
import com.pageObjectModel.patientSchedule;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PatientSchedule {
	WebDriver driver;
	
	@Given("^user login  the app with valid user name and password$")
	public void user_login_the_app_with_valid_user_name_and_password() throws Throwable {
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

	@When("^user click on calender button$")
	public void user_click_on_calender_button() throws Throwable {
		patientSchedule ps = new patientSchedule(driver);
		ps.calanderButton().click();
		
	    	}

	@When("^click on new appointment button$")
	public void click_on_new_appointment_button() throws Throwable {
		patientSchedule ps = new patientSchedule(driver);
		driver.switchTo().frame(ps.iframe());
		driver.switchTo().frame(ps.Frame());
		ps.appointmentButton().click();
		driver.switchTo().defaultContent();
		


	}

	@When("^enter category, date, time, title, patient, provider, room number, comments and click save$")
	public void enter_category_date_time_title_patient_provider_room_number_comments_and_click_save() throws Throwable {
		patientSchedule ps = new patientSchedule(driver);
		driver.switchTo().frame(ps.appointmentFrame());
		Select s = new Select(ps.psDropdown());
		s.selectByVisibleText("Preventive Care Services");
		ps.PatientFinderTextBar().click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[3]/iframe")));
		ps.enterPatientName().sendKeys("belford");
		ps.patientSearchButton().click();
		ps.selectPatientBelford().click();
		
		driver.switchTo().frame(ps.appointmentFrame());
		Select se = new Select(driver.findElement(By.xpath("//select[@name='form_room']")));
		se.selectByIndex(2);
		ps.commentForm().sendKeys("Frames are hard to locate than any other elements");
		
		ps.datecalendarButton().click();
		while(!driver.findElement(By.className("title")).getText().contains("August, 2018")){
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/thead[1]/tr[2]/td[4]/div[1]")).click();
		}
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
			}
		}
		ps.savePatientFormButton().click();
		
		
	  
	}

	@Then("^user receive confirmation message and close the browser$")
	public void user_receive_confirmation_message_and_close_the_browser() throws Throwable {
		driver.close();
	    
	}

}
