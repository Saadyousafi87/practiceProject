package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Visit {
	
	WebDriver driver;
	public Visit (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-list fa-stack-1x']")
	WebElement patientSearchButton;
	public WebElement patientSearchButton() {
		return patientSearchButton;
	}
	
	@FindBy(xpath="//*[@id=\\\"pid_1\\\"]")
	WebElement selectPatient;
	public WebElement SelectBelford() {
		return selectPatient;
	}
	
	@FindBy(xpath="//*[@id=\"menu logo\"]/div/div/span[4]/div/div")
	WebElement patientClientButton;
	public WebElement patientclientButton(){
		return patientClientButton;
	}
	
	@FindBy(xpath="//*[@id=\"menu logo\"]/div/div/span[4]/div/ul/li[4]/div/div")
	WebElement visitsButton;
	public WebElement visitsButton() {
		return visitsButton;
	}
	
	@FindBy(xpath="//*[@id=\"menu logo\"]/div/div/span[4]/div/ul/li[4]/div/ul/li[1]/div")
	WebElement creatVisitButton;
	public WebElement creatVisitButton() {
		return creatVisitButton;
	}
	
	@FindBy(xpath="//*[@id=\"new-encounter-form\"]/table/tbody/tr[2]/td[1]/textarea")
	WebElement descriptionTextArea;
	public WebElement descriptionTextArea() {
		return descriptionTextArea;
	}
	
	@FindBy(xpath="//select[@id='pc_catid']")
	WebElement catagoryDropdown;
	public WebElement catagoryDropdown() {
		return catagoryDropdown;
	}
	
	@FindBy(xpath="//*[@id=\"new-encounter-form\"]/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/select")
	WebElement sensibilityDropdown;
	public WebElement sensibilityDropdown() {
		return sensibilityDropdown;
	}
	
	@FindBy(xpath="//img[@id='img_form_date']")
	WebElement calendar1;
	public WebElement calendar1() {
		return calendar1;
	}
	
	@FindBy(xpath="/html/body/div[6]/table/thead/tr[1]/td[2]")
	WebElement calendarImg1;
	public WebElement calendarImg1() {
		return calendarImg1;
	}
	
	@FindBy(xpath="/html/body/div[6]/table/thead/tr[2]/td[4]/div")
	WebElement calendarNextButton1;
	public WebElement calendarNextButton1() {
		return calendarNextButton1;
	}
	
	@FindBy(xpath="//img[@id='img_form_onset_date']")
	WebElement calendar2;
	public WebElement calendar2() {
		return calendar2;
	}
	
	@FindBy(xpath="/html/body/div[10]/table/thead/tr[1]/td[2]")
	WebElement calendarImg2;
	public WebElement calendarImg2() {
		return calendarImg2;
	}
	
	@FindBy(xpath="/html/body/div[10]/table/thead/tr[2]/td[4]/div")
	WebElement calendarNextButton2;
	public WebElement calendarNextButton2() {
		return calendarNextButton2;
	}
	
	@FindBy(xpath="//*[@id=\"new-encounter-form\"]/table/tbody/tr[1]/td[3]/div[2]/a/span")
	WebElement issueButton;
	public WebElement issueButton() {
		return issueButton;
	}
	
	@FindBy(xpath="//input[@name='form_type'][2]")
	WebElement radioButton;
	public WebElement radioButton() {
		return radioButton;
	}
	
	@FindBy(xpath="//*[@id=\"new-encounter-form\"]/div[2]/div/a[1]/span")
	WebElement saveButton;
	public WebElement saveButton() {
		return saveButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
