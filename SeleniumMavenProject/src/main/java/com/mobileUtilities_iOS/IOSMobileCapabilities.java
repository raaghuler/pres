 package com.mobileUtilities_iOS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

	
public class IOSMobileCapabilities {
	 public  static IOSDriver<WebElement> driver = null;
	 static  IOSDriver<WebElement> launchApp() throws Exception {
		  		DesiredCapabilities cap;
		  		  
		  		cap= new DesiredCapabilities();
		  		
		  		//iPadmini	    		
	        	cap.setCapability("deviceName","Ind-Ipad-TPCE-286");
	        	cap.setCapability("platformName","iOS");
	    		cap.setCapability("platformVersion","11.4");
	        	//cap.setCapability("platformVersion","11.4.1"); //cigniti ipad
	    		cap.setCapability("udid","3b9ad37a8f6c40251a97fee65d7f3b4ed329089c");	    		
	    		//cap.setCapability("udid","5e37a5abe0335711d9cb1f96795f54e533e88ec7");//cigniti  ipad
	    		cap.setCapability("bundleId","com.indegene.cystine");
	    		cap.setCapability("simpleIsVisibleCheck", false);
	    		cap.setCapability("automationName","XCUITest");
	    		cap.setCapability("noReset", true);
	    		cap.setCapability("xcodeOrgId","Y3NJCH39A2");
	    		cap.setCapability("xcodeSigningId", "iPhone Developer");
	
	    		cap.setCapability("newCommandTimeout", "100000");
	    		driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	    return driver;
	        }

	    }

