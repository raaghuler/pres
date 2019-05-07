package com.mobileUtilities_Android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import io.appium.java_client.android.AndroidDriver;

public class Listener_Android implements IInvokedMethodListener{

	  @SuppressWarnings("unchecked")
	@Override
	    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	        if (method.isTestMethod()) {
	            String browserName = method.getTestMethod().getXmlTest().getLocalParameters().get("browserName");
	            AndroidDriver<WebElement> driver = null; 
				try {
					driver = (AndroidDriver<WebElement>) AndroidMobileCapabilities.launchApp();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ThreadLocalAndroidDriver.setWebDriver(driver);
	        }
	    }
	 
	    @Override
	    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
	        if (method.isTestMethod()) {
	        	@SuppressWarnings("unchecked")
				AndroidDriver<WebElement> driver = (AndroidDriver<WebElement>) ThreadLocalAndroidDriver.getDriver();
	            if (driver != null) {
	              //  driver.quit();
	            }
	        }
	    }



}
