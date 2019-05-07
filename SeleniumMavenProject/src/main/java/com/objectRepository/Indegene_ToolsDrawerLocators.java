package com.objectRepository;

import org.openqa.selenium.By;

public class Indegene_ToolsDrawerLocators {
	// Home Page Locators
	//public By hamburger=By.xpath("(//XCUIElementTypeButton)[1]");
	public By hamburger=By.xpath("//XCUIElementTypeButton[@name='ic view headline']");
	public By logout=By.xpath("//XCUIElementTypeStaticText[@name='Logout']");
	public By logoutYes=By.xpath("//XCUIElementTypeButton[@label='YES']");
	public By back=By.xpath("//XCUIElementTypeButton[@name='Back']");
	// Tool Drawer Locators
	public By accounts=By.xpath("//XCUIElementTypeStaticText[@name='Accounts']");
	public By calendar=By.xpath("//XCUIElementTypeStaticText[@name='Calendar']");
	public By callPlans=By.xpath("//XCUIElementTypeStaticText[@name='Call Plans']");
	//public By contacts=By.xpath("//XCUIElementTypeStaticText[@name='Customers']");
	public By contacts=By.xpath("//XCUIElementTypeStaticText[@name='Contacts']");
	public By presentations=By.xpath("//XCUIElementTypeStaticText[@name='Presentations']");
	public By timeOff=By.xpath("//XCUIElementTypeStaticText[@name='Time Off']");
	public By analytics=By.xpath("//XCUIElementTypeStaticText[@name='Analytics']");
	public By settings=By.xpath("//XCUIElementTypeStaticText[@name='Settings']");
	public By presenterName(String name) {
	return	By.xpath("//XCUIElementTypeStaticText[@name='"+name+"']");
	}
	
	public By accountname=By.xpath("(//XCUIElementTypeStaticText[@name='Account Name'])[1]");
	public By address=By.xpath("(//XCUIElementTypeStaticText[@name='MeetingDetailTableHeaderFooterViewTitleLabels'])[3]");
	public By ogeenee=By.xpath("//XCUIElementTypeButton[@name='io genee']");
	 
	public By presenterStatus=By.xpath("(//XCUIElementTypeStaticText)[@name='Status']");
	public By presenterPosition=By.xpath("//XCUIElementTypeStaticText[@name='AutomationPosition']");
	public By presenterLastSyncTime=By.xpath("(//XCUIElementTypeStaticText)[12]");
	// Accounts Screen
	public By searchbutton=By.xpath("//XCUIElementTypeButton[@name='Search']");
	public By searchField=By.xpath("//XCUIElementTypeSearchField[@name='Search']");
	public By accountHeader=By.xpath("//XCUIElementTypeOther[@name='Accounts']");
	public By nothingSelectedTxt=By.xpath("//XCUIElementTypeStaticText[@name='Nothing selected.']");
	public By accountNames=By.xpath("//XCUIElementTypeCell/XCUIElementTypeStaticText");
	public By accountNames1(String name) {
		return	By.xpath("//XCUIElementTypeStaticText[@name='"+name+"']");
		}
	// Contacts Screen
	public By newActivityButton=By.xpath("//XCUIElementTypeButton[@name= 'Search']/following-sibling::XCUIElementTypeButton");
	public By newContactButton=By.xpath("//XCUIElementTypeButton[@name='New']");
	// Calendar Screen
	public By Search=By.xpath("//XCUIElementTypeButton[@label= 'Search']");
	public By dayViewCalender=By.xpath("//XCUIElementTypeButton[@name='Day']");
	//Settings Screen
	public By calenderSettings=By.xpath("(//XCUIElementTypeStaticText[@name='Calendar'])[2]");
	public By remoteMeetingSettings=By.xpath("//XCUIElementTypeStaticText[@name='Remote Meeting']");
	public By meSettings=By.xpath("//XCUIElementTypeStaticText[@name='Me']");
	public By languageSettings=By.xpath("//XCUIElementTypeStaticText[@name='Language']");
	public By positionSettings=By.xpath("//XCUIElementTypeStaticText[@name='Position']");
	public By resetPasswordSettings=By.xpath("//XCUIElementTypeStaticText[@name='Reset Password']");
	public By storageSettings=By.xpath("//XCUIElementTypeStaticText[@name='Storage']");
	//Presentation Screen
	public By selectPresent=By.xpath("//XCUIElementTypeButton[@label='Select']");
	public By titlePresent=By.xpath("//XCUIElementTypeButton[@label='Title']");
	public By dropDownPresentation=By.xpath("//XCUIElementTypeButton[@name='drop down']");
	public By changeViewPresent=By.xpath("//XCUIElementTypeButton[@name='ic view list']");
	public By tool(String toolname) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+toolname+"']"); 
	}
	/* 
	(//XCUIElementTypeOther)[29] : gene
	(//XCUIElementTypeOther)[53]
	
	
	/* 
	public  By searchFld = By.xpath("//XCUIElementTypeSearchField");
	public  By cancel = By.xpath("//XCUIElementTypeButton[@label='Cancel']");
	public  By names = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeText");
	public  By fvrtbtn = By.xpath("//XCUIElementTypeButton[@label='Favorite']");
	public  By dwnldbtn = By.xpath("//XCUIElementTypeButton[@label='Download']");
	public  By unFvrtbtn = By.xpath("//XCUIElementTypeButton[@label='Un-Favorite']");
	public  By unDwnldbtn = By.xpath("//XCUIElementTypeButton[@label='Un-Download']");
	public  By done = By.xpath("//XCUIElementTypeButton[@label='Done']"); */
	public  By Presentation(int index) {
		return By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell["+index+"]");
	}
	public  By favIcn(int index) {
		return By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell["+index+"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeImage[2]");
	} 
	public  By dwnldIcn(int index) {
		return By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell["+index+"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther");
	}

	
		  
	

}
