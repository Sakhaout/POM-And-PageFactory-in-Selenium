package com.cempro.pages;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crmpro.base.BasePage;
import com.crmpro.utils.Action;
import com.crmpro.utils.TestUtile;

public class Contacts extends BasePage {
	
	private Action action_obj = new Action();
	private TestUtile testUtile_obj = new TestUtile();
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	private WebElement contactLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	private WebElement sub_link_newContact;
	
	@FindBy(xpath = "//a[contains(text(),'Combined Form')]")
	private WebElement sublink_CombinedForm;
	
	@FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/ul/li[3]")
	private WebElement sublink_FullSearchLink;
	
	@FindBy (xpath = "//a[contains(text(),'New Contact')]")
	private WebElement new_Contact;
	
	@FindBy(xpath = "//select[@name='title']")
	private WebElement title_box;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_name;
	
	@FindBy(xpath = "//input[@name='middle_initial']")
	private WebElement middle_name;
	
	@FindBy(xpath = "//input[@name='surname']")
	private WebElement last_name;
	
	@FindBy(xpath = "//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")
	private WebElement save_button;
	
	
	public Contacts() {
		super();
		PageFactory.initElements(driver, this);
	}
	

	
	public void goToNewContactsPage() throws IOException {
		testUtile_obj.switchTofream("mainpanel");
		action_obj.actionMouseHover(contactLink);
		sub_link_newContact.click();
		
	}
	
	 //This method will create set of new contacts
	public void createNewContact() throws IOException, InterruptedException {
		ArrayList<String> firstName = testUtile_obj.readExcelfile(0);
		ArrayList<String>middleName = testUtile_obj.readExcelfile(1);
		ArrayList<String>lastName = testUtile_obj.readExcelfile(2);
		
		for(int i=0;i<firstName.size();i++) {
			first_name.sendKeys(firstName.get(i));
			middle_name.sendKeys(middleName.get(i));
			last_name.sendKeys(lastName.get(i));
			save_button.click();
			Thread.sleep(4000);
			goToNewContactsPage();
		}
	}
	
	public String getText_NewContactLink() {
		return null;
	}
	
	public void isDisplay_CombineFormLink() {
//		mouseHoverOnContactsLink();
		String str = action_obj.getTooltipText(contactLink, sublink_CombinedForm);
		action_obj.actionMouseHover(sublink_CombinedForm);
		System.out.println("ToolTip: "+str);
//		boolean flag = sublink_CombinedForm.isDisplayed();
//		return flag;
	}	
	
	public String getText_FullSearchFormLink() {
		//mouseHoverOnContactsLink();
		action_obj.actionMouseHover(sublink_FullSearchLink);
		String linkName = sublink_FullSearchLink.getText();
		return linkName;
	}
	

}
