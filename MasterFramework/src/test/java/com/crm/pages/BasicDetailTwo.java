package com.crm.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;

public class BasicDetailTwo  extends SetUp
{
	public static Logger log =LogManager.getLogger(BasicDetailTwo.class.getName());
	
	public void BasicDetail2(String sheetname) throws Exception
	{
		Thread.sleep(2000);
		CommonMethods.mouseClick("CalenderIcon_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("CalenderMonth_XPATH", sheetname, "Month", 1);
		CommonMethods.input("CalenderYear_XPATH", sheetname, "Year", 1);
		
		Thread.sleep(2000);
		List<WebElement> day= driver.findElements(By.xpath("//div//button//time"));
		String date = ExcelOperation.getCellData(sheetname, "Date", 1);
		for(WebElement element:day)
		{
			String elementtext= element.getText();
			if(elementtext.equalsIgnoreCase(date))
			{
				element.click();
				break;
			}
			
		}
		
		//CommonMethods.SelectFromList("CalenderDate_XPATH", sheetname, "Date");
		
		Thread.sleep(2000);
		CommonMethods.input("PAN_XPATH", sheetname, "PAN", 1);
	}

}
