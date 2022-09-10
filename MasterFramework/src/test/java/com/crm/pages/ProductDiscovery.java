package com.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class ProductDiscovery extends SetUp
{
	
	public static Logger log =LogManager.getLogger(ProductDiscovery.class.getName());
	

	public void ProductPreference() throws Exception 
	
	{
	/*
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
     * wait.until(ExpectedConditions.elementToBeClickable(By.id("checkcheckbox1")));
	 */
	//ClickElement.clickById(driver, "checkcheckbox1"); //pass the driver and id
	
	
	CommonMethods.mouseClick("Product_preference_XPATH");
	
	CommonMethods.Click("Monthly_income_ID");
	
	CommonMethods.Click("Salary_Range_XPATH");
	
	CommonMethods.highLight("SubmitBtn_PDP_XPATH");
	CommonMethods.Click("SubmitBtn_PDP_XPATH");
	
	/*List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	int size = AllCheckboxes.size();
	System.out.println(size);
		
	for (int i = 0; i < size; i++) 
	{
		AllCheckboxes.get(i).click();
	}*/
	}
	
}
