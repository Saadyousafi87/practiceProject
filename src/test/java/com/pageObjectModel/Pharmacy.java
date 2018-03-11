package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pharmacy {
	
	WebDriver driver;
	public Pharmacy (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id='menu logo']/div/div/span[8]/div/div")
	WebElement administrationButton;
	public WebElement administrationButton() {
		return administrationButton;
	}
	
	@FindBy(xpath="//*[@id=\"menu logo\"]/div/div/span[8]/div/ul/li[5]/div")
	WebElement addPharmacyButton;
	public WebElement practiceButton() {
		return addPharmacyButton;
	}
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/a/span")
	WebElement addAPharmacy;
	public WebElement addAPharmacy() {
		return addAPharmacy;
	}
	
	@FindBy(xpath="//input[@name='name']")
	WebElement formName;
	public WebElement formName() {
		return formName;
	}
	
	@FindBy(xpath="//input[@name='address_line1']")
	WebElement formAddress1;
	public WebElement formAddress1() {
		return formAddress1;
	}
	
	@FindBy(xpath="//input[@name='address_line2']")
	WebElement formAddress2;
	public WebElement formAddress2() {
		return formAddress2;
	}
	
	@FindBy(xpath="//input[@name='city']")
	WebElement formCity;
	public WebElement formCity() {
		return formCity;
	}
	
	@FindBy(xpath="//input[@name='state']")
	WebElement formState;
	public WebElement formState() {
		return formState;
	}
	
	@FindBy(xpath="//input[@name='zip']")
	WebElement formZip;
	public WebElement formZip() {
		return formZip;
	}
	
	@FindBy(xpath="//input[@name='email']")
	WebElement formemail;
	public WebElement formEmail() {
		return formemail;
	}
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement formPhone;
	public WebElement formPhone() {
		return formPhone;
	}
	
	@FindBy(xpath="//input[@name='fax']")
	WebElement formFax;
	public WebElement formFax() {
		return formFax;
	}
	
	@FindBy(xpath="//select[@name='transmit_method']")
	WebElement formDropdown;
	public WebElement formDropdown() {
		return formDropdown;
	}
	
	@FindBy(xpath="//select[@name='transmit_method']")
	WebElement formSaveButton;
	public WebElement formSaveButton() {
		return formSaveButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
