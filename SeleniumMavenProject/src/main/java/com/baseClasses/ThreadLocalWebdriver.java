package com.baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ThreadLocalWebdriver {
	 public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	 
	    public static WebDriver getDriver() {
	        return webDriver.get();
	    }
	 
		public static void setWebDriver(WebDriver driver1) {
	        webDriver.set(driver1);
	    }
		
}
