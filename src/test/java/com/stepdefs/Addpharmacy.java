package com.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pageObjectModel.Homepage;
import com.pageObjectModel.Pharmacy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addpharmacy {
	WebDriver driver;
	
	@Given("^user visit app and login with valid username and password\\.$")
	public void user_visit_app_and_login_with_valid_username_and_password() throws Throwable {
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

	@When("^user click on addministration button$")
	public void user_click_on_addministration_button() throws Throwable {
		Pharmacy pharmacy = new Pharmacy(driver);
		Actions action = new Actions (driver);
		action.moveToElement(pharmacy.administrationButton()).build().perform();
		pharmacy.practiceButton().click();
		driver.switchTo().frame(driver.findElement(By.name("adm")));
		pharmacy.addAPharmacy().click();
	    
	}

	@When("^enter name, address, city, state, zip, email, phone$")
	public void enter_name_address_city_state_zip_email_phone() throws Throwable {
		Pharmacy pharmacy = new Pharmacy(driver);
		pharmacy.formName().sendKeys("Billy Bowdon");
		pharmacy.formAddress1().sendKeys("123 ave");
		pharmacy.formAddress2().sendKeys("abc ave");
		pharmacy.formCity().sendKeys("Idaho");
		pharmacy.formState().sendKeys("CH");
		pharmacy.formZip().sendKeys("10110");
		pharmacy.formEmail().sendKeys("blabla@bla.com");
		pharmacy.formPhone().sendKeys("123456789");
		pharmacy.formFax().sendKeys("987654321");
		Select select = new Select (pharmacy.formDropdown());
		select.selectByIndex(2);
		
	    
	}

	@When("^click save button$")
	public void click_save_button() throws Throwable {
		Pharmacy pharmacy = new Pharmacy(driver);
		pharmacy.formSaveButton().click();
	    
	}

	@Then("^userr get confirmation message and close browser$")
	public void userr_get_confirmation_message_and_close_browser() throws Throwable {
		driver.close();
	    
	}

}
