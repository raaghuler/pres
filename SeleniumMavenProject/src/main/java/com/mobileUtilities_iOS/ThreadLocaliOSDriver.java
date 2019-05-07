package com.mobileUtilities_iOS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class ThreadLocaliOSDriver {

	 private static ThreadLocal<IOSDriver<WebElement>> webDriver = new ThreadLocal<IOSDriver<WebElement>>();
	 
	    public static IOSDriver<WebElement> getDriver() {
	        return webDriver.get();
	    } 	    
		static void setWebDriver(WebDriver driver) {
	        webDriver.set((IOSDriver<WebElement>) driver);
	    }

	
		
		 
}
