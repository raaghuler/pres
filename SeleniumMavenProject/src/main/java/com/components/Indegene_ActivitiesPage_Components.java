package com.components;

import java.net.MalformedURLException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.baseClasses.PDFResultReport;
import com.mobileUtilities_iOS.BaseClass_iOS;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Indegene_ActivitiesPage_Components extends BaseClass_iOS{		
	public Indegene_ToolsDrawerLocators toolsdrawerlocators=new Indegene_ToolsDrawerLocators();
	public Indegene_ActivitiesPageLocators Activitieslocators=new Indegene_ActivitiesPageLocators();
	public Indegene_PresentationsPageLocators Presentationslocators=new Indegene_PresentationsPageLocators();
	public Indegene_FaceToFaceMeetingLocators  facetofacelocators=new Indegene_FaceToFaceMeetingLocators();
	public Indegene_FacetoFace_Components FacetoFaceFunctions = new Indegene_FacetoFace_Components(pdfResultReport);
	public Indegene_ActivitiesPage_Components(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	public static String meetingNameCreated; 
	//public String meetingName="";
	
	@SuppressWarnings("unchecked")
	public void createMeetingNverifyDetails_TC1() throws Throwable {
		try {
			System.out.println("Executing the method createMeetingNverifyDetails_TC1");
			Date date1 =new Date();
			int mon = date1.getMonth();
			String cm=getMonthForInt(mon);	
			waitForElement(Activitieslocators.addMeeting(cm),50);
			click(Activitieslocators.addMeeting(cm));
			meetingNameCreated = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			System.out.println(meetingNameCreated);
			click(Activitieslocators.addMeeting1);
			click(Activitieslocators.selectMeeting);
			click(Activitieslocators.confirm);
			click(Activitieslocators.addSubjectbtn);
			click(Activitieslocators.subjecttextfield);
			click(Activitieslocators.icClearTextButton);
			set(Activitieslocators.subjecttextfield,meetingNameCreated);
			//String meetingName =text(Activitieslocators.subjecttextfield);
			//System.out.println(meetingName);
			click(Activitieslocators.done);
			//verifyElement(Activitieslocators.meeting(meetingNameCreated),"Meeting By name");
			verifyElement(Activitieslocators.Status, "Status Verified");
			verifyElement(Activitieslocators.Subject,"Subject Verified");
			verifyElement(Activitieslocators.Time,"Time Verified");
			verifyElement(Activitieslocators.Location, "Location Verified");
			verifyElement(Activitieslocators.Accounts,"Accounts Verified");
			verifyElement(Activitieslocators.Participants,"Participants Verified");
			verifyElement(Activitieslocators.presentations,"Presentations Verified");
			pdfResultReport.addStepDetails("Verify Meeting Details_TC1","Verfiy all the details are available","Successfully validated all the Meeting details","PASS", "Y");
			}catch (Exception e){
			log.fatal("Unable to verify createMeetingNverifyDetails_TC1"+e.getMessage());
			pdfResultReport.addStepDetails("Verify Meeting Details_TC1","Verfiy all the details are available","Unable to validate the meeting details","FAIL", "N");
		}
		
	}
	

		public void verifyAddParticipant_TC2() throws Exception{
			try {
				System.out.println("Executing the method verifyAddParticipant_TC2");
				//click(facetofacelocators.meetingDetailsSwitchButton);
				click(Activitieslocators.selectParticipantsbtn);
				click(Activitieslocators.addParticipant(pdfResultReport.testDataValue.get("Contactname1")));
				click(Activitieslocators.done);
				pdfResultReport.addStepDetails("Verify add participant_TC2","Verfiy add participant ","Successfully added the participant","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verify verifyAddParticipant"+e.getMessage());
					pdfResultReport.addStepDetails("verifying add participant_TC2","Verfiy add participant","Unable to add the participant","FAIL", "N");
				}
		}
		
		
		public void verifyAddParticipant_TC2_1() throws Exception{
			try {
				System.out.println("Executing the method verifyAddParticipant_TC2_1");
				click(facetofacelocators.meetingDetailsSwitchButton);
				click(Activitieslocators.selectParticipantsbtn);
				click(Activitieslocators.addParticipant(pdfResultReport.testDataValue.get("Contactname2")));
				click(Activitieslocators.done);
				pdfResultReport.addStepDetails("Verify add participant","Verfiy add participant ","Successfully selected the participant","PASS", "Y");
				
				}catch(Exception e) {
					log.fatal("Unable to verify verifyAddParticipant"+e.getMessage());
					pdfResultReport.addStepDetails("Verify add participant","Verfiy add participant","Could not verify add participant","FAIL", "N");
				}
		}
		
		public void verifyAddPresentation_TC3() throws Exception{
			
			try {
				System.out.println("Executing the method verifyAddPresentation_TC3");
				click(Activitieslocators.addPresentations);
				click(Activitieslocators.presentation(pdfResultReport.testDataValue.get("Presentationname")));
				click(Activitieslocators.done);
				List<WebElement> presentations= ThreadLocaliOSDriver.getDriver().findElementsByClassName("XCUIElementTypeImage");
				if(presentations.size()>0)
				pdfResultReport.addStepDetails("Verify add presentation_TC3","Verfiy add presentation","Successfully added the Presentation","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verify verifyAddPresentation_TC3"+e.getMessage());
					pdfResultReport.addStepDetails("Verify add presentation_TC3","Verfiy add presentation","Unable to add the presentation","FAIL", "N");
			}
		}
		
		public void verifyRemovePresentation_TC3a() throws Exception{
			
			try {
				System.out.println("Executing the method verifyRemovePresentation_TC3a");
				click(Activitieslocators.addPresentations);
				click(Activitieslocators.presentation(pdfResultReport.testDataValue.get("Presentationname2")));
				click(Activitieslocators.done);
				List<WebElement> presentations= ThreadLocaliOSDriver.getDriver().findElementsByClassName("XCUIElementTypeImage");
				if(presentations.size()>0)
				pdfResultReport.addStepDetails("Verify Remove presentation_TC3","Presentation Should be removed","Successfully removed the Presentation","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verify verifyAddPresentation_TC3"+e.getMessage());
					pdfResultReport.addStepDetails("Verify Remove presentation_TC3","Presentation should be removed","Unable to remove the presentation","FAIL", "N");
			}
		}
		
		public void verifyAddPresentation_TC3a() throws Exception{
			try {
				System.out.println("Executing the method verifyAddPresentation_TC3a");
				click(Activitieslocators.addPresentations);
				click(Activitieslocators.presentation(pdfResultReport.testDataValue.get("Presentationname2")));
				click(Activitieslocators.done);
				List<WebElement> presentations= ThreadLocaliOSDriver.getDriver().findElementsByClassName("XCUIElementTypeImage");
				if(presentations.size()>0)
				pdfResultReport.addStepDetails("Verify add presentation_TC3","Verfiy add presentation","Successfully added the Presentation","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verify verifyAddPresentation_TC3"+e.getMessage());
					pdfResultReport.addStepDetails("Verify add presentation_TC3","Verfiy add presentation","Unable to add the presentation","FAIL", "N");
			}
		}
	
		String getMonthForInt(int num) {
	        String month = "wrong";
	        DateFormatSymbols dfs = new DateFormatSymbols();
	        String[] months = dfs.getMonths();
	        if (num >= 0 && num <= 11 ) {
	            month = months[num];
	        }
	        return month;
	    }
		
		public void verifyAddLocation_TC4() throws Throwable{
			try {	
				System.out.println("Executing the method verifyAddLocation_TC4");
				//click(Activitieslocators.meeting(meetingName));
				click(Activitieslocators.locationButton);
				waitForElement(Activitieslocators.changeLocation,15);
				click(Activitieslocators.enterLocationField);
				set(Activitieslocators.enterLocationField,pdfResultReport.testDataValue.get("Locationname"));
				click(Activitieslocators.done);
				verifyElement(Activitieslocators.verifyLocation(pdfResultReport.testDataValue.get("Locationname")),"Location By name");
				pdfResultReport.addStepDetails("Verify add location in text field_TC4","Verfiy location is added in the text field and Saved","Successfully entered the location in text field and Saved","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verifyAddLocation_TC4"+e.getMessage());
					pdfResultReport.addStepDetails("Verify add location in text field_TC4","Verfiy location is added in the text field","Unable to enter the location in the text field","FAIL", "N");
			}
		}
		
		public void verifyAddLocationFromGoogleMap_TC5() throws Throwable{
			try {	
				System.out.println("Executing the method verifyAddLocationFromGoogleMap_TC5");
				//click(facetofacelocators.meetingName(meetingNameCreated));
				click(Activitieslocators.locationButton);
				click(Activitieslocators.locationIcon);
				click(Activitieslocators.searchLocation);
				click(Activitieslocators.searchField);
				set(Activitieslocators.searchField,pdfResultReport.testDataValue.get("Todetails"));
				click(toolsdrawerlocators.presenterName(pdfResultReport.testDataValue.get("Todetails")));
				click(toolsdrawerlocators.presenterName(pdfResultReport.testDataValue.get("Todetails")));
				click(Activitieslocators.done);
				pdfResultReport.addStepDetails("Verify Add location from google MapTC_5","Verfiy location is added from google Map","Location successfully added from the google Map","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verify Add Location_TC5"+e.getMessage());
					pdfResultReport.addStepDetails("Verify Add location from google MapTC_5","Verfiy location is added from the google Map","Could not verify location added from google Map","FAIL", "N");
			}
		}
		
		public void verifyAddLocationFromSuggestedList_TC6() throws Throwable{
			try {	
				System.out.println("Executing the method verifyAddLocationFromSuggestedList_TC6");
				//click(facetofacelocators.meetingName(meetingNameCreated));
				click(Activitieslocators.locationButton);
				click(Activitieslocators.suggestedList);
				click(Activitieslocators.done);
				pdfResultReport.addStepDetails("Verify Add location from suggestion list_TC6","Verfiy location is added from the suggestion list","Location successfully added from the suggestion list","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verifyAddLocation_TC6"+e.getMessage());
					pdfResultReport.addStepDetails("Verify Add location from suggestion list_TC6","Verfiy location is added from the suggestion list","Could not verify location added from the suggestion list","FAIL", "N");
			}
		}
		
		public void verifymeetinginAgenda_Day_3Day_TC8() throws Exception{
			try {
				System.out.println("Executing the method verifymeetinginAgenda_Day_3Day_TC8");
				click(Activitieslocators.agenda);
				verifyElement(Activitieslocators.meeting(meetingNameCreated),"Meeting By name");
				verifyElement(Activitieslocators.meeting(meetingNameCreated),"Meeting By name");
				pdfResultReport.addStepDetails("Verif meeting is listed in Agenda_TC8","Meeting should be listed in Agenda","Meeting successfully listed in Agenda","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verify verifyAddPresentation_TC3"+e.getMessage());
					pdfResultReport.addStepDetails("Verify meeting is listed in Agenda_TC8","Meeting should be listed in Agenda","Unable to verify if meeting is listed in Agenda","FAIL", "N");
			}
		}
		
		
		public void verifyCardActionButtonsUnderEachCard_TC9() throws Throwable{
			try {	
				System.out.println("Executing the method verifyCardActionButtonsUnderEachCard_TC9");
				//click(Activitieslocators.meeting(meetingNameCreated));
				List<WebElement> dropdownvalue=ThreadLocaliOSDriver.getDriver().findElements(Activitieslocators.meetingdropdown);
				System.out.println(dropdownvalue.size());
				int latestdropdownvalue=dropdownvalue.size();
			    click(Activitieslocators.meetingchevronDropDown1(latestdropdownvalue));
			    verifyElement(Activitieslocators.meetingScheduleFollowup1,"Schedule Followup");
			    verifyElement(Activitieslocators.meetingScrap1,"Scrap");
				pdfResultReport.addStepDetails("Verify card action buttons under each card","Card action buttons should be verified under each card","Successfully verified card action buttons under each card","PASS", "Y");
				}catch(Exception e) {
					log.fatal("Unable to verifyAddLocation_TC4"+e.getMessage());
					pdfResultReport.addStepDetails("Verify card action buttons under each card","Card action buttons should be verified under each card","Unable to verify card action buttons under each card","FAIL", "N");
			}
		}
}
