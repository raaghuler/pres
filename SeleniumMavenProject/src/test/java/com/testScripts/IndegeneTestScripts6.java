package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.Indegene_ActivitiesPage_Components;
import com.components.Indegene_FacetoFace_Components;
import com.components.Indegene_LoginPage_Components;
import com.components.Indegene_RemoteMeeting_Components;
import com.components.Indegene_ToolsDrawer_Components;
import com.mobileUtilities_iOS.BaseClass_iOS;

public class IndegeneTestScripts6 extends BaseClass_iOS {
	public Indegene_LoginPage_Components loginPageComponents =new Indegene_LoginPage_Components(pdfResultReport);
	public Indegene_FacetoFace_Components faceTofaceComponents =new Indegene_FacetoFace_Components(pdfResultReport);
	public Indegene_RemoteMeeting_Components remoteMeetingComponents = new Indegene_RemoteMeeting_Components(pdfResultReport);
	public Indegene_ActivitiesPage_Components ActivitiesPageComponents =new Indegene_ActivitiesPage_Components(pdfResultReport); 
	public Indegene_ToolsDrawer_Components ToolDrawerComponents =new Indegene_ToolsDrawer_Components(pdfResultReport);
	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nagesh");
		}
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Face to face Meetings")
	public void f(String no) throws Throwable {
	  pdfResultReport.readTestDataFile("/Users/jayaswi_guest/Desktop/IndegeneAutomation18thJan2019/Resources/Indegene_Testdata3.xlsx", no);
	  loginPageComponents.validateLoginPage_TC1();
	  loginPageComponents.verifyLoginUsername_TC2();
	  loginPageComponents.VerifyLoginPassword_TC2a();
	  remoteMeetingComponents.verifyPlayPauseFunctionalityInMeetingPresentation_TC01a();; 
	  ActivitiesPageComponents.verifyAddParticipant_TC2();
	  remoteMeetingComponents.verifySentimentsForPages_TC21();
	  remoteMeetingComponents.verifyProductAndKeyMessagesUnderContactProfile_TC22();
	  remoteMeetingComponents.verifySentimentUnderContactsProfile_TC23();
	  remoteMeetingComponents.verifySlidesUnderContacts_TC24();
	  remoteMeetingComponents.verifySlideTimerUnderContacts_TC25();
	  remoteMeetingComponents.verifyLastUpdatedSentimentUnderContacts_TC26();
	  remoteMeetingComponents.verifySlideSentimentUpdatedUnderContacts_TC27();
	  remoteMeetingComponents.verifyUnSelectPageSharedForParticipantInProfileTab_TC28();
	  remoteMeetingComponents.verifyKeymessageUnselectWhileUnSelectPageSharedForParticipant_TC29();
	  //remoteMeetingComponents.validatePresentationHistoryUserReloginsIntoApp_TC30();
	  faceTofaceComponents.createMeetingwithNewMeeting();
	  remoteMeetingComponents.verifyMeetingDetailsAfterNavigatingDifferentMeetings_TC32();
	  remoteMeetingComponents.verifyMarkMeetingCompleted_TC33(); 
	  remoteMeetingComponents.verifyUserIsAbleToViewCompletedMeetingInTimeline_TC34(); 
	  remoteMeetingComponents.verifyDataInTimelinePersistAfterRelogin_TC35();
	  ToolDrawerComponents.verifyLogout();
	
  	  

	}
}
