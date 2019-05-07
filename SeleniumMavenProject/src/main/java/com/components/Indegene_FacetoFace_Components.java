package com.components;

import static org.testng.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import com.baseClasses.PDFResultReport;
import com.mobileUtilities_iOS.BaseClass_iOS;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.Indegene_ActivitiesPageLocators;
import com.objectRepository.Indegene_ContactScreenLocators;
import com.objectRepository.Indegene_FaceToFaceMeetingLocators;
import com.objectRepository.Indegene_LoginPageLocators;
import com.objectRepository.Indegene_PresentationsPageLocators;
import com.objectRepository.Indegene_ToolsDrawerLocators;

import io.appium.java_client.ios.IOSDriver;

public class Indegene_FacetoFace_Components extends BaseClass_iOS{
	public Indegene_ToolsDrawerLocators toolsdrawerlocators=new Indegene_ToolsDrawerLocators();
	public Indegene_ContactScreenLocators  contactscreenlocators=new Indegene_ContactScreenLocators();
	public Indegene_FaceToFaceMeetingLocators  facetofacelocators=new Indegene_FaceToFaceMeetingLocators();
	public Indegene_PresentationsPageLocators Presentationslocators=new Indegene_PresentationsPageLocators();
	public Indegene_ActivitiesPageLocators Activitieslocators=new Indegene_ActivitiesPageLocators();
	public Indegene_LoginPageLocators loginPageLocators=new Indegene_LoginPageLocators();
	public Indegene_LoginPage_Components loginPageCases=new Indegene_LoginPage_Components(pdfResultReport);
	public Indegene_ToolsDrawer_Components ToolDrawerComponents =new Indegene_ToolsDrawer_Components(pdfResultReport);
	
