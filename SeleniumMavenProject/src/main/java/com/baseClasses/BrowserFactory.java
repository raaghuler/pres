package com.baseClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
	public static String browser;
	
/*	BrowserFactory(String name){
		browser=name;
	}*/
	
	public static WebDriver openBrowser(String browserName) {
		WebDriver driver = null;
	        if (browserName.toLowerCase().contains("firefox")) {
	            driver = new FirefoxDriver();
	            browser="Firefox";
	            return driver;
	        }
	        if (browserName.toLowerCase().contains("internet")) {
	            driver = new InternetExplorerDriver();
	            browser="IE";
	            return driver;
	        }
	        if (browserName.toLowerCase().contains("chrome")) {
	        	System.setProperty("webdriver.chrome.driver", "/Users/jayaswi_guest/Desktop/IndegeneAutomation18thJan2019/lib/chromedriver.exe");
	            driver = new ChromeDriver();	
	            browser="Google Chrome";
	            System.out.println("browser   :::::::"+browser);
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            return driver;
	        }
           if(browserName.toLowerCase().contains("safari")) {
        	 driver = new SafariDriver();
   			 driver.manage().window().maximize();
   			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   			return driver;
           }
	        return driver;
	    }
	

	}
