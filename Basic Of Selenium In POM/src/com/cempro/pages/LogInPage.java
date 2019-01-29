package com.cempro.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.BasePage;
import com.crmpro.utils.TestUtile;

public class LogInPage extends BasePage {
	
	HomePage homepage_Obj = new HomePage();
	TestUtile testUtile_Obj = new TestUtile();
	
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
	

	
	public HomePage logInFunction() throws IOException{
		try {
			userName.sendKeys(properties_obj.getProperty("username"));
			password.sendKeys(properties_obj.getProperty("password"));
			logIn_button.click();
		}catch(Exception ex) {
			ex.getStackTrace();
			testUtile_Obj.takeScreenshot(LogInPage.this.toString());
		}
		
		return new HomePage();
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

}
