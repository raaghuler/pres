package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.Indegene_ActivitiesPage_Components;
import com.components.Indegene_FacetoFace_Components;
import com.components.Indegene_LoginPage_Components;
import com.components.Indegene_ToolsDrawer_Components;
import com.mobileUtilities_iOS.BaseClass_iOS;

public class IndegeneTestScripts4 extends BaseClass_iOS{
	public Indegene_LoginPage_Components loginPageComponents =new Indegene_LoginPage_Components(pdfResultReport);
	public Indegene_FacetoFace_Components faceTofaceComponents =new Indegene_FacetoFace_Components(pdfResultReport);
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
	  loginPageComponents.validatePasswordPage_TC1a();
	  loginPageComponents.VerifyLoginPassword_TC2a();
	  //loginPageComponents.selectInstance_TC2b(); //Currently Removed from the application  
	  ActivitiesPageComponents.createMeetingNverifyDetails_TC1();
	  ActivitiesPageComponents.verifyAddParticipant_TC2();
	  ActivitiesPageComponents.verifyAddPresentation_TC3();	  
	  faceTofaceComponents.validateParticipantBadgeInMeetingDetail_TC04();
	  faceTofaceComponents.validatePresentationBadgeInMeetingDetail_TC05();
	  faceTofaceComponents.validateMeetingPresentationSwitch_TC06();
	  faceTofaceComponents.validatePresentationCaurosel_TC07();
	  //faceTofaceComponents.validatePresentationScreenShot_TC08();//Capture screenshot button removed
	  faceTofaceComponents.validatePratcipantBadgeCount_TC09();
	  faceTofaceComponents.validatePresentationPlayPause_TC10();
	  faceTofaceComponents.validatemeetingDetailsSwitch_TC11();
	  faceTofaceComponents.validateSlideSentimentUpdateUnderContacts_TC24();
	  faceTofaceComponents.validatePresentationSlides_TC12(); 
	  faceTofaceComponents.validateProductAndKeyMessagesTickedInMeetingDetails_TC13();
	  faceTofaceComponents.validateProductsAndKeyMessagesInMeetingDetails_TC14();
	  faceTofaceComponents.validateFilterPresentationAndPreviewPage_TC16();
	  ActivitiesPageComponents.verifyRemovePresentation_TC3a();
	  faceTofaceComponents.validateFilterKeyMessageAndPreviewPage_TC17();
	  faceTofaceComponents.validateSentimentsForPages_TC18();
	  faceTofaceComponents.validateProductAndKelyMessagesUnderContacts_TC19();
	  faceTofaceComponents.validateSentimentUnderContacts_TC20();
	  faceTofaceComponents.validateSlidesUnderContacts_TC21();
	  faceTofaceComponents.validateSlideTimerUnderContacts_TC22();
 	  faceTofaceComponents.validateLastUpdatedSentimentUnderContacts_TC23();
	 
	  faceTofaceComponents.validateSlideShareInPlayButtonDisableMode_TC27(); 
	  //faceTofaceComponents.validateMeetingDetailsRelogin_TC15(); 
	  faceTofaceComponents.validateTickmarkInMeetingDetail_TC02();
	  faceTofaceComponents.verifyAccessToParticipentsAndAccountsForCompletedMeeting_TC03();
	  faceTofaceComponents.validateUserIsAbleToViewCompletedMeetingInTimeline_TC26();
	  ToolDrawerComponents.verifyLogout();

  }
}