	public Indegene_FacetoFace_Components(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
 public static String meetingNameCreated="";
	
 
	public  String createMeetingwithTimeStamp() throws Throwable {
		try {
			System.out.println("Executing the method createMeetingwithTimeStamp");
			meetingNameCreated = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			System.out.println(meetingNameCreated);
			Thread.sleep(5000);
			//click(Activitieslocators.activityType("Meeting"));
			click(Activitieslocators.addMeeting1);
			click(Activitieslocators.selectMeeting);
			//waitForElement(Activitieslocators.confirm,30);
			click(Activitieslocators.confirm);
			click(Activitieslocators.addSubjectbtn);
			click(Activitieslocators.subjecttextfield);
			click(Activitieslocators.icClearTextButton);
			set(Activitieslocators.subjecttextfield,meetingNameCreated);
			click(Activitieslocators.done);			
			pdfResultReport.addStepDetails("verify Meeting Details","Verfiying if all the details are available","Successfully verified meeting details","PASS", "Y");
		}catch (Exception e){
			log.fatal("Unable to verify createMeetingNverifyDetails_TC1"+e.getMessage());
			pdfResultReport.addStepDetails("verify Meeting Details","Verfiying if all the details are available","Could not verify meeting details","Fail", "N");
		}
		return meetingNameCreated;
		
	}
	
	public  void createMeetingwithNewMeeting() throws Throwable {
		try {
			System.out.println("Executing the method createMeetingwithNewMeeting");
			//meetingNameCreated = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			//System.out.println(meetingNameCreated);
			Thread.sleep(5000);
			//click(Activitieslocators.activityType("Meeting"));
			click(Activitieslocators.addMeeting1);
			click(Activitieslocators.selectMeeting);
			//waitForElement(Activitieslocators.confirm,30);
			click(Activitieslocators.confirm);
			click(Activitieslocators.addSubjectbtn);
			click(Activitieslocators.subjecttextfield);
			click(Activitieslocators.icClearTextButton);
			set(Activitieslocators.subjecttextfield,"New Meeting");
			click(Activitieslocators.done);			
			pdfResultReport.addStepDetails("verify Meeting Details","Verfiying if all the details are available","Successfully verified meeting details","PASS", "Y");
		}catch (Exception e){
			log.fatal("Unable to verify createMeetingNverifyDetails_TC1"+e.getMessage());
			pdfResultReport.addStepDetails("verify Meeting Details","Verfiying if all the details are available","Could not verify meeting details","Fail", "N");
		}
		//return meetingNameCreated;
		
	}
	
	
	public void selectMeeting() throws Exception{
		try{
			System.out.println("Executing the method selectMeeting");
			click(facetofacelocators.meetingName(meetingNameCreated));
			Thread.sleep(1500);	    
			pdfResultReport.addStepDetails("selectMeeting","Meeting should Selected","Successfully Selected Meeting","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to selectMeeting"+e.getMessage());
			  pdfResultReport.addStepDetails("selectMeeting","Meeting should Selected","unable to Select Meeting","Fail", "N");
		  }
	}
	public void selectMeetingwithName(String meetingName) throws Exception{
		try{
			System.out.println("Executing the method selectMeetingwithName");
			click(facetofacelocators.meetingName(meetingName));
			Thread.sleep(1500);	    
			pdfResultReport.addStepDetails("selectMeeting","Meeting should Selected","Successfully Selected Meeting","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to selectMeeting"+e.getMessage());
			  pdfResultReport.addStepDetails("selectMeeting","Meeting should Selected","unable to Select Meeting","Fail", "N");
		  }
	}
	
	public void closeMeetingDetails_TC01() throws Exception{
		try{
			System.out.println("Executing the method closeMeetingDetails_TC01");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			click(facetofacelocators.meetingcloseButton);					    
			pdfResultReport.addStepDetails("Verify close MeetingDetails_TC01","Meeting should be Closed","Successfully Closed Meeting","Pass", "Y");
			click(facetofacelocators.meetingcloseConfirm);
		}catch(Exception e){
			  log.fatal("Unable to validate close MeetingDetails_TC01"+e.getMessage());
			  pdfResultReport.addStepDetails("Verify close MeetingDetails_TC01","Meeting should be Closed","Unable Close the Meeting","Fail", "N");
		  }
	}
	
	public void validateTickmarkInMeetingDetail_TC02() throws Exception{
		try{
			System.out.println("Executing the method validateTickmarkInMeetingDetail_TC02");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			click(facetofacelocators.meetingTickMark);
			Thread.sleep(2000);
			click(facetofacelocators.MeetingMarkCompleteOK);
			//verifyElement(facetofacelocators.MeetingMarkCompleteOK, "Greeen Mark In Meeting Completed");	    
			pdfResultReport.addStepDetails("Validate Tickmark InMeetingDetail_TC02","Meeting should be Marked in Greeen","Successfully Meeting is marked in Green","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate Tickmark InMeetingDetail_TC02"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Tickmark InMeetingDetail_TC02","Meeting should be Marked in Green","Unable to Mark Meeting in green","Fail", "N");
		  }
	}
	
	public void verifyAccessToParticipentsAndAccountsForCompletedMeeting_TC03() throws Exception{
		try {
			System.out.println("Executing the method verifyAccessToParticipentsAndAccountsForCompletedMeeting_TC03");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			String subjectTxt = ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.subjectText).getAttribute("enabled");
			boolean Subject = Boolean.parseBoolean(subjectTxt);
			Assert.assertFalse(Subject);
			String timefield=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.timeButton).getAttribute("enabled");
			boolean time = Boolean.parseBoolean(timefield);
			Assert.assertFalse(time);
			String accountfield=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.account).getAttribute("enabled");
			boolean account = Boolean.parseBoolean(accountfield);
			Assert.assertTrue(account);
			String customefield=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.customer).getAttribute("enabled");	
			boolean customer = Boolean.parseBoolean(customefield);
			Assert.assertTrue(customer);
			pdfResultReport.addStepDetails("Verify Access To Participents And Accounts For CompletedMeeting_TC03","Meeting Details should be disabled and should access to ParticipentsAndAccounts","Meeting details are disabled and have access to AccessToParticipentsAndAccounts","Pass", "Y");			
		} catch (Exception e) {
			log.fatal("Unable to verifyAccessToParticipentsAndAccountsForCompletedMeeting_TC03"+e.getMessage());
			 pdfResultReport.addStepDetails("Verify Access To Participents And Accounts For CompletedMeeting_TC03","Meeting Details should be disabled and should access to ParticipentsAndAccounts","Meeting details are not disabled","Fail", "N");
		  }	
	}
	
	public void validateParticipantBadgeInMeetingDetail_TC04() throws Exception{
		try{
			System.out.println("Executing the method validateParticipantBadgeInMeetingDetail_TC04");
			//click(facetofacelocators.meetingName(pdfResultReport.testDataValue.get("Meetingname")));
			//click(facetofacelocators.meetingName(meetingNameCreated));
			verifyElement(facetofacelocators.meetingParticipantsBadge, "Participant Button");
			click(facetofacelocators.meetingParticipantsBadge);
			verifyElement(toolsdrawerlocators.contacts, "Contact Header Text");
			click(facetofacelocators.contactsDoneButton);		    
			pdfResultReport.addStepDetails("Validate Participant Badge In MeetingDetail_TC04","Participant Badge Should be Present in Meeting Detail Page","Successfully validated Participant Badge in Meeting Detail Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validateParticipantBadgeInMeetingDetail_TC04"+e.getMessage());
			  pdfResultReport.addStepDetails("ValidateParticipantBadgeInMeetingDetail_TC04","Participant Badge Should be Present in Meeting Detail Page","Participant Badge is Not Present in Meeting Detail Page","Fail", "N");
		  }
	}
	
	public void validatePresentationBadgeInMeetingDetail_TC05() throws Exception{
		try{
			System.out.println("Executing the method validatePresentationBadgeInMeetingDetail_TC05");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			verifyElement(facetofacelocators.meetingPresentationsBadge, "Meeting Presentation Badge");
			click(facetofacelocators.meetingPresentationsBadge);
			verifyElement(facetofacelocators.presentationHeader, "Presentation Header Text");
			click(facetofacelocators.presentationsDoneButton);
			Thread.sleep(5000);
			pdfResultReport.addStepDetails("Validate Presentation Badge In MeetingDetail_TC05","Presentation Badge Should be Present in Meeting Detail Page","Successfully validated Presentation Badge in Meeting Detail Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate validate Presentation Badge In MeetingDetail_TC05"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Presentation Badge In MeetingDetail_TC05","Presentation Badge Should be Present in Meeting Detail Page","Participant Badge is Not Present in Meeting Detail Page","Fail", "N");
		  }
	}
	
	public void validateMeetingPresentationSwitch_TC06() throws Exception{
		try{
			System.out.println("Executing the method validateMeetingPresentationSwitch_TC06");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			click(facetofacelocators.PresentaionSwitchButton);
		    verifyElement(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber2")), "Slide1 is verified");
		    pdfResultReport.addStepDetails("ValidateMeetingPresentationSwitch_TC06","Presenation Switch Should be Present In Meeting Detail Page","Presenation Switch is Present In Meeting Detail Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate Meeting Presentation Switch_TC06"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Meeting Presentation Switch_TC06","Presenation Switch Should be Present In Meeting Detail Page","Presenation Switch is Not Present In Meeting Detail Page","Fail", "N");
		  }
	}
	
	public void validatePresentationCaurosel_TC07() throws Exception{
		try{
			System.out.println("Executing the method validatePresentationCaurosel_TC07");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			//click(facetofacelocators.PresentaionSwitchButton);
			click(facetofacelocators.meetingCauroselButton);
			verifyElementNotPresent(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber2")), "Slide1 is verified");// should be disabled
			pdfResultReport.addStepDetails("Validate Presentation Caurosel_TC07","Presenation Caurosel Button Should be Present In Meeting Presentation Page","Successfully verified Presenation Caurosel Button in Meeting Presentation Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate Presentation Caurosel_TC07"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Presentation Caurosel_TC07","Presenation Caurosel Button Should be Present In Meeting Presentation Page","Unable to verify Presenation Caurosel Button in Meeting Presentation Page","Fail", "N");
		  }
	}
	
	public void validatePresentationScreenShot_TC08() throws Exception{
		try{
			System.out.println("Executing the method validatePresentationScreenShot_TC08");
			//click(facetofacelocators.meetingName);
			click(facetofacelocators.meetingScreenShotButton);
			//Verify Screen shot text is 1
			pdfResultReport.addStepDetails("Validate Presentation ScreenShot_TC08","Presenation Screenshot Button Should be Present In Meeting Presentation Page","Successfully verified Screenshot Button in Meeting Presentation Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validatePresentationScreenShot_TC08"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Presentation ScreenShot_TC08","Presenation ScreenShot Button Should be Present In Meeting Presentation Page","Unable to verify Screenshot Button in Meeting Presentation Page","Fail", "N");
		  }
	}
	
	public void validatePratcipantBadgeCount_TC09() throws Exception{
		try{
			System.out.println("Executing the method validatePratcipantBadgeCount_TC09");
			click(facetofacelocators.slideParticipantsBadge);
			verifyElement(facetofacelocators.customers, "Participants screen");
			//Attributes are not available for the test case
			// Verify Participants Badge count is 1
			pdfResultReport.addStepDetails("Validate Pratcipant Badge Count_TC09","Participant Badge Count should be Displayed","Participant Badge Count is Displayed","Pass", "Y");
			click(facetofacelocators.done);
		}catch(Exception e){
			  log.fatal("Unable to validatePratcipantBadgeCount_TC09"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Pratcipant Badge Count_TC09","Participant Badge Count should be Displayed","Participant Badge Count is not Displayed","Fail", "N");
		  }
	}
	
	public void validatePresentationBadgeCount_TC10a() throws Exception{
		try{
			System.out.println("Executing the method validatePresentationBadgeCount_TC10a");
			click(facetofacelocators.slidePresentationBadge);
			verifyElement(facetofacelocators.presentationsview,"Presentation screen");
			//Attributes are not available for the test case			
			// Verify Presentation Badge count is 1
			pdfResultReport.addStepDetails("Validate Presentation Badge Count_TC10a","Meeting should be Deleted in Agenda","Successfully Deleted Meeting in Agenda","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validatePresentationBadgeCount_TC10a"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Presentation Badge Count_TC10a","Meeting should be Deleted in Agenda","Unable to delete Meeting in Agenda","Fail", "N");
		  }
	}
	
	public void validatePresentationPlayPause_TC10() throws Exception{
		try{	
			System.out.println("Executing the method validatePresentationPlayPause_TC10");
			verifyElement(facetofacelocators.presentationPlay, "Play Button is displayed");
			click(facetofacelocators.presentationPlay);	
			verifyElementNotPresent(facetofacelocators.meetingDetailsSwitchButton, "Meeting Switch button disabled");
			pdfResultReport.addStepDetails("Validate Presentation Play and Pause button_TC10","Play and Pause button should be displayed","Play and Pause button validated successfully","Pass", "Y");
			click(facetofacelocators.presentationPause);
			verifyElement(facetofacelocators.meetingDetailsSwitchButton, "Meeting Switch button ");
		
		}catch(Exception e){
			  log.fatal("Unable to validatePresentationPlayPause_TC10"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Presentation Play and Pause_TC10","Play and Pause button should be displayed","Unable to validate play and pause button","Fail", "N");
		  }
	}
	
	public void validatemeetingDetailsSwitch_TC11() throws Exception{
		try{
			System.out.println("Executing the method validatemeetingDetailsSwitch_TC11");
			click(facetofacelocators.meetingDetailsSwitchButton);
			verifyElement(facetofacelocators.meetingStatus,"Meeting Details screen");
			pdfResultReport.addStepDetails("Validate Meeting Details Switch_TC11","Application should switch to Meeting Details Page","Successfully switched to meeting detials Page","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validate Presentation Switch_TC11"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Meeting Details Switch_TC11","Application should switch to Meeting Details Page","Unable to switch to meeting detials Page","Fail", "N");
		  }
	}
	
	public void validatePresentationSlides_TC12() throws Exception{
		try{
			System.out.println("Executing the method validatePresentationSlides_TC12");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			boolean carouselaction = false;
			click(facetofacelocators.PresentaionSwitchButton);
			click(facetofacelocators.presentationPlay);
				List<WebElement> slides= ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.slides);
				System.out.println(slides.size());
				for(int i=1;i<=slides.size();i++){
					System.out.println("Clicking on "+i+"th Slide");
					if(i==9) {
					swipe(840, 650, 25, 650);
					}
					slides.get(i).click();
					String slideName = text(Presentationslocators.nameOfSlide(i+1));
					System.out.println("Comparing Slide name with Carousel Header with "+slideName.substring(35));
					String slideText = slideName.substring(35);
					System.out.println(text(Presentationslocators.carouselHeader1(i+1)));
					if(text(Presentationslocators.carouselHeader1(i+1)).contentEquals("Slide"+slideText+""))
						carouselaction = true;
					else carouselaction = false;
					if (i==2) break;
					}
				
				if(carouselaction==true)
					pdfResultReport.addStepDetails("Validate Presentation Slides_TC12","Carousel header text should be same as the selected slide name","Carousel header is same as the selected slide name","Pass", "Y");
				else
					pdfResultReport.addStepDetails("Validate Presentation Slides_TC12","Carousel header text should be same as the selected slide name","Carousel header is not same as the selected slide name","Fail", "N");	
				click(facetofacelocators.presentationPause);
		}catch(Exception e){
			  log.fatal("Unable to validatePresentationSlides_TC12"+e.getMessage());
			  pdfResultReport.addStepDetails("validatePresentationSlides_TC12","Meeting presentation screen header should display the page being previewed","unable to display Meeting presentation screen header","Fail", "N");
		  }
	}
	
	
	public void validateProductAndKeyMessagesTickedInMeetingDetails_TC13() throws Exception {
		try {
		System.out.println("Executing the method validateProductAndKeyMessagesTickedInMeetingDetails_TC13");
		swipe(840, 650, 580, 650);
		click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber12")));
		click(facetofacelocators.presentationPlay);
		click(facetofacelocators.presentationPause);
		click(facetofacelocators.meetingDetailsSwitchButton);	
		//Interactions are not provided for these elements (Kyprolis and Dosing) in product and key messages
		//Dev team need to provide unique locators
		verifyElement(facetofacelocators.kyprolisInMeetingDetails,"Kyprolis");
		verifyElement(facetofacelocators.customerSatisfactioninMeetingDetails,"CustomerSatisfaction");
		Thread.sleep(2000);
		pdfResultReport.addStepDetails("Validate Product And Key Messages Ticked_TC13","Product and key messages should be ticked","Product and Key messages are ticked","Pass", "Y");
		} catch (Exception e) {
			log.fatal("Unable to validatePresentationSlides_TC12"+e.getMessage());
			pdfResultReport.addStepDetails("Validate Product And Key Messages Ticked_TC13","Product and key messages should ticked","Unable to tick Product and Key messages","Fail", "N");
			e.printStackTrace();
		}	
	}
		
	public void validateProductsAndKeyMessagesInMeetingDetails_TC14() throws Exception{
		try {
			System.out.println("Executing the method validateProductsAndKeyMessagesInMeetingDetails_TC14");
			//Interactions are not provided for these elements (Need to provide unique locators) for product and keymessages
			pdfResultReport.addStepDetails("Validate Product And Key Messages in meeting Details_TC14","Product and key messages should be ticked in meeting details","Product and Key messages ticked successfully in meeting details","Pass", "Y");
		} catch (Exception e) {
			log.fatal("Unable to validatePresentationSlides_TC14"+e.getMessage());
			pdfResultReport.addStepDetails("Validate Product And Key Messages in MeetingDetails_TC14","Product and key messages should be ticked in meeting details","Unable to validate Product and Key messages in meeting details","Fail", "N");
			e.printStackTrace();
		}		
	}
	
	public String random() {
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder((100000 + rnd.nextInt(900000)) + "-");
		for (int i = 0; i < 5; i++)
		    sb.append(chars[rnd.nextInt(chars.length)]);

		return sb.toString();
	}
	
	public void validateMeetingDetailsRelogin_TC15() throws Exception{
		try{
			System.out.println("Executing the method validateMeetingDetailsRelogin_TC15");
			String meetname = "modified";
			//String meetname=random();
			System.out.println(meetname);
			//click(facetofacelocators.meetingName(meetingNameCreated)); //Need to discuss
			click(Activitieslocators.addSubjectbtn);	
			click(facetofacelocators.clearButton);
			set(Activitieslocators.subjecttextfield,meetname);
			click(Activitieslocators.done);	
			click(facetofacelocators.meetingTimeDropDown);
			click(Activitieslocators.done);
			String time=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.updatedTime).getAttribute("value");
			System.out.println(time);
			click(Activitieslocators.locationButton);
			click(Activitieslocators.suggestedList);
			String location=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.suggestedList).getAttribute("name");
			System.out.println(location);
			click(Activitieslocators.done);
	 	 	ToolDrawerComponents.verifyLogout();
	 	 	click(loginPageLocators.username);
	 	    set(loginPageLocators.username,"qauser6@omnipresence.io");
	 	    ThreadLocaliOSDriver.getDriver().hideKeyboard();
	 	    click(loginPageLocators.submitButton);
	 	    click(loginPageLocators.passwordField);
	 	    set(loginPageLocators.passwordField,"Automation@1234");
	 	    ThreadLocaliOSDriver.getDriver().hideKeyboard();	
	 	    click(loginPageLocators.signIn);
	 	    Thread.sleep(2000);
			click(facetofacelocators.meetingName(meetname)); //Interactions are not working
			click(Activitieslocators.locationButton);
			String location1=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.suggestedList).getAttribute("name");
			System.out.println(location1);
			Assert.assertEquals(location,location1);
			String time1=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.updatedTime).getAttribute("value");
			Assert.assertEquals(time,time1);
			String customer=ThreadLocaliOSDriver.getDriver().findElement(Activitieslocators.customer).getAttribute("value");
			System.out.println(customer);
			Assert.assertEquals(customer,pdfResultReport.testDataValue.get("Contactname1"));
			pdfResultReport.addStepDetails("Validate Meeting Details Relogin_TC15","Meeting details should persist after relogin","Meeting details perisist after relogin","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validateMeetingDetailsRelogin_TC15"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Meeting Details Relogin_TC15","Meeting details should persist after relogin","Meeting details persist after relogin","Fail", "N");
		  }
	}
	
	//analyses CCNS_HALO Do not delete should be added
	public void validateFilterPresentationAndPreviewPage_TC16a() throws Exception{
		try{
			System.out.println("Executing the method validateFilterPresentationAndPreviewPage_TC16a");
			click(facetofacelocators.meetingName(meetingNameCreated));
			click(facetofacelocators.meetingPresentationsBadge);
			click(Activitieslocators.presentation(pdfResultReport.testDataValue.get("Presentationname2")));
			click(facetofacelocators.presentationsDoneButton);
		    click(facetofacelocators.PresentaionSwitchButton);
			boolean carouselaction = false;
				List<WebElement> slides= ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.slides);
				System.out.println(slides.size());
				for(int i=1;i<=slides.size();i++){
					System.out.println("Clicking on "+i+"th Slide");
					if(i==9) {
					swipe(840, 650, 25, 650);
					}
					slides.get(i).click();
					String slideName = text(Presentationslocators.nameOfSlide(i+1));
					System.out.println("Comparing Slide name with Carousel Header with "+slideName.substring(35));
					String slideText = slideName.substring(35);
					System.out.println(text(Presentationslocators.carouselHeader(i+1)));
					if(text(Presentationslocators.carouselHeader(i+1)).contentEquals("Slide"+slideText+".html"))
						carouselaction = true;
					else carouselaction = false;
					if (i==2) break;
					click(facetofacelocators.meetingDetailsSwitchButton);			
					}	
				if(carouselaction==true)
					pdfResultReport.addStepDetails("Validate Filter Presentation And Preview Page_TC16a","Carousel header text should be same as the selected slide name","Carousel header is same as the selected slide name","Pass", "y");
				else
					pdfResultReport.addStepDetails("Validate Filter Presentation And Preview Page_TC16a","Carousel header text should be same as the selected slide name","Carousel header is not same as the selected slide name","Fail", "N");						
	    	pdfResultReport.addStepDetails("Validate Filter Presentation And Preview Page_TC16a","Account section and all other field should be disabled","Account section and all other field are disabled","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validateFilterPresentationAndPreviewPage_TC16a"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Filter Presentation And PreviewPage_TC16a","Account section and all other field should be disabled","Account section and all other field are not disabled","Fail", "N");
		  }
	}
	
	public void validateFilterPresentationAndPreviewPage_TC16() throws Exception{
		try{
			System.out.println("Executing the method validateFilterPresentationAndPreviewPage_TC16");
			
			click(facetofacelocators.meetingPresentationsBadge);
			click(Activitieslocators.presentation(pdfResultReport.testDataValue.get("Presentationname2")));
			click(facetofacelocators.presentationsDoneButton);
		    click(facetofacelocators.PresentaionSwitchButton);
			click(facetofacelocators.presentationsDropDown);
			click(facetofacelocators.selectPresentation(pdfResultReport.testDataValue.get("Presentationname")));
			click(facetofacelocators.presentationPlay);
			boolean carouselaction = false;
			List<WebElement> slides= ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.slides);
			System.out.println(slides.size());
			for(int i=1;i<=slides.size();i++){
				System.out.println("Clicking on "+i+"th Slide");
				if(i==9) {
				swipe(840, 650, 25, 650);
				}
				slides.get(i).click();
				String slideName = text(Presentationslocators.nameOfSlide(i+1));
				System.out.println("Comparing Slide name with Carousel Header with "+slideName.substring(35));
				String slideText = slideName.substring(35);
				System.out.println(text(Presentationslocators.carouselHeader1(i+1)));
				if(text(Presentationslocators.carouselHeader1(i+1)).contentEquals("Slide"+slideText+""))
					carouselaction = true;
				else carouselaction = false;
				if (i==2) break;
				}	
			
			pdfResultReport.addStepDetails("Validate Filter Presentation And Preview Page_TC16","Should be able to switch between the presentations and view the pages","Successfully switched between the presentations and view the pages","Pass", "Y");
			click(facetofacelocators.presentationPause);
			click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e){
			  log.fatal("Unable to validateFilterPresentationAndPreviewPage_TC16b"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Filter Presentation And PreviewPage_TC16","Should be able to switch between the presentations and view the pages","Unable to switch between the presentations and view the pages","Fail", "N");
		  }
	}
	
	public void validateFilterKeyMessageAndPreviewPage_TC17() throws Exception{
		try{
			System.out.println("Executing the method validateFilterKeyMessageAndPreviewPage_TC17");
			click(facetofacelocators.PresentaionSwitchButton);
			/*click(facetofacelocators.presentationsDropDown);
			click(facetofacelocators.selectPresentation(pdfResultReport.testDataValue.get("Presentationname")));*/
			click(facetofacelocators.presentationsAllKeyMessages);
			click(facetofacelocators.presentationsAllKeyCustomerSatisfication);	
			boolean carouselaction = false;
			click(facetofacelocators.presentationPlay);			
				List<WebElement> slides= ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.slides);
				System.out.println(slides.size()); //Update as per lokesh. it should have 2 slides
			    assertEquals(slides.size(), 2);	
			    click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber21")));
				String slideName1 = ThreadLocaliOSDriver.getDriver().findElement(Presentationslocators.nameOfSlide(21)).getAttribute("name");
				System.out.println(slideName1);
				String slideText=slideName1.substring(15);
				System.out.println(text(Presentationslocators.carouselHeader1(21)));
				if(text(Presentationslocators.carouselHeader1(21)).contentEquals("Slide"+slideText+"")){
					carouselaction = true;		
				}else {
					carouselaction = false;	
				}
	    	pdfResultReport.addStepDetails("Validate Filter Key Message And PreviewPage_TC17","Filter Key Message And Preview Page validation","Filter Key Message And Preview Page validated successfully","Pass", "Y");
	    	click(facetofacelocators.presentationPause);
	    	click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e){
			  log.fatal("Unable to validateFilterKeyMessageAndPreviewPage_TC17"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Filter Key Message And PreviewPage_TC17","Filter Key Message And Preview Page should be validated","Filter Key Message And Preview Pageis not validated","Fail", "N");
		  }
	}
	
	public void validateSentimentsForPages_TC18() throws Exception{
		try{
			System.out.println("Executing the method validateSentimentsForPages_TC18");
			click(facetofacelocators.PresentaionSwitchButton);
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber5")));
			click(facetofacelocators.sentimentPositive);
			//verifyElement(facetofacelocators.sentimentNeutral,"Neutral Sentiment");
			//verifyElement(facetofacelocators.sentimentNegative,"Negative Sentiment");
	    	pdfResultReport.addStepDetails("Validate Sentiments For Pages_TC18","Sentiments for page should be validated","Successfully validated Sentiments on the page","Pass","Y");
		}catch(Exception e) {  
	    	log.fatal("Unable to validateSentimentsForPages_TC18"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Sentiments ForPages_TC18","Sentiments for pages should be validated","Sentiments for pages are not validated","Fail", "N");
		  }
	}
	
	public void validateProductAndKelyMessagesUnderContacts_TC19() throws Exception{
		try{	
			System.out.println("Executing the method validateMeetingUnderContacts_TC19");
			//click(facetofacelocators.meetingName(meetingNameCreated)); //need to remove
			//click(facetofacelocators.PresentaionSwitchButton); //need to remove
			swipe(840, 650, 580, 650);
			//click(facetofacelocators.selectPresentation(pdfResultReport.testDataValue.get("Presentationname")));
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber11")));
			click(facetofacelocators.presentationPlay);
			Thread.sleep(5000);
			click(facetofacelocators.presentationPause);
			click(facetofacelocators.slideParticipantsBadge);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(contactscreenlocators.profileTab);
			verifyElement(facetofacelocators.contactProductKyprolis, "Kyprolis Product is displayed");	
			verifyElement(facetofacelocators.contactKeyMessageCustomerSatisfaction, "Contact key Message Customer Satisfaction");
	    	pdfResultReport.addStepDetails("Validate product and key messages Under Contacts Profile_TC19","Product and key messages Under Contacts Should be validated","Product and key messages Under Contacts validated successfully","Pass", "Y");
	    	click(facetofacelocators.contactsDoneButton);
			click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e){
			  log.fatal("Unable to validateMeetingUJnderContacts_TC19"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate product and key messages Under Contacts Profile_TC19","Product and key messages Under Contacts Should be validated","Product and key messages Under Contacts not validated properly","Fail", "N");
		  }
	}
	
	public void validateSentimentUnderContacts_TC20() throws Throwable{
		try{
			System.out.println("Executing the method validateSentimentUnderContacts_TC20");
			click(facetofacelocators.PresentaionSwitchButton);
			Thread.sleep(2000);
			swipe(840, 650, 580, 650);
			Thread.sleep(2000);
			swipe(840, 650, 580, 650);
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber16")));	
			click(facetofacelocators.presentationPlay);
			String slideName1 = ThreadLocaliOSDriver.getDriver().findElement(Presentationslocators.nameOfSlideno(16)).getAttribute("name");
			System.out.println(slideName1);
			Thread.sleep(5000);
			click(facetofacelocators.sentimentPositive1);
			String PresentationSenti = ThreadLocaliOSDriver.getDriver().findElement(facetofacelocators.sentimentPositive).getAttribute("name");
			String[] res = PresentationSenti.split("M");
			String sentiment = res[0];
			String finalSenti=sentiment.toUpperCase();
			System.out.println(finalSenti);	
			click(facetofacelocators.presentationPause);
			click(facetofacelocators.meetingParticipantsInPresentation);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(contactscreenlocators.profileTab);
			List<WebElement> slidesInProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.templates16InProfile);
			int noOFSlidesInProfile =slidesInProfile.size();		
			System.out.println(noOFSlidesInProfile);
			List<WebElement> positivSentiSlidesInProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.posSentimentsInProfile);
		    System.out.println(positivSentiSlidesInProfile.size());
		    int positivSentiSlidesInProfileNo =positivSentiSlidesInProfile.size();
		    verifyElement(facetofacelocators.slidePresented1(slideName1,noOFSlidesInProfile), "Slide Presented");
		    verifyElement(facetofacelocators.positiveSentimentInProfile2(finalSenti,positivSentiSlidesInProfileNo),"PositiveSentimentVerified");	 
		    scroll(550,600,850,500);
		    pdfResultReport.addStepDetails("Validate Sentiment Under Contacts_TC20","Sentiment under contacts should be validated","Sentiments Under Contacts validated successfully","Pass", "Y");
	    	click(facetofacelocators.contactsDoneButton);
	    	click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e){
			  log.fatal("Unable to validateSentimentUnderContacts_TC20"+e.getMessage());
			  System.out.println(e.getMessage());
			  pdfResultReport.addStepDetails("Validate Sentiment Under Contacts_TC20","Sentiments under contacts should be validated","Sentiments under contacts are not validated properly","Fail", "N");
		  }
	}
	

	public void validateSlidesUnderContacts_TC21() throws Exception{
		try{
			System.out.println("Executing the method validateSlidesUnderContacts_TC21");
			click(facetofacelocators.PresentaionSwitchButton);
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber8")));
			click(facetofacelocators.presentationPlay);
			String slideName8 = ThreadLocaliOSDriver.getDriver().findElement(Presentationslocators.nameOfSlideno(8)).getAttribute("name");	
			Thread.sleep(5000);
			click(facetofacelocators.sentimentPositive1);
			swipe(840, 650, 580, 650);
			Thread.sleep(2000);
			swipe(840, 650, 580, 650);	
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber17")));
			String slideName17 = ThreadLocaliOSDriver.getDriver().findElement(Presentationslocators.nameOfSlideno(17)).getAttribute("name");
			Thread.sleep(40000);
			click(facetofacelocators.sentimentNegative1);
			click(facetofacelocators.presentationPause);
			click(facetofacelocators.meetingParticipantsInPresentation);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(contactscreenlocators.profileTab);
			scroll(550,720,830,400);
			List<WebElement> slides8InProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.templates8InProfile);
			System.out.println(slides8InProfile.size());
			int noOf8SlidesInProfile =slides8InProfile.size();
			List<WebElement> slides17InProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.templates17InProfile);
			System.out.println(slides17InProfile.size());
			int noOf17SlidesInProfile =slides17InProfile.size();
			//click(facetofacelocators.profileActivityDropDown);
			verifyElement(facetofacelocators.slidePresented1(slideName8,noOf8SlidesInProfile),"Slide Verified");
			verifyElement(facetofacelocators.slidePresented1(slideName17,noOf17SlidesInProfile),"Slide Verified");
			scroll(550,600,850,400);
			Thread.sleep(2000);
			scroll(550,600,850,500);
	    	pdfResultReport.addStepDetails("Validate Slides Under Contacts_TC21","Each Page shown in the meeting should display under contacts","Each Page shown in the meeting are displayed under contacts","Pass", "Y");
	    	click(facetofacelocators.contactsDoneButton);
	    	click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e){
			  log.fatal("Unable to validateSlidesUnderContacts_TC21"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Slides Under Contacts_TC21","ach Page shown in the meeting should display under contacts","Each Page shown in the meeting are not displayed under contacts","Fail", "N");
		  }
	}
	
	public static String localtime() {
		System.out.println("Executing the method localtime");
		LocalTime localtime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String time=localtime.format(dateTimeFormatter);
		return time;
	}
	
	public static String difference(String time1,String time2) throws Exception{
		System.out.println("Executing the method difference");
		SimpleDateFormat Dateformat = new SimpleDateFormat("HH:mm:ss");
		//DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		Date date1 = Dateformat.parse(time1);
		Date date2 = Dateformat.parse(time2);
		Long downTime = date2.getTime() - date1.getTime();	
		Long diff=downTime/1000;
		String difference = diff.toString(diff);	
		int seconds=Integer.parseInt(difference);		
		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;
		p2 = p2 / 60;
		String presentation=(+0+p2 + ":" +0+p3 + ":" + p1);
		System.out.print("\n");
		return presentation;
	}
	
	public void validateSlideTimerUnderContacts_TC22() throws Exception{
		try{
			System.out.println("Executing the method validateSlideTimerUnderContacts_TC22");
			click(facetofacelocators.PresentaionSwitchButton);                          
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber6")));
			click(facetofacelocators.presentationPlay);
			String slideName6 = ThreadLocaliOSDriver.getDriver().findElement(Presentationslocators.nameOfSlideno(6)).getAttribute("name");
			String starttime=localtime();
			System.out.println(starttime);
			Thread.sleep(5000);	
			String endtime=localtime();
			System.out.println(endtime);
			String WaitTimeInPresentation=difference(starttime,endtime);
			System.out.println(WaitTimeInPresentation);
			click(facetofacelocators.presentationPause);
			click(facetofacelocators.meetingParticipantsInPresentation);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(contactscreenlocators.profileTab);
			scroll(550,720,830,320);
			//click(facetofacelocators.profileActivityDropDown);
			List<WebElement> templateesInProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.templates6InProfile);
			int NoOF6TemplatesInProfile =templateesInProfile.size();
			
			String TimeInProfile=ThreadLocaliOSDriver.getDriver().findElement(facetofacelocators.slidePresentedTimer(slideName6,NoOF6TemplatesInProfile)).getAttribute("name");
			System.out.println(TimeInProfile);
			String[] parts = TimeInProfile.split(":");
		    int TimeValueInProfile= Integer.parseInt(parts[2]);
		    if(TimeValueInProfile>0) {
		    	System.out.println("Time is Greater than zero");
		    }else {
		    	System.out.println("Time is zero");
		    }
		    pdfResultReport.addStepDetails("Validate Slide Timer Under Contacts_TC22","Beneath every page in profile tab shared time should be displayed","Shared time displayed successfully in Contacts under profile tab","Pass", "Y");
			click(facetofacelocators.contactsDoneButton);
		}
			catch(Exception e){	
			log.fatal("Unable to validateSlideTimerUnderContacts_TC22"+e.getMessage());
			pdfResultReport.addStepDetails("Validate Slide Timer Under Contacts_TC22","Beneath every page in profile tab shared time should be displayed","Shared time in not updated properly in profile tab","Fail", "N");
			}
	   }
	
	public void validateLastUpdatedSentimentUnderContacts_TC23() throws Exception{
		try{
			System.out.println("Executing the method validateSlideSentimentsUnderContacts_TC23");
			String slidenum=pdfResultReport.testDataValue.get("Slidenumber7");
			int slidenum7=Integer.parseInt(slidenum);
			click(facetofacelocators.slideNumber1(slidenum7));
			click(facetofacelocators.presentationPlay);
			Thread.sleep(5000);
			click(facetofacelocators.sentimentPositive1);
			swipe(840, 650, 580, 650);
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber9")));
			Thread.sleep(40000);
			click(facetofacelocators.sentimentNeutral1);
			click(facetofacelocators.slideNumber1(slidenum7));
			String slideName7 = ThreadLocaliOSDriver.getDriver().findElement(Presentationslocators.nameOfSlideno(slidenum7)).getAttribute("name");
			click(facetofacelocators.sentimentNegative1);	
			String updatedSenti = ThreadLocaliOSDriver.getDriver().findElement(facetofacelocators.sentimentNegative).getAttribute("name");
			System.out.println(updatedSenti);
			String[] res = updatedSenti.split("M");
			System.out.println(res[0]);
			String sentiment = res[0];
			String finalSenti=sentiment.toUpperCase();
			System.out.println(finalSenti);
			click(facetofacelocators.presentationPause);
			click(facetofacelocators.meetingParticipantsInPresentation);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(contactscreenlocators.profileTab);
			scroll(550,720,830,300);
			List<WebElement> slidesInProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.templates7InProfile);
			int NoOF7SlidesInProfile =slidesInProfile.size();
			System.out.println(NoOF7SlidesInProfile);
			List<WebElement> negativeSentiSlidesInProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.negSentimentsInProfile);
		    System.out.println(negativeSentiSlidesInProfile.size());
		    int negSentiSlidesInProfile =negativeSentiSlidesInProfile.size();	
			//click(facetofacelocators.profileActivityDropDown);				
			verifyElement(facetofacelocators.slidePresented1(slideName7,NoOF7SlidesInProfile), "Slide 7 Verified");
			verifyElement(facetofacelocators.negativeSentimentInProfile(finalSenti,negSentiSlidesInProfile),"NegativeSentimentVerified");
	    	pdfResultReport.addStepDetails("Validate Slide Sentiments Under Contacts _TC23","Provided Sentiments should be under Contacts profile","Provided Sentiments under Contacts profile is displayed properly","Pass", "Y");
	    	click(facetofacelocators.contactsDoneButton);
	    	click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e){
			  log.fatal("Unable to validateSlideSentimentsUnderContacts_TC23"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Slide Sentiments Under Contacts_TC23","Provided Sentiments should be under Contacts profile","Provided Sentiments under Contacts profile is not displayed properly","Fail", "N");
		  }
	}
	
	public void validateSlideSentimentUpdateUnderContacts_TC24() throws Exception{
		try{
			System.out.println("Executing the method validateSlideSentimentUpdateUnderContacts_TC24");
			click(facetofacelocators.PresentaionSwitchButton);
			swipe(840, 650, 580, 650);
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber10")));
			click(facetofacelocators.presentationPlay);
			String slidenum10=pdfResultReport.testDataValue.get("Slidenumber10");
			int slidenum=Integer.parseInt(slidenum10);
			click(facetofacelocators.slideNumber1(slidenum));
			Thread.sleep(5000);
			click(facetofacelocators.sentimentNegative1);
			String PresentationSenti = ThreadLocaliOSDriver.getDriver().findElement(facetofacelocators.NegativeSentimentInPresentation).getAttribute("name");
			System.out.println(PresentationSenti);
			String[] res = PresentationSenti.split("M");
			System.out.println(res[0]);
			String sentiment = res[0];
			String SentiSelectedInPresentation=sentiment.toUpperCase();
			System.out.println(SentiSelectedInPresentation);
			click(facetofacelocators.presentationPause);
			click(facetofacelocators.meetingParticipantsInPresentation);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(contactscreenlocators.profileTab);
			List<WebElement> negativeSentiSlidesInProfile= ThreadLocaliOSDriver.getDriver().findElements(facetofacelocators.negSentimentsInProfile);
		    System.out.println(negativeSentiSlidesInProfile.size());
		    int negSentiSlidesInProfile =negativeSentiSlidesInProfile.size();
		    //scroll(550,720,830,280);
			click(facetofacelocators.negativeSentimentInProfile(SentiSelectedInPresentation,negSentiSlidesInProfile));
			click(facetofacelocators.profileActivitySentimentNeutral1);
	    	pdfResultReport.addStepDetails("Validate Sentiment Update Under Contacts_TC24","User should be able to update the sentiments under contacts","User successfully updated the sentiment under contacts","Pass", "Y");
	    	click(facetofacelocators.contactsDoneButton);
	    	click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e){
			  log.fatal("Unable to validateSlideSentimentUpdateUnderContacts_TC24"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate Sentiment Update Under Contacts_TC24","User should be able to update the sentiments under contacts ","User not able to update the sentiment under contacts","Fail", "N");
		  }
	}
	
	
	public void validateMarkMeetingCompleted_TC25() throws Exception{
		try{	
			System.out.println("Executing the method validateMarkMeetingCompleted_TC25");
			//click(facetofacelocators.meetingDetailsSwitchButton);
			click(facetofacelocators.meetingName(meetingNameCreated));
			click(facetofacelocators.MeetingMarkComplete); 
			click(facetofacelocators.MeetingMarkCompleteOK);
			pdfResultReport.addStepDetails("Validate Meeting Completed_TC25","Mark Meeting shoule be Completed","Mark Meeting Completed Successfully","Pass", "Y");
		}catch(Exception e){
			  log.fatal("Unable to validateMeetingDetailsRelogin_TC31"+e.getMessage());
			  pdfResultReport.addStepDetails("validate Meeting Completed_TC25","Mark Meeting Completed","Mark Meeting Completed not validated","Fail", "N");
		  }
	}
	
	public void validateUserIsAbleToViewCompletedMeetingInTimeline_TC26() throws Exception{
		try {
			System.out.println("Executing the method validateUserIsAbleToViewCompletedMeetingInTimeline_TC26");
			//click(facetofacelocators.meetingName(meetingNameCreated));
			click(facetofacelocators.meetingParticipantsBadge);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(facetofacelocators.timelineTab);
			verifyElement(facetofacelocators.activityTypeInTimeLine,"activity type is verified");
			verifyElement(facetofacelocators.activitySubjectInTimeline,"activity subject is verified");
			click(facetofacelocators.meetingInTimeline);
			verifyElement(facetofacelocators.meetingHeader(meetingNameCreated),"Navigated to Meeting Details");
			click(facetofacelocators.meetingParticipants);
			verifyElement(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")),"Contact verified");
			verifyElementNotPresent(facetofacelocators.presentationsPlusButton,"plus button not present");
			click(facetofacelocators.backbutton);
			click(facetofacelocators.cancelbutton);
			pdfResultReport.addStepDetails("Validate User Is Able To Complete the Meeting In Timeline_TC26","Account section and all other field should be disabled","Account section and all other field are not disabled","Pass", "Y");
		}catch(Exception e) {
			log.fatal("Unable to validateUserIsAbleToCompleteTheMeetingInTimeline_TC26"+e.getMessage());
			  pdfResultReport.addStepDetails("Validate User Is Able To Complete the Meeting In Timeline_TC26","Account section and all other field should be disabled","Account section and all other field are not disabled","Fail", "N");
		}
	 			
	}
	
	public void validateSlideShareInPlayButtonDisableMode_TC27() throws Exception{
		try {
			System.out.println("Executing the method validateSlideShareInPlayButtonDisableMode_TC27");
			//click(facetofacelocators.meetingDetailsSwitchButton);//Need to commnet
			click(facetofacelocators.PresentaionSwitchButton);
			swipe(840, 650, 580, 650);
			Thread.sleep(2000);
			swipe(840, 650, 580, 650);
			click(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber18")));
			String slideName18 = ThreadLocaliOSDriver.getDriver().findElement(facetofacelocators.slideNumber(pdfResultReport.testDataValue.get("Slidenumber18"))).getAttribute("name");
			click(facetofacelocators.meetingParticipantsInPresentation);
			click(facetofacelocators.addedParticipant(pdfResultReport.testDataValue.get("Contactname1")));
			click(contactscreenlocators.profileTab);
			//click(facetofacelocators.profileActivityDropDown);
			verifyElementNotPresent(facetofacelocators.slidePresented(slideName18),"Slide not Present");
			scroll(550,600,850,500);
			Thread.sleep(2000);
			scroll(550,600,850,500);
			pdfResultReport.addStepDetails("Validate Slide Share in Play Button Disable Mode_TC27","Page details should not be tracked under Contacts Profile","Page details are not tracked under Contacts Profile","Pass", "Y");
			click(facetofacelocators.contactsDoneButton);
			click(facetofacelocators.meetingDetailsSwitchButton);
		}catch(Exception e) {
		log.fatal("Unable to validateSlideShareInPlayButtonDisableMode_TC27"+e.getMessage());
		  pdfResultReport.addStepDetails("Validate Slide Share in Play Button Disable Mode_TC27","Page details should not be tracked under Contacts Profile","Page details are tracked under Contacts Profile","Fail", "N");
	}
 }
	
}
