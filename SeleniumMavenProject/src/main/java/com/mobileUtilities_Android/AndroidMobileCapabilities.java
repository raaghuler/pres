package com.mobileUtilities_Android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidMobileCapabilities {
	 static  AndroidDriver<WebElement> launchApp() throws Exception {
		  		DesiredCapabilities dc;
		  		AndroidDriver<WebElement> driver = null;	  
	       // if (browserName.toLowerCase().contains("android")) {
	          	dc= new DesiredCapabilities();
	    		//dc.setCapability("deviceName","CNU4399N1B");
	          	dc.setCapability("deviceName","5200a8f1b4825559");
	    		dc.setCapability("platformVersion", "8.0.0");
	    		dc.setCapability("platformName","Android");
	    		dc.setCapability("automationName", "UiAutomator2");
	    	/*	dc.setCapability("autoWebview", true);
	    		dc.setCapability("appWaitActivity",(String) null);
	    		dc.setCapability("takesScreenshot", true);*/
	    		dc.setCapability("appPackage", "com.omnipresence.io");
	    		dc.setCapability("appActivity", "com.omnipresence.io.MainActivity");
	    	/*	dc.setCapability("appPackage", "com.tv.v18.viola");
	    		dc.setCapability("appActivity", "com.mixpanel.android.surveys.SurveyActivity");*/
	    	/*	dc.setCapability("appPackage", "com.android.chrome");
	    		dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");*/
	       //	dc.setCapability("newCommandTimeout", "120000");
	    	//	dc.setCapability("chromedriverExecutable", "D:\\DNB\\lib\\chromedriver.exe");
	    	//	dc.setCapability("browserName", "Chrome");
	    	//	dc.setCapability("launchTimeout", "100000");
	    	//	dc.setCapability("appPackage", "com.motionappsworld.magmahdi");
	    	//	dc.setCapability("appActivity", "com.motionappsworld.magmahdi.activity.MainActivity");
	    /*		dc.setCapability("newCommandTimeout", "120000");
	    		dc.setCapability("resetKeyboard", true);
	    		dc.setCapability("unicodeKeyboard", true);*/
	    		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	            return driver;
	      //  }

	    }
}
