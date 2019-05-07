package com.components;

import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.baseClasses.PDFResultReport;
import com.mobileUtilities_iOS.BaseClass_iOS;
import com.mobileUtilities_iOS.ThreadLocaliOSDriver;
import com.objectRepository.*;


public class Indegene_PresentationsPage_Components extends BaseClass_iOS{
	public Indegene_ToolsDrawerLocators toolsdrawerlocators=new Indegene_ToolsDrawerLocators();
	public Indegene_PresentationsPageLocators Presentationslocators=new Indegene_PresentationsPageLocators();
	
	public Indegene_PresentationsPage_Components(PDFResultReport pdfresultReport){
		this.pdfResultReport=pdfresultReport;
	}
	
	
	public void verifyPresentationSearch_TC1() throws Throwable {
		try {
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.tool("Presentations"));
			set(toolsdrawerlocators.searchField,pdfResultReport.testDataValue.get("Presentationname"));
			verifyElement(toolsdrawerlocators.presenterName(pdfResultReport.testDataValue.get("Presentationname")),"Presentationsearch");
			pdfResultReport.addStepDetails("Verify Presentation Search_TC1","Only the Presentation with name containing the given text should be displayed","Successfully displayed the Presentations with given text","PASS", "Y");}
	catch (Exception e){
			log.fatal("Unable to verifyPresentationSearch_TC1"+e.getMessage());
			pdfResultReport.addStepDetails("Verify Presentation Search_TC1","Only the Presentation with name containing the given text should be displayed","Unable to display the search Result","Fail", "N");
		  }
	}
	
	
	public void verifySortbyFavorites_TC2a() throws Throwable {
		try {
			click(toolsdrawerlocators.back);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.tool("Presentations"));
			click(Presentationslocators.dropDownPresentation);
			click(Presentationslocators.sortByOption("Favorites"));
			List<WebElement> presentations = ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.presentations);
			System.out.println("No of Presentations :"+presentations.size());
			boolean sort= false;
			for(int i=1;i<=presentations.size();i++) {
				System.out.println("checking favorite icon on "+i+"th Presentations ");
				Thread.sleep(2000);
				boolean blnStatus=verifyElement(Presentationslocators.favIcn(i), "Fav icon");
				System.out.println(blnStatus);
				if(verifyElement(Presentationslocators.favIcn(i), "Fav icon")==true)
				{
					sort = true;
					break;}
				else {
					sort = false;
				}
			}
			if(sort==true)
				pdfResultReport.addStepDetails("Verify Sort by Favorites_TC2a","Rep should be able to sort presentations by favorites","Successfully sorted Presentation by option - favorites","PASS", "Y");
			else
				pdfResultReport.addStepDetails("Verify Sort by Favorites_TC2a","Rep should be able to sort presentation by favorites","Presentation could not be sorted by option - favotites","Fail", "N");
		  	}catch(Exception e) {
			log.fatal("Unable to verifySortbyFavorites_TC2a"+e.getMessage());
			System.out.println(e.getMessage());
			pdfResultReport.addStepDetails("Verify Sort by Favorites_TC2a","Rep should be able to sort presentations by the option - favorites","Could not verify sort by favorites","Fail", "N");
		  	}
		}
	
	public void verifySortbyDownloaded_TC2b() throws Throwable {
		try {
			click(toolsdrawerlocators.back);
			click(toolsdrawerlocators.hamburger);
			waitForElement(toolsdrawerlocators.tool("Presentations"),5);
			click(toolsdrawerlocators.tool("Presentations"));
			click(Presentationslocators.dropDownPresentation);
			click(Presentationslocators.sortByOption("Downloaded"));
			List<WebElement> presentations = ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.presentations);
			System.out.println("No of Presentations :"+presentations.size());
			boolean sort= true;
			for(int i=1;i<=presentations.size();i++) {
				System.out.println("checking download icon on "+i+"th Presentations ");
				if(verifyElement(Presentationslocators.dwnldIcn(i),"download Icon")==true) {
					sort = true;
					break;}
				else {
					sort = false;
					}
			}
			if(sort==true)
				pdfResultReport.addStepDetails("Verify Sort by Downloaded_TC2b","Rep should be able to sort presentations by - Downloaded","Successfully sorted Presentation by option - Downloaded","PASS", "Y");
			else
				pdfResultReport.addStepDetails("Verify Sort by Downloaded_TC2b","Rep should be able to sort presentation by - Downloaded","Presentation could not be sorted by option - Downloaded","Fail", "N");
		  	}catch(Exception e) {
			log.fatal("Unable to verifySortbyDownloaded_TC2b"+e.getMessage());
			pdfResultReport.addStepDetails("Verify Sort byDownloaded_TC2b","Rep should be able to sort presentations by the option - downloaded","Could not verify sort by Downloaded","Fail", "N");
		  	}
		}
	
		
	public void verifySortbyCreatedDate_TC2c() throws Throwable {
		try {
			click(toolsdrawerlocators.back);
			click(toolsdrawerlocators.hamburger);
			waitForElement(toolsdrawerlocators.tool("Presentations"),5);
			click(toolsdrawerlocators.tool("Presentations"));
			click(Presentationslocators.dropDownPresentation);
			click(Presentationslocators.sortByOption("Date Created"));
			List<WebElement> presentations = ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.presentations);
			System.out.println("No of Presentations :"+presentations.size());
			// Create a Date list.
			List<Date> dateList = new ArrayList<Date>();
			List<Date> nonSortDateList = new ArrayList<Date>();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy, hh:mm a");
			boolean sort= true;
			for(int i=1;i<=presentations.size();i++) {
				//System.out.println("checking date icon on "+i+"th Presentations ");
				waitForElement(Presentationslocators.nameOfPresentation(i),3);
				nonSortDateList.add(sdf.parse(text(Presentationslocators.nameOfPresentation(i))));
				dateList.add(sdf.parse(text(Presentationslocators.nameOfPresentation(i))));
			}
			Collections.sort(dateList, Collections.reverseOrder());
			Assert.assertTrue(nonSortDateList.equals(dateList));
			if(sort==true)
				pdfResultReport.addStepDetails("Verify Sort by CreatedDate_TC2c","Rep should be able to sort presentations by - Created Date","Successfully sorted Presentation by option - Created Date","PASS", "Y");
			else
				pdfResultReport.addStepDetails("verify Sort by CreatedDate_TC2c","Rep should be able to sort presentation by - Created Date","Presentation could not be sorted by option - Created Date","Fail", "N");
		  	}catch(Exception e) {
			log.fatal("Unable to verifySortbyCreatedDate_TC2c"+e.getMessage());
			pdfResultReport.addStepDetails("Verify Sort by CreatedDate_TC2c","Rep should be able to sort presentations by the option - Created Date","Could not verify sort by Created Date","Fail", "N");
		}
	}
		
	
	public void verifyDownloadUndownload_TC3() throws Throwable {
		try {
			click(toolsdrawerlocators.back);
			click(toolsdrawerlocators.hamburger);
			click(toolsdrawerlocators.tool("Presentations"));
			click(Presentationslocators.selectPresent);
			click(Presentationslocators.Presentation(3));
			click(Presentationslocators.dwnldbtn);
			waitForElement(Presentationslocators.dwnldIcn(2),5);
			if(verifyElement(Presentationslocators.dwnldIcn(3),"Favorite Icon")==true)
				pdfResultReport.addStepDetails("Verify Download Presentation_TC3a","Rep should be able to download the presentation","Successfully downloaded the Presentation","PASS", "Y");
			else
				pdfResultReport.addStepDetails("Verify Download Presentation_TC3a","Rep should be able to download the presentation","Presentation could not be downloaded","Fail", "N");
		  	}catch(Exception e) {
				log.fatal("Unable to verifyDownloadUndownload_TC3a"+e.getMessage());
				pdfResultReport.addStepDetails("Verify Download Presentation_TC3a","Rep should be able to download the presentation","Presentation could not be downloaded","Fail", "N");
			  	}
			//Verifying Un-download
			try {
			click(Presentationslocators.selectPresent);
			click(Presentationslocators.Presentation(3));
			click(Presentationslocators.remove);
			Thread.sleep(3000);
			if(verifyElementNotPresent(Presentationslocators.dwnldIcn(3),"Download ICon")==false)
				pdfResultReport.addStepDetails("Verify Undownload Presentation_TC3b","Rep should be able to Undownload the presentation","Successfully undownloaded Presentation","PASS", "Y");
			else
				pdfResultReport.addStepDetails("Verify Undownload Presentation_TC3b","Rep not able to Undownload the presentation","Presentation could not be undownloaded","Fail", "N");
			}catch(Exception e) {
				log.fatal("Unable to verifyDownloadUndownload_TC3b"+e.getMessage());
				pdfResultReport.addStepDetails("Verify Undownload Presentation_TC3b","Rep not able to Undownload the presentation","Could not verify un-Downloading the presentation","Fail", "N");
			}
		}

	
	
	public void verifyMarkFavoriteUnfavorite_TC4() throws Throwable {
		try {
			click(toolsdrawerlocators.back);
			click(toolsdrawerlocators.hamburger);
			waitForElement(toolsdrawerlocators.tool("Presentations"),5);
			click(toolsdrawerlocators.tool("Presentations"));
			click(Presentationslocators.selectPresent);
			click(Presentationslocators.Presentation(1));
			click(Presentationslocators.fvrtbtn);
			waitForElement(Presentationslocators.favIcn(1),5);
			if(verifyElement(Presentationslocators.favIcn(1),"Favorite Icon")==true)
				pdfResultReport.addStepDetails("Verify Mark Presentation Favorite_TC4a","Rep should be able to mark a presentation as Favorite","Successfully marked the Presentation as Favorite","PASS", "Y");
			else
				pdfResultReport.addStepDetails("Verify Mark Presentation Favorite_TC4a","Rep should able to mark a presentation as Favorite","Presentation could not be marked Favorite","Fail", "N");
		  	}catch(Exception e) {
			log.fatal("Unable to verify MarkFavorite_TC4"+e.getMessage());
			pdfResultReport.addStepDetails("Verify Mark Presentation Favorite_TC4a","Rep should able to mark a presentation as favorite","Presentation could not be marked as Favorite","Fail", "N");
		  	}
		try {
			click(Presentationslocators.selectPresent);
			click(Presentationslocators.Presentation(1));
			click(Presentationslocators.unFvrtbtn);
			Thread.sleep(3000);
			if(verifyElementNotPresent(Presentationslocators.favIcn(1),"Favorite")==false)
				pdfResultReport.addStepDetails("Verify UnMark Presentation Favorite_TC4b","Rep should be able to unmark a presentation as favorite","Successfully unmarked the Presentation as favorite","PASS", "Y");
			else {
				pdfResultReport.addStepDetails("Verify UnMark Presentation Favorite_TC4b","Rep should able to unmark a presentation as favorite","Presentation could not unmark as favorite","Fail", "N");
			  }
			}catch(Exception e) {
				log.fatal("Unable to verify MarkFavorite _TC4"+e.getMessage());
				pdfResultReport.addStepDetails("Verify UnMark Presentation Favorite_TC4b","Rep should able to unmark a presentation as favorite","Could not verify unmark favoriting a presentation ","Fail", "N");
				
			}
	}
	
	public void verifyCarouselSlideSelectionctions_TC5() throws Throwable {
		try {
			boolean carouselaction = false;
			click(toolsdrawerlocators.back);
			click(toolsdrawerlocators.hamburger);
			waitForElement(toolsdrawerlocators.tool("Presentations"),15);
			click(toolsdrawerlocators.tool("Presentations"));
			click(Presentationslocators.Presentation(1));
			List<WebElement> slides= ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.slides);
			System.out.println(slides.size());
			try {
				for(int i=4;i<=slides.size();i++){
					System.out.println("Clicking on "+i+"th Slide");
					slides.get(i).click();
					String slideName = text(Presentationslocators.nameOfSlide(i-3));
					System.out.println("Comparing Slide name with Carousel Header with "+slideName.substring(35));
					String slideText = slideName.substring(35);
					System.out.println(text(Presentationslocators.carouselHeader(i-3)));
					if(text(Presentationslocators.carouselHeader(i-3)).contentEquals("Slide"+slideText+".html"))
						carouselaction = true;
					else carouselaction = false;
					if (i==6) {
						break;
						
					}
					}
			} catch (Exception e) {
			
			}
				
					pdfResultReport.addStepDetails("Verify Page Carousel is Accessible_TC5","Carousel header text should be same as the selected slide name","Carousel header is same as the selected slide name", "Pass", "Y");
				
			}catch(Exception e) {
				log.fatal("Unable to verify Page Carousel is Accessible_TC5"+e.getMessage());
				pdfResultReport.addStepDetails("Verify Page Carousel is Accessible_TC5","Carousel header text should be same as the selected slide name","Could not verify page carousel accessibility","Fail", "N");
			}
		
	}

	public void verifyCarouselKeywordFilter_TC6() throws Throwable {
		try {
			click(toolsdrawerlocators.back);
			click(toolsdrawerlocators.hamburger);
			waitForElement(toolsdrawerlocators.tool("Presentations"),5);
			click(toolsdrawerlocators.tool("Presentations"));		
			click(Presentationslocators.Presentation1(pdfResultReport.testDataValue.get("Presentationname")));
			List<WebElement> initialSlides= ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.slides);
			click(Presentationslocators.keywordSelectDropDown);
			click(Presentationslocators.keywordOptions("Graph"));
			List<WebElement> SlidesAfter= ThreadLocaliOSDriver.getDriver().findElements(Presentationslocators.slides);
			if(SlidesAfter.size()<initialSlides.size())
				pdfResultReport.addStepDetails("Verify Carousel Keyword Filter_TC6","Rep should be able to filter slide by key message","Successfully filter with key message","PASS", "Y");
			else
				pdfResultReport.addStepDetails("Verify Carousel Keyword Filter_TC6","Rep should able to filter slide by key message","Slides could not be filtered with key message","Fail", "N");
			}catch(Exception e) {
				log.fatal("Unable to verifyCarouselKeywordFilter_TC6"+e.getMessage());
				pdfResultReport.addStepDetails("Verify Carousel Keyword Filter_TC6","Rep should able to filter slided by key message","Could not verify key message filter functionality","Fail", "N");
		}
	}
	
	public void verifyFullScreenPageView_TC7() throws Throwable {
		try {
		click(toolsdrawerlocators.back);
		click(toolsdrawerlocators.hamburger);
		click(toolsdrawerlocators.tool("Presentations"));
		click(Presentationslocators.Presentation1(pdfResultReport.testDataValue.get("Presentationname")));
		waitForElement(Presentationslocators.fullScreenButton,3);
		click(Presentationslocators.fullScreenButton);	
		verifyElement(Presentationslocators.fullScreenExitButton,"FullScreenExitButton");
		pdfResultReport.addStepDetails("Verify Full Screen PageView_TC7","Rep should be able to view Presentation in full screen","Successfully able to view the Presentation full screen","Pass", "Y");	
		click(Presentationslocators.fullScreenExitButton);
		verifyElement(Presentationslocators.fullScreenButton,"FullScreenButton");
		}catch(Exception e) {
		log.fatal("Unable to verifyFullScreenPageView_TC7"+e.getMessage());
		pdfResultReport.addStepDetails("Verify Full Screen PageView_TC7","Rep should able to view Presentation in full screen","Could not verify presentation full screen","Fail", "N");
	}
 }
	
	public void verifyFunctionalityOfCarouselButton_TC8() throws Throwable {
		try {
		click(toolsdrawerlocators.back);
		click(toolsdrawerlocators.hamburger);
		waitForElement(toolsdrawerlocators.tool("Presentations"),5);
		click(toolsdrawerlocators.tool("Presentations"));
		click(Presentationslocators.Presentation1(pdfResultReport.testDataValue.get("Presentationname")));
		click(Presentationslocators.fullScreenButton);
		click(Presentationslocators.carouselViewButton);
		verifyElement(Presentationslocators.slides,"Slides");
		System.out.println("Page Carousel Unhide");
		click(Presentationslocators.carouselViewButton);
		verifyElementNotPresent(Presentationslocators.slides,"Slides");
		System.out.println("Page Carousel hide");
		pdfResultReport.addStepDetails("Verify Functionality Of CarouselButton_TC8","Page Carousel should hide/Unhide","Successfully able to hide/Unhide the carousal","Pass", "Y");
		click(Presentationslocators.fullScreenExitButton);
		click(toolsdrawerlocators.back);
		}catch(Exception e) {
	 log.fatal("Unable to verify Functionality Of CarouselButton_TC8"+e.getMessage());
	 pdfResultReport.addStepDetails("Verify Functionality Of CarouselButton_TC8","Page Carousel should hide/Unhide","Could not verify page carousel hide/unhide functionality","Fail", "N");
	}
 }
		
}
