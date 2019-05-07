package com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.baseClasses.PDFResultReport;
import com.mobileUtilities_iOS.BaseClass_iOS;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.Indegene_ContactScreenLocators;
import com.objectRepository.Indegene_LoginPageLocators;
import com.objectRepository.Indegene_ToolsDrawerLocators;

public class Indegene_AccountScreen_Components extends BaseClass_iOS{
	public Indegene_ToolsDrawerLocators toolsdrawerlocators=new Indegene_ToolsDrawerLocators();
	public Indegene_ContactScreenLocators  contactscreenlocators=new Indegene_ContactScreenLocators();
	
	public Indegene_AccountScreen_Components(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	public void searchFunctionalityAccountScreen_TC12() throws Exception{
		try{
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger, 10);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.accounts);
				
		    set(toolsdrawerlocators.searchField,"Search Field In Account Screen");
		    set(toolsdrawerlocators.searchField,"");
		    
		    
			pdfResultReport.addStepDetails("searchFunctionalityContactScreen_TC9","Application should Search contact in ContactScreen","Successfully displayed searched contact in ContactScreen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate searchFunctionalityContactScreen_TC9"+e.getMessage());
			  pdfResultReport.addStepDetails("searchFunctionalityContactScreen_TC9","Application should Search contact in ContactScreen","unable to display the searched contact in ContactScreen","Fail", "N");
		  }
	}
	public void validateContactScreenTabs_TC10() throws Exception{
        	//  This Test case Is Depends on  searchFunctionalityContactScreen_TC9()
		try{
			click(toolsdrawerlocators.back);
			//waitForElement(toolsdrawerlocators.hamburger, 10);
			Thread.sleep(3000);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.contacts);
			click(contactscreenlocators.contact(pdfResultReport.testDataValue.get("Contactname1")));
			verifyElement(contactscreenlocators.infoTab,"Info tab In Contacts Screen");
			verifyElement(contactscreenlocators.profileTab,"Profile tab In Contacts Screen");
			verifyElement(contactscreenlocators.timelineTab,"TimeLine Tab In Contacts Screen");
			verifyElement(contactscreenlocators.consentsTab,"Consents Tab In Contacts Screen");
			
			pdfResultReport.addStepDetails("validateContactScreenTabs_TC10","Application should display the Tabs in ContactScreen","Successfully displayed all the Tabs in ContactScreen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validateContactScreenTabs_TC10"+e.getMessage());
			  pdfResultReport.addStepDetails("validateContactScreenTabs_TC10","Application should display the Tabs in ContactScreen","unable to display the Tabs in ContactScreen","Fail", "N");
		  }
	}
	public void validateContactScreenInfoTab_TC11() throws Exception{
		//  This Test case Is Depends on  validateContactScreenTabs_TC10()
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
			
			pdfResultReport.addStepDetails("validateContactScreen_TC11","Application should display the fields in ContactScreen Info Tab","Successfully displayed all the fields in ContactScreen Info Tab","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validateContactScreen_TC11"+e.getMessage());
			  pdfResultReport.addStepDetails("validateContactScreen_TC11","Application should display the fields in ContactScreen Info Tab","unable to display the fields in ContactScreen Info Tab","Fail", "N");
		  }
	}
	}
