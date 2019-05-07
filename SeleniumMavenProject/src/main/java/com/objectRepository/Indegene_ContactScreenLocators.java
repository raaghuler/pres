package com.objectRepository;

import org.openqa.selenium.By;

public class Indegene_ContactScreenLocators {
	// Contact Screen Locators
	public By contact(String name) {
	return By.xpath("//XCUIElementTypeStaticText[@label='"+name+"']");
	}
	public By infoTab=By.xpath("//XCUIElementTypeStaticText[@name='Info']");
	public By profileTab=By.xpath("//XCUIElementTypeStaticText[@name='Profile']");
	public By timelineTab=By.xpath("//XCUIElementTypeStaticText[@name='Timeline']");
	public By consentsTab=By.xpath("//XCUIElementTypeStaticText[@label='Consents']");
	public By titleContact=By.xpath("//XCUIElementTypeStaticText[@name='Title']");
	public By firstName=By.xpath("//XCUIElementTypeStaticText[@name='First Name']");
	public By lastname=By.xpath("//XCUIElementTypeStaticText[@name='Last Name']");
	public By primaryEmail=By.xpath("//XCUIElementTypeStaticText[@label='Primary Email Address']");
	public By otherEmail=By.xpath("//XCUIElementTypeStaticText[@label='Other Email Addresses']");
	public By businessPhone=By.xpath("//XCUIElementTypeStaticText[@name='Business Phone']");
	public By mobilePhone=By.xpath("//XCUIElementTypeStaticText[@name='Mobile Phone']");
	public By preferredLanguage=By.xpath("//XCUIElementTypeStaticText[@name='Preferred Language']");
	public By primarySpeciality=By.xpath("//XCUIElementTypeStaticText[@name='Primary Speciality']");
	public By speaker=By.xpath("//XCUIElementTypeStaticText[@name='Speaker']");
	public By kolContact=By.xpath("//XCUIElementTypeStaticText[@name='KOL']");
	public By addresses=By.xpath("(//XCUIElementTypeStaticText[@name='MeetingDetailTableHeaderFooterViewTitleLabels'])[3]");
	
	
}
