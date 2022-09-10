package com.crm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;

public class BasicDetailsOne extends SetUp
{
	
	public static Logger log =LogManager.getLogger(BasicDetailsOne.class.getName());

	public void BasicDetails1(String sheetname) throws Exception
	{
		CommonMethods.input("FirstName_XPATH", sheetname, "FirstName", 1);
		CommonMethods.input("LastName_XPATH", sheetname, "LastName", 1);
		CommonMethods.input("PinCode_XPATH", sheetname, "PinCode", 1);
		CommonMethods.Click("PinList_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("Email_XPATH", sheetname, "EmailId", 1);
		CommonMethods.input("MobileNo_XPATH", sheetname, "MobileNumber", 1);
		Thread.sleep(2000);
		CommonMethods.highLight("Basic1Consent_XPATH");
		CommonMethods.mouseClick("Basic1Consent_XPATH");
		CommonMethods.Click("ProceedBtn_XPATH");
	
	}
	
	
}
