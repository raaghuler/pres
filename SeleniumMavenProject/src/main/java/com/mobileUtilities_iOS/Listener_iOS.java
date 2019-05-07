package com.mobileUtilities_iOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Listener_iOS implements IInvokedMethodListener{

	  @SuppressWarnings("unchecked")
	@Override
	    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	        if (method.isTestMethod()) {
	            String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
	            IOSDriver<WebElement> driver = null; 
				try {
					driver = (IOSDriver<WebElement>) IOSMobileCapabilities.launchApp();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ThreadLocaliOSDriver.setWebDriver(driver);
	        }
	    }
	 
	    @Override
	    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
	        if (method.isTestMethod()) {
	        	@SuppressWarnings("unchecked")
	        	IOSDriver<WebElement> driver = (IOSDriver<WebElement>) ThreadLocaliOSDriver.getDriver();
	            if (driver != null) {
	              //  driver.quit();
	            }
	        }
	    }



}
