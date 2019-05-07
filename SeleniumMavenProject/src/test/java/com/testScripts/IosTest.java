package com.testScripts;

import org.testng.annotations.Test;

import com.baseClasses.ThreadLocalWebdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;

public class IosTest {
	
    @Test
	public void testingsim() throws MalformedURLException, InterruptedException {
    	WebDriver driver=new SafariDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver = new SafariDriver();
		 driver.manage().window().maximize();
    	driver.get("http://google.co.in"); 
    	driver.quit();

    	
    }
}
