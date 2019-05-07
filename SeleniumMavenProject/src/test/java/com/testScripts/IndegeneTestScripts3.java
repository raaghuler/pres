package com.testScripts;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.components.*;
import com.mobileUtilities_iOS.BaseClass_iOS;

public class IndegeneTestScripts3 extends BaseClass_iOS{
	public Indegene_LoginPage_Components loginPageComponents =new Indegene_LoginPage_Components(pdfResultReport); 
	public Indegene_ActivitiesPage_Components ActivitiesPageComponents =new Indegene_ActivitiesPage_Components(pdfResultReport); 
	public Indegene_ToolsDrawer_Components ToolDrawerComponents =new Indegene_ToolsDrawer_Components(pdfResultReport);
	public Indegene_FacetoFace_Components faceTofaceComponents =new Indegene_FacetoFace_Components(pdfResultReport);
	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nagesh");
		}
	
	@Parameters("TestcaseNo")
	@Test(description = "Test the functionality of meeting  creation in Activities")
  public void f(String no) throws Throwable {
	  pdfResultReport.readTestDataFile("/Users/jayaswi_guest/Desktop/IndegeneAutomation18thJan2019/Resources/Indegene_Testdata3.xlsx", no);
	  loginPageComponents.validateLoginPage_TC1();
	  loginPageComponents.verifyLoginUsername_TC2();
	  loginPageComponents.validatePasswordPage_TC1a();
	  loginPageComponents.VerifyLoginPassword_TC2a();
	  //loginPageComponents.selectInstance_TC2b(); // This functionality is not available in current build
	  ActivitiesPageComponents.createMeetingNverifyDetails_TC1();
	  ActivitiesPageComponents.verifyAddParticipant_TC2();
	  ActivitiesPageComponents.verifyAddPresentation_TC3();
	  ActivitiesPageComponents.verifyAddLocation_TC4();
	  ActivitiesPageComponents.verifyAddLocationFromGoogleMap_TC5();
	  ActivitiesPageComponents.verifyAddLocationFromSuggestedList_TC6();	  
	  ActivitiesPageComponents.verifymeetinginAgenda_Day_3Day_TC8();
	  ActivitiesPageComponents.verifyCardActionButtonsUnderEachCard_TC9();
	  faceTofaceComponents.closeMeetingDetails_TC01();
	  ToolDrawerComponents.verifyLogout();
	  }
}
