package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.Indegene_ActivitiesPage_Components;
import com.components.Indegene_FacetoFace_Components;
import com.components.Indegene_LoginPage_Components;
import com.components.Indegene_RemoteMeeting_Components;
import com.components.Indegene_ToolsDrawer_Components;
import com.mobileUtilities_iOS.BaseClass_iOS;

public class IndegeneTestScripts5 extends BaseClass_iOS {
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
	  //loginPageComponents.selectInstance_TC2b(); //Functionality currently removed
	  remoteMeetingComponents.verifyPlayPauseFunctionalityInMeetingPresentation_TC01(); 
	  remoteMeetingComponents.verifyAddParticipantInToFieldOfEmailPage_TC04();
	  ActivitiesPageComponents.verifyAddParticipant_TC2();
	  //remoteMeetingComponents.verifyUserAbleToSendInfoToParticipant_TC03();//dropdown locartor not working 
	  remoteMeetingComponents.verifyUserAbleToJoinAsInvitedParticipant_TC05(); 
	  remoteMeetingComponents.verifyParticipantAbleToJoinMeetingAsGuest_TC06();
	  remoteMeetingComponents.verifyParticipantBadgeCountAfterGuestJoinTheMeeting_TC07();
	  remoteMeetingComponents.verifyParticipantBadgeCountAfterRemovingUser_TC08(); 
	  //remoteMeetingComponents.verifyNotificationBannerAfterParticipantJoinMeeting_TC09();//Banner test case
	  ActivitiesPageComponents.verifyAddParticipant_TC2();
	  remoteMeetingComponents.verifyInvitedParticiapntsAndOtherContactsAreGrouptedSeparately_TC10();
	  //remoteMeetingComponents.verifyNotificationBannerWhileParticipantLeaveMeeting_TC11();*///Banner test case
	  remoteMeetingComponents.verifySlidesShareToRemoteParticipant_TC12();
	  remoteMeetingComponents.verifySlideShareWhileGuestParticipantJoinsInBetween_TC13(); 
	  remoteMeetingComponents.verifySlideShareResumesRemotely_TC14(); 
	  remoteMeetingComponents.verifySlideSharePausesRemotely_TC15();  
	  remoteMeetingComponents.verifyTwoEntriesForPausesAndReplayesSamePageUnderContacts_TC16();
	  remoteMeetingComponents.verifySlidesharedKeymessageandProduct_TC17();
	  remoteMeetingComponents.verifyManualselectKeymessageandProduct_TC18();
	  remoteMeetingComponents.verifyFilterPresentationAndPreviewPage_TC19(); 
	  remoteMeetingComponents.verifyFilterKeyMessageAndPreviewPage_TC20();
	  ToolDrawerComponents.verifyLogout();

	}
}
