package com.objectRepository;

import org.openqa.selenium.By;

public class Indegene_LoginPageLocators {
	
			public By username=By.xpath("//XCUIElementTypeTextField");
			public By enterPasswordText = By.xpath("//XCUIElementTypeStaticText[@name='Enter password']");
			public By password(String username) {
			return By.xpath("//XCUIElementTypeSecureTextField[@name='Enter the password for "+username+"']");
			}
			public By signIn=By.xpath("//XCUIElementTypeButton[@name='Sign in']");
			public By rememberCheckBox=By.xpath("//android.widget.CheckBox[@text='Remember me']");
			public By rememberMeText=By.xpath("//XCUIElementTypeButton[@name='Remember Me']");
			public By submitButton = By.xpath("//XCUIElementTypeButton[@name='Submit']");
			public By forgotPassword=By.xpath("//XCUIElementTypeStaticText[@name='Forgot my password']");
			public By pleaseSelectYourInstanceBelow=By.xpath("//XCUIElementTypeStaticText[@label='Please select your instance below.']");
			public By qaInstance=By.xpath("(//XCUIElementTypeButton[@name='ic radio button unchecked'])[1]");
			public By continueInstance=By.xpath("//XCUIElementTypeButton[@name='Continue']");
			public By passwordField=By.xpath("//XCUIElementTypeSecureTextField[@name='Enter the password for qauser6@omnipresence.io']");
			
			
		
			
}
