package com.crm.testCases;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.BasicDetailTwo;
import com.crm.pages.BasicDetailsOne;
import com.crm.pages.CardSelection;
import com.crm.pages.GetOTP;
import com.crm.pages.HtmlURLLaunch;
import com.crm.pages.LoginPage;
import com.crm.pages.OTPScreen;
import com.crm.pages.ProductDiscovery;

public class TC02NTBUnsecuredUnassisted extends SetUp{
  
	//public classname variable
	public HtmlURLLaunch h;
	public ProductDiscovery p;
	public CardSelection c;
	public BasicDetailsOne b;
	public GetOTP o;
	public OTPScreen otp;
	public BasicDetailTwo b2;
	
	@Test
  public void NTBUnsecuredUnassisted() throws Exception
  {
	  
	  String sheetName = "NTBUnsecuredUnassisted";
	  
		 //To check  testcase runmode from excel (Yes/No) if yes then launch Browser and execute script
		  if (!(CommonMethods.isTestRunnable("NTBUnsecuredUnassisted",sheetName))) {

				throw new SkipException(
						"Skipping the test NTBUnsecuredUnassisted as the Run mode is NO");
			}
		   		
		 //Creating object for HtmlURLLaunch Class 
		  h=new HtmlURLLaunch();
		  h.HtmlUrlLaunched();
		  
		  p=new ProductDiscovery();
		  p.ProductPreference();
		  
		  c=new CardSelection();
		  c.CardSelect();
		  
		  b=new BasicDetailsOne();
		  b.BasicDetails1(sheetName);
		  
		  otp=new OTPScreen();
          otp.OTP(sheetName);
          
          CommonMethods.switchtoTab();
          
          o=new GetOTP();
		  o.GetingOTP(sheetName, 0);
		  
		  //CommonMethods.switchToParentWin();
		  
		  CommonMethods.switchToWindow();
		  
		  //driver.switchTo().window(tabs.get(0));
          
          otp.SubmitOTP(sheetName);
          
          b2=new BasicDetailTwo();
          b2.BasicDetail2(sheetName);
          
          
  }
}
