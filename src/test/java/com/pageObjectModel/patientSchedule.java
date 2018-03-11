package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class patientSchedule {
	
	WebDriver driver;
	public patientSchedule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@id='menu logo']/div/div/span")
	WebElement calanderButton;
	public WebElement calanderButton() {
		return calanderButton;
	}
	
	@FindBy(name="cal")
	WebElement iFrame;
	public WebElement iframe() {
		return iFrame;
	}
	
	@FindBy(name="Calendar")
	WebElement frame;
	public WebElement Frame() {
		return frame;
	}
	
	@FindBy(xpath="//a[@title='New Appointment']//i[@class='fa fa-plus']")
	WebElement newAppointmentButton;
	public WebElement appointmentButton() {
		return newAppointmentButton;
	}
	
	@FindBy(xpath="/html/body/div[2]/iframe")
	WebElement frameAppointment;
	public WebElement appointmentFrame() {
		return frameAppointment;
	}
	
	@FindBy(name="form_category")
	WebElement psDropdown;
	public WebElement psDropdown() {
		return psDropdown;
	}
	
	@FindBy(id="img_date")
	WebElement calendarButton;
	public WebElement datecalendarButton() {
		return calendarButton;
	}
	
	@FindBy(className="title")
	WebElement calendarMonthImage;
	public WebElement calenderMonthImage() {
		return calendarMonthImage;
	}
	
	@FindBy(xpath="/html/body/div[5]/table/thead/tr[1]/td[3]")
	WebElement calendarMonthNextButton;
	public WebElement calendarMonthNextButton() {
		return calendarMonthNextButton;
	}
	
	@FindBy(className="day")
	WebElement calendarDay;
	public WebElement calendarDay() {
		return calendarDay;
	}
	
	
	@FindBy(id="form_patient")
	WebElement patientFinderTextBar;
	public WebElement PatientFinderTextBar() {
		return patientFinderTextBar;
	}
	
	@FindBy(id="searchparm")
	WebElement patientName;
	public WebElement enterPatientName() {
		return patientName;
	}
	
	@FindBy(id="submitbtn")
	WebElement searchPatient;
	public WebElement patientSearchButton() {
		return searchPatient;
	}
	
	@FindBy(xpath="//tr[@id='1~Belford~Phil~1972-02-09']/td[1]")
	WebElement selectBelford;
	public WebElement selectPatientBelford() {
		return selectBelford;
	}
	
	@FindBy(name="form_comments")
	WebElement commentForm;
	public WebElement commentForm() {
		return commentForm;
	}
	
	@FindBy(xpath="//input[@name='form_save']")
	WebElement savebutton;
	public WebElement savePatientFormButton() {
		return savebutton;
	}

}















