package com.crmpro.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cempro.pages.Contacts;
import com.cempro.pages.LogInPage;
import com.crmpro.base.BasePage;
import com.crmpro.utils.TestUtile;

public class ContactsPageTest extends BasePage {
	LogInPage loginPage_obj = new LogInPage();
	Contacts contactPage_obj = new Contacts();
	private TestUtile testUtile_obj = new TestUtile();

	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() throws IOException {
		initialition();
		loginPage_obj = new LogInPage();
		loginPage_obj.logInFunction();
	}
	
	@Test
	public void clickOn_NewContuct() throws IOException, InterruptedException {
		contactPage_obj.goToNewContactsPage();
		System.out.println("URL: "+driver.getCurrentUrl());

	}
	
	
//	@Test
//	public void CreateNewContact() throws InterruptedException, IOException {
//		contactPage_obj.createNewContact();
//		System.out.println("Created contacts are done");
//	}
//	
//	@Test
//	public void varfiedNewContactsPresent() {
//		String actual_linkName = contactPage_obj.getText_NewContactLink();
//		String expeted_linkName = "New Contact";
//		Assert.assertEquals(actual_linkName, expeted_linkName);
//	}
//	
//	@Test
//	public void varfied_CombineFormLink_IsPresent() {
//		contactPage_obj.isDisplay_CombineFormLink();
//		//Assert.assertTrue(flag, "The Link is not present.");
//	}
//	
//	@Test
//	public void varfied_FullSearchForm_IsPresent() {
//		String actual_linkName = contactPage_obj.getText_FullSearchFormLink();
//		String expeted_linkName = "Full Search Form";
//		Assert.assertEquals(actual_linkName, expeted_linkName);
//	}
	
//	@AfterTest
//	public void closeDown() {
//		driver.close();
//	}

}
