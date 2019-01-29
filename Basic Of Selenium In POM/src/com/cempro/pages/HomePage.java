package com.cempro.pages;

import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.BasePage;
import com.crmpro.utils.TestUtile;

public class HomePage extends BasePage{
	TestUtile testUtile_Obj = new TestUtile();
	
	By allList = By.tagName("li");
	
	@FindBy(xpath = "//td[contains(text(),'User: Hossain Sakhaout')]")
	private WebElement userLebel;
	
	@FindBys(@FindBy(xpath = "//*[@id='homebox_CALDAY']/table/tbody/tr[i]"))
	List<WebElement> eventTable;
	

	
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
	
	public Boolean correctUserName() throws IOException, ElementNotVisibleException {
		Boolean flag = null;
		try {
			testUtile_Obj.switchTofream("mainpanel");
			flag = userLebel.isDisplayed();
		}catch(Exception ex) {
			ex.getStackTrace();
			testUtile_Obj.takeScreenshot(HomePage.this.toString());
		}
		return flag;
	}
	
	public void allListName() throws IOException {
		try {
			List<WebElement> list = driver.findElements(allList);
			int size = list.size();
			for(int i =0; i<size; i++) {
				System.out.println("List of Link: "+list.get(i).getText());
			}
		}catch(Exception ex) {
			ex.getStackTrace();
			testUtile_Obj.takeScreenshot(HomePage.this.toString() + "allListName()");
		}
		
	}
	
	
	
	

}
