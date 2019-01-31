package com.cempro.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.BasePage;
import com.crmpro.utils.Action;
import com.crmpro.utils.CommonAction;
import com.crmpro.utils.TestUtile;


public class HomePage extends BasePage{
	TestUtile testUtile_Obj = new TestUtile();
	Action action = new Action();
	CommonAction commonAction_obj = new CommonAction();
	
	By allList = By.tagName("a");
	
	@FindBy(xpath = "//td[contains(text(),'User: Hossain Sakhaout')]")
	private WebElement userLebel;
	
	
	@FindBys(@FindBy(xpath = "//*[@id='homebox_CALDAY']/table/tbody/tr[i]"))
	List<WebElement> eventTable;
	
	@FindBy(xpath = "//div[@id='navMenu']//a[@title='Mail Accounts'][contains(text(),'Mail Accounts')]")
	private WebElement mailAccount_link;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement logout;
	
	@FindBy(xpath = "//a[contains(text(),'Messages')]")
	private WebElement message_link;
	
	@FindBy(xpath = "//a[@title='Contacts']")
	private WebElement contactsLink;
	
	@FindBy(xpath = "//a[@title='New Contact']")
	private WebElement newContact;
	
	@FindBy(xpath = "//ul[@class='mlddm']//li[4]//ul[1]//li[2]//a[1]")
	private WebElement combinedFrom;
	

	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void getTable() {
		for(int i=1; i<=eventTable.size();i++) {
			String date = eventTable.get(i).getText();
			System.out.println("Get Data: "+date);

		}
	}
	
	
	
		
	public void clickOnContactsLink() {
		action.actionMouseHover(contactsLink);
		combinedFrom.click();
		//newContact.click();
	}
	
	
	
	public void allLink() throws IOException {
		commonAction_obj.check_Link_connection(allList);
				
	}
	
	public void logout() {
		logout.click();
	}
	
	
	
	

}
