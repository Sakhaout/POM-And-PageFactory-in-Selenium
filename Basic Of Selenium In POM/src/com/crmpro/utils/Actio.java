package com.crmpro.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.crmpro.base.BasePage;

public class Actio extends BasePage {
	
	private Actions action_obj = new Actions(driver);

	
	public Actio() {
		super();
	}
	
	//This methos perform mouse hover on webelement.
		public void actionMouseHover(WebElement element) {
			//First need to creat an object of Actions class.
			action_obj.moveToElement(element).build().perform();
		}

}
