package com.objectRepository;

import org.openqa.selenium.By;

public class Indegene_BrowserLocators {
	
	public By continueButtonInJoinMeeting = By.xpath("(//button[@class='button button-ios button-default button-default-ios'])[1]");
	public By meetingParticantName = By.xpath("//XCUIElementTypeStaticText[@name='Brijesh Bodla']");
	//public By continueButton = By.xpath("(//span[text()='Continue'])[1]");
	public By continueButton = By.xpath("(//span[text()='Continue'])");
	public By participantSelectButton = By.xpath("(//button[@class=\"item-cover item-cover-ios item-cover-default item-cover-default-ios\"])");
	//public By continueButtonInChooseParticant = By.xpath("(//button[@class='btnWidth button button-ios button-default button-default-ios'])[1]");
	public By continueButtonInChooseParticant = By.xpath("(//span[text()='Continue'])[1]");
	//public By sharingText = By.xpath("//XCUIElementTypeStaticText[@name='Sharing will start shortly']");
	public By sharingText=By.xpath("//html/body/ion-app/ng-component/ion-nav/page-meeting/ion-content/div[2]/ion-grid/ion-row/ion-col[2]/welcome/ion-row/ion-col/div/p[2]");
	public By guestNameField1 = By.xpath("(//input[@placeholder='Please enter your name'][@aria-labelledby='lbl-0'])");
	public By guestNameField = By.xpath("(//input[@aria-labelledby='lbl-0'][@placeholder='Please enter your name'])");
	public By remotescreen = By.xpath("//h3[text()='Connected as: ']");
	public By slidecontent(int slideno) {
	return By.xpath("(//div[@id='slideslideIface"+slideno+"'])");
	}
	public By userName = By.xpath("(//input[@aria-labelledby='lbl-0'][@placeholder='Enter name here'])");
	public By slidecontentcss(int slideno) {
		return By.cssSelector("css=tspan:contains("+slideno+")");
		}
	
	public By slidecontent1(int slideno) {
		return By.xpath("(//*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='text' and @ font-size='8.25pt']/*[text()="+slideno+"])");
		}
	
	//public By slidecontent = By.id("slideslideIface11");
	public By slideContentCS=By.cssSelector("//div[@name='slide']");
	//public By slidecontent(String slidenum) {
	//	return By.xpath("//div[@id='slideslideIface'"+slidenum+"')");
}
