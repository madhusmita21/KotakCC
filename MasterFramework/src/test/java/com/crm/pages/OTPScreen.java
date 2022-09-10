package com.crm.pages;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;

public class OTPScreen extends SetUp
{
	public ExcelOperation excelop;



	   public void OTP(String sheetName) throws Exception
	    {
	        CommonMethods.highLight("MNumber_XPATH");
	        String MNumber= CommonMethods.getElementText("MNumber_XPATH");
	        //return MNumber;
	        ExcelOperation.setCellData(sheetName, "MNumber", 1, MNumber);
	    }
	    public void SubmitOTP(String sheetName) throws Exception
	    {
	        CommonMethods.input("OTP_XPATH", sheetName, "OTP", 1);
	        CommonMethods.highLight("SubmitBtn_XPATH");
	        CommonMethods.Click("SubmitBtn_XPATH");
	    }
	}


