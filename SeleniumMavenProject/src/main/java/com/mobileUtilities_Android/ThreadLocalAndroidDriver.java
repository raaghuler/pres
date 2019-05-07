package com.mobileUtilities_Android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalAndroidDriver {

	 private static ThreadLocal<AndroidDriver<WebElement>> webDriver = new ThreadLocal<AndroidDriver<WebElement>>();
	 
	    public static AndroidDriver<WebElement> getDriver() {
	        return webDriver.get();
	    }
	 
	    @SuppressWarnings("unchecked")
		static void setWebDriver(WebDriver driver) {
	        webDriver.set((AndroidDriver<WebElement>) driver);
	    }


}
