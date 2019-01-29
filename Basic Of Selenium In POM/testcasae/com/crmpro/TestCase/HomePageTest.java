package com.crmpro.TestCase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cempro.pages.HomePage;
import com.cempro.pages.LogInPage;
import com.crmpro.base.BasePage;
import com.crmpro.utils.TestUtile;


public class HomePageTest extends BasePage {
	
	private HomePage HomePage_obj;
	private LogInPage login_obj;


	public HomePageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp() throws IOException {
		initialition();
		HomePage_obj = new HomePage();
		login_obj = new LogInPage();
		login_obj.logInFunction();
	}
	

	@Test
	public void printAllLink() throws IOException, InterruptedException {
		Thread.sleep(5000);
		HomePage_obj.allListName();
	}
	@Test
	public void varifyUsername() throws IOException {
		Assert.assertTrue(HomePage_obj.correctUserName());
	}
	
	@Test
	public void varifyTable() {
		HomePage_obj.getTable();
	
	}
	
	
	@AfterTest
	public void closeDown() {
		driver.close();
	}
	

}
