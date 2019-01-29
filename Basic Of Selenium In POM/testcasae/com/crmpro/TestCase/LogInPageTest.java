package com.crmpro.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cempro.pages.LogInPage;
import com.crmpro.base.BasePage;
import com.crmpro.utils.TestUtile;

public class LogInPageTest extends BasePage{
	LogInPage loginPage_Obj;
	TestUtile testUtile_Obj;
	
	public LogInPageTest() {
		super();	
	}


	@BeforeTest
	public void setUp() {
		initialition();
		loginPage_Obj = new LogInPage();
		testUtile_Obj = new TestUtile();
	
	}
	
	@Test
	public void LogInTest() throws IOException, InterruptedException {
		Thread.sleep(5000);
		loginPage_Obj.logInFunction();
		Thread.sleep(5000);
		String title = loginPage_Obj.getTitle();
		Assert.assertEquals(title , "CRMPRO");
	}
	
	
	@AfterTest
	public void closeDown() {
		driver.close();
	}

}
