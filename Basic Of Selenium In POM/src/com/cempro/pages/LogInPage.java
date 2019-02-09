package com.cempro.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.BasePage;

public class LogInPage extends BasePage {
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement logIn_button;
	
	public LogInPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	

	
	public HomePage logInFunction(){
		try {
			userName.sendKeys(properties_obj.getProperty("username"));
			password.sendKeys(properties_obj.getProperty("password"));
			logIn_button.click();
		}catch(Exception ex) {
			ex.getStackTrace();
		}
		
		return new HomePage();
	}

}
