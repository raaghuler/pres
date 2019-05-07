package com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.internal.TestMethodWithDataProviderMethodWorker;

import com.baseClasses.PDFResultReport;
import com.mobileUtilities_Android.BaseClass_Android;
import com.mobileUtilities_iOS.BaseClass_iOS;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.Indegene_LoginPageLocators;
import com.objectRepository.Indegene_ToolsDrawerLocators;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;

public class Indegene_LoginPage_Components extends BaseClass_Android{
	public Indegene_LoginPageLocators loginPageLocators=new Indegene_LoginPageLocators();
	public Indegene_ToolsDrawerLocators toolsdrawerlocators=new Indegene_ToolsDrawerLocators();
	
	public Indegene_LoginPage_Components(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	public void validateLoginPage_TC1() throws Exception{
		try{
			System.out.println("00000000000000000000000000000000000000000000000000000000000000000001");
			click(loginPageLocators.rememberCheckBox);
			System.out.println("Executing the method validateLoginPage_TC1");
			verifyElement(loginPageLocators.username,"Username");
			verifyElement(loginPageLocators.rememberCheckBox,"rememberCheckBox");
			verifyElement(loginPageLocators.rememberMeText,"rememberMe text");
			verifyElement(loginPageLocators.submitButton,"submitButton");	
			pdfResultReport.addStepDetails("Validate the fields in Login Page","Application should display the fields in login page","Successfully displayed all the fields in login Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  System.out.println(e.getMessage());
			  pdfResultReport.addStepDetails("Validate the fields in Login Page","Application should display the fields in login page","Unable to display the fields in login Page","Fail", "N");
		  }
	}
	
	
	public void validatePasswordPage_TC1a() throws Exception {
		try {
			waitForElement(loginPageLocators.enterPasswordText,5);
			verifyElement(loginPageLocators.enterPasswordText,"enter password text");
			verifyElement(loginPageLocators.password(pdfResultReport.testDataValue.get("Username")),"Password text field");
			verifyElement(loginPageLocators.signIn,"SignIn button");
			verifyElement(loginPageLocators.forgotPassword,"ForgotPassword text");
			pdfResultReport.addStepDetails("Validate the fields in Password Page","Application should display the fields in Password page","Successfully displayed all the fields in Password Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate the fields in Password Page","Application should display the fields in Password page","Unable to display the fields in Password Page","Fail", "N");
		  }
		
	}
	
	public void verifyLoginUsername_TC2() throws Exception{
		try{
			System.out.println("Executing the method verifyLoginUsername_TC2");
			click(loginPageLocators.username);
		    set(loginPageLocators.username, pdfResultReport.testDataValue.get("Username"));
		    ThreadLocaliOSDriver.getDriver().hideKeyboard();
			click(loginPageLocators.submitButton);
			try {
				pdfResultReport.addStepDetails("Verify login with Username","Application should allow the User name screen","Successfully loggedin with the Username ","Pass", "Y");
			} catch (Exception e) {
				pdfResultReport.addStepDetails("Verify login with Username","Application should allow the User name screen","Unable to Login with the Username","Fail", "N");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("Verify login with Username","Application should allow the User name screen","Unable to Login with the Username","Fail", "N");
		  }
	}
	
	
	public void VerifyLoginPassword_TC2a() throws Exception{
		try{
			System.out.println("Executing the method VerifyLoginPassword_TC2a");
			click(loginPageLocators.password(pdfResultReport.testDataValue.get("Username")));
			set(loginPageLocators.password(pdfResultReport.testDataValue.get("Username")), pdfResultReport.testDataValue.get("Password"));
			ThreadLocaliOSDriver.getDriver().hideKeyboard();
			click(loginPageLocators.signIn);
			waitForElement(toolsdrawerlocators.hamburger,25);
			pdfResultReport.addStepDetails("Verify Password Functionality","User should login to the application","Successfully logged into the application","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("Verify Password Functionality","User should login to the application","Unable to login to the application","Fail", "N");
		  }
	}
	
	
	
	public void selectInstance_TC2b() throws Exception{
		try{
			click(loginPageLocators.qaInstance);
			click(loginPageLocators.continueInstance);
			pdfResultReport.addStepDetails("selectInstance_TC2b","Application should click on QA instance","Successfully clicked on QA instance","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to open the URL"+e.getMessage());
			  pdfResultReport.addStepDetails("selectInstance_TC2b","Application should click on QA instance","Unable to click on QA instance","Fail", "N");
		  }
	}
}
