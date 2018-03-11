package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientReminder {
	WebDriver driver;
	public PatientReminder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-list fa-stack-1x']")
	WebElement patientFinder;
	public WebElement patientFindButton() {
		return patientFinder;
	}
	
	@FindBy(xpath="//*[@id=\"pid_4\"]/td[1]")
	WebElement selectPatient;
	public WebElement selectPatient() {
		return selectPatient;
	}
	
	@FindBy(xpath="//*[@id=\"menu logo\"]/div/div/span[3]/div")
	WebElement messageButton;
	public WebElement messageButton() {
		return messageButton;
	}
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td/table[2]/tbody/tr/td[1]/a[1]")
	WebElement addNewButton;
	public WebElement addNewButton() {
		return addNewButton;
	}
	
	@FindBy(xpath="//select[@id='form_note_type']")
	WebElement typeDropdown;
	public WebElement typeDropdown() {
		return typeDropdown;
	}
	
	@FindBy(xpath="//select[@id='form_message_status']")
	WebElement statusDropdown;
	public WebElement statusDropdown() {
		return statusDropdown;
	}
	
	@FindBy(xpath="//select[@id='users']")
	WebElement toDropdown;
	public WebElement toDrowdown() {
		return toDropdown;
	}
	
	@FindBy(xpath="//textarea[@id='note']")
	WebElement textArea;
	public WebElement textArea() {
		return textArea;
	}
	
	@FindBy(xpath="//input[@name='form_patient']")
	WebElement selectPatientButton;
	public WebElement selectPatientButton() {
		return selectPatientButton;
	}
	
	@FindBy(xpath="//input[@id='searchparm']")
	WebElement patientSearchBar;
	public WebElement patientSearchBar() {
		return patientSearchBar;
	}
	
	@FindBy(xpath="//input[@id='submitbtn']")
	WebElement searchButton;
	public WebElement searchButton() {
		return searchButton;
	}
	
	@FindBy(xpath="//*[@id=\"4~Ahmed~Salim~1971-12-25\"]/td[1]")
	WebElement selectAhmedButton;
	public WebElement selectAhmedButton() {
		return selectAhmedButton;
	}
	
	@FindBy(xpath="//input[@id='newnote']")
	WebElement sendMessageButton;
	public WebElement sendMessageButton() {
		return sendMessageButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
