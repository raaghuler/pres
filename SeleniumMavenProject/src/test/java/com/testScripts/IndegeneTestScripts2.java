package com.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.components.*;
import com.mobileUtilities_iOS.BaseClass_iOS;

public class IndegeneTestScripts2 extends BaseClass_iOS{
	public Indegene_LoginPage_Components loginPageComponents =new Indegene_LoginPage_Components(pdfResultReport); 
	public Indegene_PresentationsPage_Components PresentationsPageComponents =new Indegene_PresentationsPage_Components(pdfResultReport); 
	public Indegene_ToolsDrawer_Components ToolDrawerComponents =new Indegene_ToolsDrawer_Components(pdfResultReport);
	public void initializeRepository() throws Exception {		
		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "Nagesh");
		}
	
	@Parameters("TestcaseNo")
	@Test(description = "Test the functionality of Presentations")
  public void f(String no) throws Throwable {
	  pdfResultReport.readTestDataFile("/Users/jayaswi_guest/Desktop/IndegeneAutomation18thJan2019/Resources/Indegene_Testdata3.xlsx", no);
	  
	   loginPageComponents.validateLoginPage_TC1();
	   loginPageComponents.verifyLoginUsername_TC2();
	   loginPageComponents.validatePasswordPage_TC1a();
	   loginPageComponents.VerifyLoginPassword_TC2a();
	   //loginPageComponents.selectInstance_TC2b();
	   PresentationsPageComponents.verifyPresentationSearch_TC1();
	   PresentationsPageComponents.verifySortbyFavorites_TC2a();
	   PresentationsPageComponents.verifySortbyDownloaded_TC2b();
	   PresentationsPageComponents.verifySortbyCreatedDate_TC2c();
	   PresentationsPageComponents.verifyDownloadUndownload_TC3();
	   PresentationsPageComponents.verifyMarkFavoriteUnfavorite_TC4();
	   PresentationsPageComponents.verifyCarouselSlideSelectionctions_TC5();
	   PresentationsPageComponents.verifyCarouselKeywordFilter_TC6();
	   PresentationsPageComponents.verifyFullScreenPageView_TC7(); 
	   PresentationsPageComponents.verifyFunctionalityOfCarouselButton_TC8();
	   ToolDrawerComponents.verifyLogout();
	  }
}
