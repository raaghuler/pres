package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.components.Indegene_ContactScreen_Components;
import com.components.Indegene_FacetoFace_Components;
import com.components.Indegene_LoginPage_Components;
import com.components.Indegene_ToolsDrawer_Components;
import com.mobileUtilities_Android.BaseClass_Android;
import com.mobileUtilities_iOS.BaseClass_iOS;

public class IndegeneTestScripts1 extends BaseClass_Android{
	public Indegene_LoginPage_Components loginPageComponents =new Indegene_LoginPage_Components(pdfResultReport); 
	public Indegene_ToolsDrawer_Components ToolDrawerComponents =new Indegene_ToolsDrawer_Components(pdfResultReport);
	public Indegene_ContactScreen_Components contactScreenComponents =new Indegene_ContactScreen_Components(pdfResultReport);
	public Indegene_FacetoFace_Components facetofaceComponents =new Indegene_FacetoFace_Components(pdfResultReport);
	
	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nagesh");
	}
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test Login Functionality and Tools drawers Content ")
  public void f(String no) throws Exception {
	  pdfResultReport.readTestDataFile(System.getProperty("user.dir")+"/Resources/Indegene_Testdata3.xlsx", no);
	  
	  //initializeRepository();
	  loginPageComponents.validateLoginPage_TC1();
	  loginPageComponents.verifyLoginUsername_TC2();
	  loginPageComponents.validatePasswordPage_TC1a();
	  loginPageComponents.VerifyLoginPassword_TC2a();
	  //loginPageComponents.selectInstance_TC2b();
	  Thread.sleep(2000);
	  ToolDrawerComponents.validateToolsDrawerMenuOptions_TC3();
	  ToolDrawerComponents.validateAccountsScreen_TC4();
	  ToolDrawerComponents.validateCalendarScreen_TC5();
	  ToolDrawerComponents.validateContactScreen_TC6();
	  ToolDrawerComponents.validatePresentationScreen_TC7();
	  contactScreenComponents.verifySearchFunctionalityInAccountScreen_TC8();
	  contactScreenComponents.verifySearchFunctionalityInContactScreen_TC9();
	  contactScreenComponents.validateContactScreenTabs_TC10();
	  contactScreenComponents.validateContactScreenInfoTab_TC11();
	  ToolDrawerComponents.verifyLogout();
  }
}
