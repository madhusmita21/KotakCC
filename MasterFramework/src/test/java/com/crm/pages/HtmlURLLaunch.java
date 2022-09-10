package com.crm.pages;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;


public class HtmlURLLaunch extends SetUp 
{
	
	public static Logger log =LogManager.getLogger(HtmlURLLaunch.class.getName());
	

	public void HtmlUrlLaunched() throws Exception
	{
				//URL of the webpage
				//driver.get("https://crmdapuat.kotak.com/vivid/CreditCard.html");
				//driver.get("https://kmb.crmnext.com/sng7/vividkotak/CreditCard.html");
				
				
				//driver.findElement(By.xpath("//a[text()='Kotak Website']")).click();
				CommonMethods.Click("Website_Option_XPATH");
				
				//Clicking NTB type
				//driver.findElement(By.id("id_68934914193571")).click(); 
				//CommonMethods.highLight("CustomerType_NTB_ID");
				//CommonMethods.Click("CustomerType_NTB_ID");
				
				//Submit Button
				//driver.findElement(By.id("c_75946701414")).click();
				Thread.sleep(2000);
				CommonMethods.highLight("ProceedBtn_XPATH");
				CommonMethods.Click("ProceedBtn_XPATH");
				
	}
			
}
	

	
	
	//public static void BasicDetailsOne(String sheetname)
	//{
		//CommonMethods.input("FirstName_XPATH", sheetname, "FirstName", 1);
	
	//}
		
			
	//}


