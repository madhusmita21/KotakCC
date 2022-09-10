package com.crm.pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class CardSelection extends SetUp
{
	
	public static Logger log =LogManager.getLogger(CardSelection.class.getName());
		
	
	public void CardSelect() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='League Platinum'])[1]")));
		
		CommonMethods.highLight("League_Platinum_Card_XPATH");
		CommonMethods.Click("League_Platinum_Card_XPATH");
			
		CommonMethods.highLight("ProceedBtn_XPATH");
		CommonMethods.Click("ProceedBtn_XPATH");
	}

}
