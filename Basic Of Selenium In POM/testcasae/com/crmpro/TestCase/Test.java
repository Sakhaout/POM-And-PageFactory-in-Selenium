package com.crmpro.TestCase;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.pagefactory.ByAll;

import com.cempro.pages.HomePage;
import com.crmpro.base.BasePage;
import com.crmpro.utils.Action;
import com.crmpro.utils.TestUtile;

public class Test extends BasePage {
	
	static Action ac = new Action();
	
	static By user = By.xpath("//input[@placeholder='Username']");
	static By pass = By.xpath("//input[@placeholder='Password']");
	//static By sub = By.xpath("//input[@value='Login']");
	 @FindBy(xpath = "//input[@value='Login']" )
	static WebElement sub;
	static @FindBys(@FindBy(xpath = "//*[@id='homebox_CALDAY']/table/tbody/tr[i]"))
	List<WebElement> eventTable;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	private static WebElement contactLink;
	
	static By contact = By.xpath("//a[contains(text(),'Contacts')]");
	
	@FindBy(xpath = "//a[contains(text(),'Combined Form')]")
	static WebElement sublink_CombinedForm;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(user).sendKeys("sakhaout");
		driver.findElement(pass).sendKeys("Sakhaout8");
		ac.actionDoubleClick(sub);
		//driver.findElement(sub).click();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		//ac.actionMouseHover(contactLink);
		String str = ac.getTooltipText(contactLink, sublink_CombinedForm);
		System.out.println("tooltip: "+str);
//		sublink_CombinedForm.click();
//		System.out.println("Titale: "+driver.getTitle());
//		TestUtile obj = new TestUtile();
//		obj.takeScreenshot("test");
		//driver.manage().timeouts().implicitlyWait(TestUtile.Implicitly_Wait, TimeUnit.SECONDS); //Wait until element is found, but wait until a time.
//		driver.switchTo().frame("mainpanel");
//		driver.findElement(contact).click();
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]
		
		String before_xpath = "//*[@id=\'homebox_CALDAY\']/table/tbody/tr[1]/td[";
		String afterXpath = "]/table/tbody/tr";
		//*[@id="homebox_CALDAY"]/table/tbody/tr[3]
		
//		System.out.println("1st ");
//		driver.switchTo().frame("mainpanel");
//
//		
//		for(int i=1; i<=7;i++) {
//			driver.manage().timeouts().implicitlyWait(TestUtile.Implicitly_Wait, TimeUnit.SECONDS); //Wait until element is found, but wait until a time.
//			//*[@id="homebox_CALDAY"]/table/tbody/tr[2]/td[1]
//			
//			
//			String str = before_xpath+i+afterXpath;
//			WebElement element = driver.findElement(By.xpath(str));
//			String date = element.getText();
//			System.out.println("Get Data: "+date);

		}
		
		



	}


