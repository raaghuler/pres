package com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.baseClasses.PDFResultReport;
import com.mobileUtilities_iOS.BaseClass_iOS;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.Indegene_ContactScreenLocators;
import com.objectRepository.Indegene_LoginPageLocators;
import com.objectRepository.Indegene_ToolsDrawerLocators;

public class Indegene_ContactScreen_Components extends BaseClass_iOS{
	public Indegene_ToolsDrawerLocators toolsdrawerlocators=new Indegene_ToolsDrawerLocators();
	public Indegene_ContactScreenLocators  contactscreenlocators=new Indegene_ContactScreenLocators();
	
	public Indegene_ContactScreen_Components(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	//public void selectMeeting() throws Exception{
	public void verifySearchFunctionalityInAccountScreen_TC8() throws Exception{
		try{
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger, 15);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.accounts);
		    click(toolsdrawerlocators.searchField);
		    set(toolsdrawerlocators.searchField,pdfResultReport.testDataValue.get("Meetingname"));
		    click(toolsdrawerlocators.presenterName(pdfResultReport.testDataValue.get("Meetingname")));
		    verifyElement(toolsdrawerlocators.accountname,"accountname");
		    verifyElement(toolsdrawerlocators.address,"address"); 
			pdfResultReport.addStepDetails("Verify Search Functionality In Account Screen_TC8","Application should Search contact in Account Screen","Successfully displayed searched contact in Account Screen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate searchFunctionalityContactScreen_TC8"+e.getMessage());
			  pdfResultReport.addStepDetails("Verify Search Functionality In Account Screen_TC8","Application should Search contact in Account Screen","Unable to display the searched contact in Account Screen","Fail", "N");
		  }
	}
	
	public void verifySearchFunctionalityInContactScreen_TC9() throws Exception{
		try{
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger, 15);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.contacts);		
		    set(toolsdrawerlocators.searchField,pdfResultReport.testDataValue.get("Contactname1"));
		    verifyElement(toolsdrawerlocators.presenterName(pdfResultReport.testDataValue.get("Contactname1")),"pdfResultReport.testDataValue.get('Contactname1')");
		    set(toolsdrawerlocators.searchField,"");   		    
		    verifyElement(toolsdrawerlocators.presenterName(pdfResultReport.testDataValue.get("Todetails")),"pdfResultReport.testDataValue.get('Todetails')");
			pdfResultReport.addStepDetails("Verify Search and Clear Functionality In Contact Screen_TC9","Application should Search and Clear provided contact in Contact Screen","Successfully Searched and Cleared the contact in ContactScreen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate searchFunctionalityContactScreen"+e.getMessage());
			  pdfResultReport.addStepDetails("Verify Search Functionality In Contact Screen_TC9","Application should Search and Clear contact in Contact Screen","Unable to Search and Clear the contact in Contact Screen","Fail", "N");
		  }
	}
	public void validateContactScreenTabs_TC10() throws Exception{
        	//  This Test case Is Depends on  searchFunctionalityContactScreen_TC9()
		try{
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger, 15);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.contacts);
			click(contactscreenlocators.contact(pdfResultReport.testDataValue.get("Contactname1")));
			verifyElement(contactscreenlocators.infoTab,"Info tab In Contacts Screen");
			verifyElement(contactscreenlocators.profileTab,"Profile tab In Contacts Screen");
			verifyElement(contactscreenlocators.timelineTab,"TimeLine Tab In Contacts Screen");		
			pdfResultReport.addStepDetails("validate Contact Screen Tabs_TC10","Application should display the available tabs in ContactScreen","Successfully displayed all the Tabs in Contact Screen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validateContactScreenTabs_TC10"+e.getMessage());
			  pdfResultReport.addStepDetails("validateContactScreenTabs_TC10","Application should displaying the available Tabs in ContactScreen","Unable to display the Tabs in Contact Screen","Fail", "N");
		  }
	}
	
	public void validateContactScreenInfoTab_TC11() throws Exception{
		//  This Test case Is Depends on validateContactScreenTabs_TC10()
		try{
			verifyElement(contactscreenlocators.titleContact,"Title Field In Contacts Screen");
			verifyElement(contactscreenlocators.firstName,"firstName In Contacts Screen");
			verifyElement(contactscreenlocators.lastname,"lastname In Contacts Screen");
			verifyElement(contactscreenlocators.primaryEmail,"primaryEmail In Contacts Screen");
			verifyElement(contactscreenlocators.otherEmail,"otherEmail In Contacts Screen");
			verifyElement(contactscreenlocators.businessPhone,"businessPhone In Contacts Screen");
			verifyElement(contactscreenlocators.mobilePhone,"mobilePhone In Contacts Screen");
			verifyElement(contactscreenlocators.preferredLanguage,"preferredLanguage In Contacts Screen");
			verifyElement(contactscreenlocators.primarySpeciality,"primarySpeciality In Contacts Screen");
			verifyElement(contactscreenlocators.speaker,"speaker In Contacts Screen");
			verifyElement(contactscreenlocators.kolContact,"kolContact In Contacts Screen");
			verifyElement(contactscreenlocators.addresses,"addresses In Contacts Screen");	
			pdfResultReport.addStepDetails("validate Contact Screen Info Tabs_TC11","Application should display the fields in Contact Screen Info Tab","Successfully displayed all the fields in Contact Screen Info Tab","Pass", "Y");
			click(toolsdrawerlocators.back);
		}catch(Exception e){
			  log.fatal("Unable to validate validateContactScreen_TC11"+e.getMessage());
			  pdfResultReport.addStepDetails("validate Contact Screen Info Tabs_TC11","Application should displaying the fields in Contact Screen Info Tab","Unable to display the fields in ContactScreen Info Tab","Fail", "N");
		  }
	}
	}
