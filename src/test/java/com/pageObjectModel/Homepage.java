package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	public Homepage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="authUser")
	WebElement homeUserName;
	
	public WebElement username() {
		return homeUserName;
	}
	
	@FindBy(id="clearPass")
	WebElement homePassWord;
	
	public WebElement password() {
		return homePassWord;
	}
	
	@FindBy(name="languageChoice")
	WebElement HomeSelectDropdown;
	
	public WebElement dromDown() {
		return HomeSelectDropdown;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement homeLogin;
	
	public WebElement login() {
		return homeLogin;
	}
	
	

}
