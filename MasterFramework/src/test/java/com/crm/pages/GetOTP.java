package com.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;

public class GetOTP extends SetUp
{
	public static Logger log =LogManager.getLogger(GetOTP.class.getName());
	
	public void GetingOTP(String Sheetname, int rowNum) throws Exception
	{
		driver.get("https://crmmobileuat.kotak.com/sn/app/Widget/RenderWidget?x=6negmvntcw2bf3gmm3xhvv3nmdn4s5588sf3pdwaa58h3mlmayha&winpop=1");
		//CommonMethods.input("", Sheetname, "GetOTP URL", 1);
		CommonMethods.input("Username_XPATH", Sheetname, "Username", 1);
		CommonMethods.input("password_XPATH", Sheetname, "Password", 1);
		CommonMethods.highLight("loginBtn_XPATH");
		CommonMethods.Click("loginBtn_XPATH");
	    driver.navigate().refresh();
	    CommonMethods.highLight("EnterMNumber_XPATH");
	    CommonMethods.input("EnterMNumber_XPATH", Sheetname, "MNumber", 1);
	    CommonMethods.highLight("Fetch_XPATH");
	    CommonMethods.Click("Fetch_XPATH");
	    CommonMethods.highLight("OTPcode_XPATH");
	    String OTPCode= CommonMethods.getElementText("OTPcode_XPATH");
	    ExcelOperation.setCellData(Sheetname, "OTP", 1, OTPCode);
	}

}
