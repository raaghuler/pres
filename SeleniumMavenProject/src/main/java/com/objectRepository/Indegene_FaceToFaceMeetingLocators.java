package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Indegene_FaceToFaceMeetingLocators {
	
	public By meetingName(String meetingName) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+meetingName+"']");		
	}
	public By meetingHeader(String meetingName) {
	return By.xpath("//XCUIElementTypeNavigationBar[@label='"+meetingName+"']");
	}
	public By meetingcloseButton=By.xpath("//XCUIElementTypeButton[@name='activityDetailToolbarDeleteBarButtonItem']");
	public By meetingcloseConfirm=By.xpath("//XCUIElementTypeButton[@name='Confirm']");
	public By selectParticipant=By.xpath("//XCUIElementTypeStaticText[@name='Select Participants']");
	public By selectProduct=By.xpath("//XCUIElementTypeStaticText[@name='Select Participants']");
	public By meetingTickMark=By.xpath("//XCUIElementTypeButton[@name='activityDetailToolbarMarkCompleteBarButtonItem']");
	public By meetingGreenMark=By.xpath("(//XCUIElementTypeButton)[1]");
	//public By meetingStatus=By.xpath("//XCUIElementTypeStaticText[@name='Status']");
	public By meetingStatus=By.xpath("//XCUIElementTypeStaticText[@name='activityDetailStatusLabel']");
	public By meetingSubject=By.xpath("//XCUIElementTypeStaticText[@name='Subject']");
	public By meetingTime=By.xpath("//XCUIElementTypeStaticText[@name='Time']");
	public By meetingTimeDropDown = By.xpath("//XCUIElementTypeButton[@name='activityDetailTimeDropDownButton']");
	public By done=By.xpath("//XCUIElementTypeButton[@name='Done']");
	public By meetingLocation=By.xpath("//XCUIElementTypeStaticText[@name='Location']");
	public By meetingAccounts=By.xpath("//XCUIElementTypeStaticText[@name='Accounts']");
	
	public By remoteUrl=By.xpath("//XCUIElementTypeButton[@name='activityDetailMeetingUrlLabel_4']");
	public By kyprolisInMeetingDetails=By.xpath("(//XCUIElementTypeOther[@name='activityDetailProductView'])[1]");
    public By customerSatisfactioninMeetingDetails=By.xpath("//XCUIElementTypeCell[@name='productCell_3_0']/XCUIElementTypeButton[5]");
    public By dosingInMeetingDetails=By.xpath("//XCUIElementTypeCell[@name='productCell_3_0']/XCUIElementTypeButton[1]");
    
    
    public By slide5=By.xpath("//XCUIElementTypeButton[@name='Slide5.html']");
    
    
    public By profileCheckbox=By.xpath("(//XCUIElementTypeButton[@name=‘PageStackViewCheckMarkBbutton’]//parent::XCUIElementTypeCell//XCUIElementTypeButton[@name=‘Slide9.html’])");
	public By meetingParticipants=By.xpath("//XCUIElementTypeStaticText[@name='activityDetailParticipantValueLabel']");
	public By meetingParticipantsInPresentation=By.xpath("//XCUIElementTypeButton[@name='ic people']");
	public By slideParticipantsBadge=By.xpath("//XCUIElementTypeButton[@name='ic people']");
	public By meetingParticipantsBadge=By.xpath("//XCUIElementTypeButton[@name='activityDetailToolbarParticipantBarButtonItem']");
	public By meetingPresentationsBadge=By.xpath("//XCUIElementTypeButton[@name='activityDetailToolbarPresentationBarButtonItem']");
	public By slidePresentationBadge=By.xpath("//XCUIElementTypeButton[@name='ic collections']");
	public By meetingDetailBadge=By.xpath("(//XCUIElementTypeButton)[1]");
	public By PresentaionSwitchButton=By.xpath("//XCUIElementTypeButton[@name='activityDetailToolbarSwapBarButtonItem']");
	public By meetingDetailsSwitchButton=By.xpath("//XCUIElementTypeButton[@name='ic swap horiz']");
	public By meetingCauroselButton=By.xpath("//XCUIElementTypeButton[@name='ic view carousel']");
	public By meetingSlideHeader=By.xpath("//XCUIElementTypeNavigationBar/XCUIElementTypeOther");
	public By meetingScreenShotButton=By.xpath("//XCUIElementTypeButton[@name='ic photo camera']");
	public By meetingScreenShotCount=By.xpath("(//XCUIElementTypeButton)[1]");
	public By graphKey =By.xpath("//XCUIElementTypeCell[@name='productCell_3_1']/XCUIElementTypeButton[2]");
	public By presentationSlide=By.xpath("(//XCUIElementTypeButton)[1]");
	public By presentationHeader=By.xpath("//XCUIElementTypeStaticText[@label='Presentations']");
	public By selectPresentation(String PresentationName) {
	return By.xpath("//XCUIElementTypeStaticText[contains(@label,'"+PresentationName+"')]");
		
	}

	public By leaveMeetingPopup = By.xpath("//XCUIElementTypeButton[@name='Keep']");
	public By contactPlusButton=By.xpath("//XCUIElementTypeStaticText[@label='Brijesh Bodla']/following-sibling::XCUIElementTypeButton[@label='ic add'][1]");
	public By contactRemoveButton=By.xpath("(//XCUIElementTypeButton[@name='ic add'])[2]");
	public By contactsDoneButton=By.xpath("(//XCUIElementTypeButton[@name='Done'])");
	public By invitedContact(String Contactname1) { 
	return	By.xpath("(//XCUIElementTypeStaticText[@name='SELECTED']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeStaticText[@name=''"+Contactname1+"''])[1]");
	}
	
	public By presentationsPlusButton=By.xpath("//XCUIElementTypeButton[@label='ic add']");
	public By presentationsDoneButton =By.xpath("//XCUIElementTypeButton[@label='Done']");
	public By presentationsSearchCancelButton =By.xpath("(//XCUIElementTypeButton[@label='Cancel'])[2]");
	public By presentationsBriefCaseTxt =By.xpath("//XCUIElementTypeButton[@label='Briefcase']");
	public By presentationsIcon =By.xpath("//XCUIElementTypeStaticText/../preceding-sibling::XCUIElementTypeOther");
	public By presentationsDropDown =By.xpath("(//XCUIElementTypeButton[@label='drop down'])[1]");
	public By profileActivityDropDown = By.xpath("//XCUIElementTypeButton[@name='ic chevron down']");
	public By profileActivitySentimentDropdown = By.xpath("(//XCUIElementTypeButton[@name='drop down'])[1]");
	public By profileActivitySentimentNeutral = By.xpath("//XCUIElementTypeImage[@name='neutralMoodCell']");
	public By profileActivitySentimentNeutral1 = By.xpath("//XCUIElementTypeApplication[@name=\"Omnipresence\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[2]");
	//profiletimeline
	public By timelineTab = By.xpath("//XCUIElementTypeStaticText[@name='Timeline']");
	public By activityTypeInTimeLine = By.xpath("//XCUIElementTypeStaticText[contains(@text='Meeting')]");
	public By activitySubjectInTimeline = By.xpath("//XCUIElementTypeStaticText[contains(@text='Met By']");
	public By activityDateInTimeline = By.xpath("//XCUIElementTypeStaticText[@name='Met By: Quality Assurance 6']");
	//public By activitySubjectInTimeline1 = By.xpath("(//XCUIElementTypeStaticText[@name='Met By: Me'])[1]");
	public By meetingInTimeline = By.xpath("(//XCUIElementTypeTable)[2]/XCUIElementTypeCell");
	public By backbutton = By.xpath("//XCUIElementTypeButton[@name='Back']");
	public By cancelbutton = By.xpath("//XCUIElementTypeButton[@name='Cancel']");
	public By presentationsAllKeyMessages =By.xpath("//XCUIElementTypeButton[@label='All Key Messages']");
	public By presentationsAllKeyCustomerSatisfication =By.xpath("//XCUIElementTypeStaticText[@name='Customer satisfaction']");
	public By presentationCustomerSatisfication =By.xpath("(//XCUIElementTypeButton)[1]");
	public By sentimentPositive =By.xpath("//XCUIElementTypeImage[@name='positiveMoodCell']");
	public By sentimentPositive1=By.xpath("//XCUIElementTypeApplication[@name=\"Omnipresence\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]");
	public By posSentimentsInProfile =By.xpath("(//XCUIElementTypeButton[@name='POSITIVE_0_0'])");
	public By negSentimentsInProfile = By.xpath("(//XCUIElementTypeButton[@name='NEGATIVE_0_0'])");
	public By templates4InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide4'])");
	public By templates6InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide6'])");
	public By templates7InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide7'])");
	public By templates8InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide8'])");
	public By templates11InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide11.html'])");
	public By templates3InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide3'])");
	public By templates13InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide13.html'])");
	public By templates16InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide16'])");
	public By templates17InProfile = By.xpath("(//XCUIElementTypeButton[@name='Slide17'])");
	public By sentimentNeutral =By.xpath("//XCUIElementTypeImage[@name='neutralMoodCell']");
	public By sentimentNegative =By.xpath("//XCUIElementTypeImage[@name='negativeMoodCell']");
	public By sentimentNegative1=By.xpath("//XCUIElementTypeApplication[@name=\"Omnipresence\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]");
	public By MeetingMarkComplete =By.xpath("//XCUIElementTypeButton[@name='activityDetailToolbarMarkCompleteBarButtonItem']");
	public By MeetingMarkCompleteOK =By.xpath("//XCUIElementTypeButton[@name='OK']");
	public By addPresentation = By.xpath("//XCUIElementTypeButton[@name=\"Add\"]");
	public By agenda =By.xpath("//XCUIElementTypeStaticText[@name='Agenda']");
	public By day =By.xpath("//XCUIElementTypeStaticText[@name='Day']");
	public By customers=By.xpath("//XCUIElementTypeNavigationBar[@name='Customers']");
	public By presentationsview = By.xpath("//XCUIElementTypeStaticText[@name='Presentations']");
    public By sentimentNeutral1= By.xpath("//XCUIElementTypeApplication[@name=\"Omnipresence\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]");
	
    public By slideNumber(String slide) {
		return By.xpath("//XCUIElementTypeButton[@name='ThumbnailCarouselCellViewTitleLabel"+slide+"']");
	}
	public By slideNumber1(int slide) {
		return By.xpath("//XCUIElementTypeButton[@name='ThumbnailCarouselCellViewTitleLabel"+slide+"']");
	}
	
	
	public By slideNoInProfiletab(String slide) {
		return By.xpath("//XCUIElementTypeButton[@name='"+slide+".html']");
	}
	
	
	
	
	public By slidecontent(int slidenum)
	{
		return By.xpath("//div[@id='slideslideIface"+slidenum+"']");
	}
	
	
	public By presentationPlay = By.xpath("//XCUIElementTypeButton[@name='presenterViewToolbarPlayBarButtonItem']");
	public By presentationPause = By.xpath("//XCUIElementTypeButton[@name='presenterViewToolbarPauseBarButtonItem']");
	public By addedParticipant(String participant) {
		return By.xpath("(//XCUIElementTypeStaticText[@label='"+participant+"'])[1]");
	}//
	public By slidePresented(String slidename) {		
		return By.xpath("//XCUIElementTypeButton[@name='"+slidename+"']");
	}
	public By slidePresented1(String slidename, int templatesSizeInProfile) {		
	
		return By.xpath("//XCUIElementTypeButton[@name='"+slidename+"']["+templatesSizeInProfile+"]");
	
	}

	
	public By slidePresentedTimer(String slidename,int templatesSizeInProfile) {
		return By.xpath("//XCUIElementTypeButton[@name='"+slidename+"']["+templatesSizeInProfile+"]/following-sibling::XCUIElementTypeButton[1]");
	}
	public By slideCheckbuttonInProfile = By.xpath("(//XCUIElementTypeButton[@name='PageStackViewCheckMarkBbutton'])");
	
	public By slidePresentedCheckbox(String slidename) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+slidename+"']/following-sibling::XCUIElementTypeStaticText");
	}
	
	public By checkButtonSizeProfile(int checkbuttonsize) {
		return By.xpath("//XCUIElementTypeButton[@name='PageStackViewCheckMarkBbutton']["+checkbuttonsize+"]");
	}
	public By slideSentimentDropdown(String slidename) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+slidename+"']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeButton[@label='drop down']");
	}
	public By slideSentiment(String sliedname) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+sliedname+"']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeButton[@label='io triangle down outline']");
	}
	public By kyprolisCustomersatisfactionkeymessage = By.xpath("//XCUIElementTypeCell[@name='productCell_2_0']/XCUIElementTypeButton[5]");
	public By celebrexCustomersatisfactionkeymessage = By.xpath("//XCUIElementTypeStaticText[@name='Celebrex']/../XCUIElementTypeStaticText[@name='Customer Satisfaction']");
	public By conclucionKeymessage =By.xpath("//XCUIElementTypeStaticText[@name='Conclusion']") ;
	public By celebrexProduct = By.xpath("//XCUIElementTypeStaticText[@name='Celebrex']");	
	public By meetingid1 = By.xpath("(//XCUIElementTypeButton[@label='Clear']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther)[1]");
	public By meetingid2 = By.xpath("(//XCUIElementTypeButton[@label='Clear']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther)[2]");
	public By meetingid3 = By.xpath("(//XCUIElementTypeButton[@label='Clear']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther)[3]");
	public By meetingid4 = By.xpath("(//XCUIElementTypeButton[@label='Clear']/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeOther)[4]");
	
	public By clearButton = By.xpath("//XCUIElementTypeButton[@name='ic clear textview normal']");
	public By positiveSentimentInPresentation = By.xpath("//XCUIElementTypeImage[@name='positiveMoodCell']");
	public By neutralSentimentInPresentation = By.xpath("//XCUIElementTypeImage[@name='neutralMoodCell']");
	public By NegativeSentimentInPresentation = By.xpath("//XCUIElementTypeImage[@name='negativeMoodCell']");

	public By positiveSentimentInProfile = By.xpath("//XCUIElementTypeButton[@name='io triangle up outline']");
	
	public By positiveSentimentInProfile1(String PresentationSenti) {
	return By.xpath("//XCUIElementTypeButton[@name='"+PresentationSenti+"_0_0']");
	}
	
	public By positiveSentimentInProfile2(String PresentationSenti, int positivSentiSlidesInProfileNo) {
		return By.xpath("//XCUIElementTypeButton[@name='"+PresentationSenti+"_0_0']["+positivSentiSlidesInProfileNo+"]");		}
	
	
	public By negativeSentimentInProfile(String PresentationSenti, int negativeSentiSlidesInProfile) {
		return By.xpath("//XCUIElementTypeButton[@name='"+PresentationSenti+"_0_0']["+negativeSentiSlidesInProfile+"]");
		}
	
	public By neutralSentimentInProfile = By.xpath("//XCUIElementTypeButton[@name='io square outline']");
	public By neutralSentimentInProfile1(int neutralSentiSlidesSizeInProfile) {
	return By.xpath("//XCUIElementTypeButton[@name='NEUTRAL_0_0']["+neutralSentiSlidesSizeInProfile+"]");
	}
	public By NegativeSentimentInProfile = By.xpath("//XCUIElementTypeButton[@name='io triangle down outline']");
	
	public By PositiveSentimentInProfile1(String slidename) {
			return By.xpath("//XCUIElementTypeStaticText[@name='"+slidename+"']/preceding-sibling:://XCUIElementTypeButton[@name='io square outline']");
	}
	
	public By PositiveSentimentInProfile2(String slidename) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+slidename+"']/preceding-sibling:://XCUIElementTypeButton[@name='io square outline']");
}

	public By contactKeyMessageCustomerSatisfaction = By.xpath("//XCUIElementTypeStaticText[@name='Customer satisfaction']");
	public By contactProductKyprolis = By.xpath("//XCUIElementTypeStaticText[contains(@label,'Kyprolis')]");

	
	
}
