package com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.baseClasses.PDFResultReport;
import com.mobileUtilities_iOS.BaseClass_iOS;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.Indegene_LoginPageLocators;
import com.objectRepository.Indegene_ToolsDrawerLocators;

public class Indegene_ToolsDrawer_Components extends BaseClass_iOS{
	public Indegene_ToolsDrawerLocators toolsdrawerlocators=new Indegene_ToolsDrawerLocators();
	public Indegene_LoginPageLocators loginPageLocators=new Indegene_LoginPageLocators(); 
	public Indegene_ToolsDrawer_Components(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	public void validateToolsDrawerMenuOptions_TC3() throws Exception{
		try{
			waitForElement(toolsdrawerlocators.hamburger,35);
			click(toolsdrawerlocators.hamburger);
			verifyElement(toolsdrawerlocators.accounts,"Accounts");
			verifyElement(toolsdrawerlocators.calendar,"Calender ");
			verifyElement(toolsdrawerlocators.callPlans,"Call Plans");
			verifyElement(toolsdrawerlocators.contacts,"Contacts");
			verifyElement(toolsdrawerlocators.presentations,"Presentations");
			verifyElement(toolsdrawerlocators.timeOff,"Time Off");
			verifyElement(toolsdrawerlocators.analytics,"Analytics");
			verifyElement(toolsdrawerlocators.presenterStatus,"Presenter Status");
			verifyElement(toolsdrawerlocators.presenterName(pdfResultReport.testDataValue.get("Contactname2")),"Presenter Name");
			verifyElement(toolsdrawerlocators.presenterPosition," Presenter position");
			verifyElement(toolsdrawerlocators.presenterLastSyncTime,"Presenter last Sync Time");
			verifyElement(toolsdrawerlocators.logout,"Logout Option");	
			pdfResultReport.addStepDetails("validate Tools Drawer Menu Options_TC3","Application should display all the fields in Tools Drawer","Successfully displayed all the fields in Tools Drawer","Pass", "Y");	
		}catch(Exception e){
			  log.fatal("Unable to Validate validateToolsDrawerMenuOptions_TC3"+e.getMessage());
			  pdfResultReport.addStepDetails("validate Tools Drawer Menu Options_TC3","Application should display all the fields in Tools Drawer","Unable to display all the fields in Tools Drawer","Fail", "N");
		  }
	}
	
	public void validateAccountsScreen_TC4() throws Exception{
		try{	
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger,25);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.accounts);
			verifyElement(toolsdrawerlocators.accountHeader,"Accounts Header");
			verifyElement(toolsdrawerlocators.searchField,"Search Field In Account Screen");
			verifyElement(toolsdrawerlocators.back,"Back Button");
			verifyElement(toolsdrawerlocators.nothingSelectedTxt,"Nothing Selected Text");
			verifyElement(toolsdrawerlocators.accountNames1(pdfResultReport.testDataValue.get("Meetingname")),"Accounts");
			verifyElement(toolsdrawerlocators.ogeenee,"O geene button");
			pdfResultReport.addStepDetails("validate Accounts Screen_TC4","Application should display the fields in account screen","Successfully displayed all the fields in account screen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validateAccountsScreen_TC4"+e.getMessage());
			  pdfResultReport.addStepDetails("validate Accounts Screen_TC4","Application should display the fields in account screen","Unable to display all the fields in account screen","Fail", "N");
		  }
	}
	
	public void validateCalendarScreen_TC5() throws Exception{
		try{
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger,25);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.calendar);			
			verifyElement(toolsdrawerlocators.searchbutton,"Search Field In Calender Screen");
			verifyElement(toolsdrawerlocators.back,"Back Button");
			verifyElement(toolsdrawerlocators.newActivityButton,"Nothing Activity Button");
			verifyElement(toolsdrawerlocators.dayViewCalender,"Day View Calender");
			verifyElement(toolsdrawerlocators.ogeenee,"O geene button");		
			pdfResultReport.addStepDetails("Validate Calendar Screen_TC5","Application should display the fields in Calender screen","Successfully displayed all the fields in Calender screen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validateCalendarScreen_TC5"+e.getMessage());
			  pdfResultReport.addStepDetails("validate Calendar Screen_TC5","Application should display the fields in Calender screen","Unable to display the fields in Calender screen","Fail", "N");
		  }
	}
	
	public void validateContactScreen_TC6() throws Exception{
		try{
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger,35);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.contacts);		
			verifyElement(toolsdrawerlocators.searchField,"Search Field In Contacts Screen");
			verifyElement(toolsdrawerlocators.back,"Back Button");
			verifyElement(toolsdrawerlocators.nothingSelectedTxt,"nothing Selected Text");
			verifyElement(toolsdrawerlocators.ogeenee,"O geene button");
			pdfResultReport.addStepDetails("Validate Contact Screen_TC6","Application should display the fields in Contact Screen","Successfully displayed all the fields in Contact Screen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validate Contact Screen_TC6"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Contact Screen_TC6","Application should display the fields in Contact Screen","Unable to display the fields in Contact Screen","Fail", "N");
		  }
	}
	
	public void validatePresentationScreen_TC7() throws Exception{
		try{
			click(toolsdrawerlocators.back);
			waitForElement(toolsdrawerlocators.hamburger,35);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.presentations);			
			verifyElement(toolsdrawerlocators.searchField,"Search Field In Presentations Screen");
			verifyElement(toolsdrawerlocators.back,"Back Button");
			verifyElement(toolsdrawerlocators.selectPresent,"Select Presentation Button");
			verifyElement(toolsdrawerlocators.nothingSelectedTxt,"nothing Selected Text");
			verifyElement(toolsdrawerlocators.titlePresent,"Title Presentation ");
			verifyElement(toolsdrawerlocators.dropDownPresentation,"DropDown in presentations");
			verifyElement(toolsdrawerlocators.changeViewPresent,"Change View Button");
			pdfResultReport.addStepDetails("Validate Presentation Screen_TC7","Application should display all the fields in Presentation Screen","Successfully displayed all the fields in Presentation Screen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validatePresentationScreen_TC7"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Presentation Screen_TC7","Application should display all the fields in Presentation Screen","Unable to display the fields in Presentation Screen","Fail", "N");
		  }
	}
	
	public void validateSettingsScreen_TC8() throws Exception{
		try{
			waitForElement(toolsdrawerlocators.hamburger,25);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.settings);		
			verifyElement(toolsdrawerlocators.calenderSettings,"Calendar ");
			verifyElement(toolsdrawerlocators.remoteMeetingSettings,"Remote meeting");
			verifyElement(toolsdrawerlocators.meSettings,"Me");
			verifyElement(toolsdrawerlocators.languageSettings,"Language");
			verifyElement(toolsdrawerlocators.positionSettings,"Position");
			verifyElement(toolsdrawerlocators.resetPasswordSettings,"Reset password");
			verifyElement(toolsdrawerlocators.storageSettings,"Storage");
			pdfResultReport.addStepDetails("validateSettingsScreen_TC8","Application should display the fields in SettingsScreen","Successfully displayed all the fields in SettingsScreen","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate Settings Contact Screen"+e.getMessage());
			  pdfResultReport.addStepDetails("validateSettingsScreen_TC8","Application should display the fields in SettingsScreen","unable to display the fields in SettingsScreen","Fail", "N");
		  }
	}
	
	public void verifyLogout() throws Exception{
		try{
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.logout);
			click(toolsdrawerlocators.logoutYes);
			Thread.sleep(5000);
			waitForElement(loginPageLocators.username,25);
			pdfResultReport.addStepDetails("validateLogout","Application should Successfully Logout","Successfully loggedout from application","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validateLogout"+e.getMessage());
			  pdfResultReport.addStepDetails("validateLogout","Application should Logout","unable to Logout from the Application","Fail", "N");
		  }
	}
}
