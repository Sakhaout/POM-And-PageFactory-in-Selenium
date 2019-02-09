package com.crmpro.TestCase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cempro.pages.LogInPage;
import com.crmpro.base.BasePage;
import com.crmpro.utils.CustomListener;
import com.crmpro.utils.TestUtile;

@Listeners(CustomListener.class)
public class LogInPageTest extends BasePage{
	LogInPage loginPage_Obj;
	TestUtile testUtile_Obj;
	
	public LogInPageTest() {
		super();	
	}


	@BeforeMethod
	public void setUp() {
		initialition();
		loginPage_Obj = new LogInPage();
	
	}
	
	@Test
	public void LogInTest(){
		loginPage_Obj.logInFunction();
		String title =driver.getTitle();
		Assert.assertEquals(title , "CRMPRO");
	}
	
	
	@AfterMethod
	public void closeDown() {
		driver.close();
	}

}
