package com.objectRepository;

import org.openqa.selenium.By;

public class Indegene_ActivitiesPageLocators {
	
	
	//left pane
	//public By addMeeting=By.xpath("(//XCUIElementTypeButton)[2]");
	public By addMeeting(String addmeetingmonth) {
		return By.xpath("//XCUIElementTypeNavigationBar[@name='"+addmeetingmonth+"']/XCUIElementTypeButton[2]");
	}
	
	public By addMeeting1=By.xpath("(//XCUIElementTypeButton)[2]");
	public By selectMeeting = By.xpath("(//XCUIElementTypeStaticText[@name='newActivityTitleLabel'])[1]");
	public By agenda=By.xpath("//XCUIElementTypeStaticText[@label='Agenda']");
	public By day=By.xpath("//XCUIElementTypeSaticText[@label='Day']");
	public By day3=By.xpath("//XCUIElementTypeSaticText[@label='3 Day']");
	public By schedular=By.xpath("//XCUIElementTypeSaticText[@label='Scheduler']");
	public By meeting(String meetingName) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+meetingName+"']");		
	}
	public By meetingdropdown=By.xpath("//XCUIElementTypeButton[@name='ic chevron down']");
	public By meetingdropdown1(String meetingName) {
			return By.xpath("//XCUIElementTypeStaticText[@name="+meetingName+"']/XCUIElementTypeButton[@value='1']");
}
	public By meetingchevronDropDown(String meetingName, int size) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+meetingName+"']/XCUIElementTypeButton[@name='ic chevron down']["+size+"]");		
	}
	public By meetingchevronDropDown1(int size) {
		return By.xpath("((//XCUIElementTypeButton[@name='ic chevron down'])["+size+"])");		
	}
	
	public By meetingScheduleFollowup(String meetingName) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+meetingName+"']/../XCUIElementTypeCell/XCUIElementTypeButton[@name='Schedule follow-up']");		
	}
	public By meetingScheduleFollowup1=By.xpath("(//XCUIElementTypeButton[contains(text(),'ScheduleFollowUp')])");
	public By meetingScheduleFollowup2=By.xpath("(//XCUIElementTypeButton[@name='ActivityMasterTableViewCellScrap_0_0_1'])[2]");
	public By meetingFollowUpEmail(String meetingName) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+meetingName+"']/../XCUIElementTypeCell/XCUIElementTypeButton[@name='Follow up email']");		
	}
	public By meetingScrap(String meetingName) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+meetingName+"']/../XCUIElementTypeCell/XCUIElementTypeButton[@name='Scrap']");		
	}
	public By meetingScrap1=By.xpath("(//XCUIElementTypeButton[contains(text(),'Scrap')])");
	public By meetingScrap2=By.xpath("(//XCUIElementTypeButton[@name='ActivityMasterTableViewCellScrap_0_0_1'])[2]");
	//public By chevronDownArrow = By.xpath("//XCUIElementTypeButton[@name='ic chevron down'][1]");
	public By meetingSubOnActivity(String meetingName) {
		return By.xpath("XCUIElementTypeCell/XCUIElementTypeStaticText[@label='"+meetingName+"']");		
	}
	//Right pane
	//public By confirm=By.xpath("//XCUIElementTypeButton[@name='Confirm']");
	public By confirm=By.xpath("//XCUIElementTypeButton[@name='MeetingDetailTableHeaderFooterViewTitleLabelFirstBButton']");
	public By cancel=By.xpath("//XCUIElementTypeSaticText[@name='cancel']");
	public By cancel1=By.xpath("//XCUIElementTypeButton[@name='Cancel']");
	
	public By activityType(String activityType) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+activityType+"']");
	}
	
	public By StartTime = By.xpath("//XCUIElementTypeStaticText[@name='Start Time']");
	public By EndTime = By.xpath("//XCUIElementTypeStaticText[@name='End Time']");
	
	
	public By WheelPicker = By.className("XCUIElementTypePickerWheel");
	public By date = By.xpath("(//XCUIElementTypePickerWheel)[1]");
	public By hour = By.xpath("(//XCUIElementTypePickerWheel)[2]");
	public By minutes = By.xpath("(//XCUIElementTypePickerWheel)[3]");
	public By meredian = By.xpath("(//XCUIElementTypePickerWheel)[4]");
	public By meetingDetail(String Detail) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+Detail+"']");} 
	public By Status = By.xpath("//XCUIElementTypeStaticText[@name='activityDetailStatusLabel']");
	public By Subject = By.xpath("(//XCUIElementTypeStaticText[@name='activityDetailSubjectLabel'])[1]");
	//public By addSubjectbtn = By.xpath("//XCUIElementTypeButton[@name='New Meeting']");
	public By addSubjectbtn = By.xpath("//XCUIElementTypeCell[@name='meetingInfoSubjectCell']");
	public By subjectText = By.xpath("//XCUIElementTypeButton[@name='activityDetailSubjectButton']");
	public By timeButton = By.xpath("//XCUIElementTypeButton[@name='activityDetailSubjectButton']");
	public By location = By.xpath("//XCUIElementTypeButton[@name='activityDetailLocationButton']");
	public By account= By.xpath("//XCUIElementTypeStaticText[@name='activityDetailAccountValueLabel']");
	public By customer = By.xpath("//XCUIElementTypeStaticText[@name='activityDetailParticipantValueLabel']");
	public By subjectDropdownArw = By.xpath("//XCUIElementTypeButton[@name='New Meeting']/../XCUIElementTypeButton");
	public By subjecttextfield = By.xpath("//XCUIElementTypeNavigationBar[@name='Subject']/../XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView");
	public By icClearTextButton	= By.xpath("//XCUIElementTypeButton[@name='ic clear textview normal']");
	public By Time = By.xpath("//XCUIElementTypeStaticText[@name='activityDetailTimeLabel']");
	public By timeDropdownArw = By.xpath("//XCUIElementTypeStaticText[@name='Time']/../XCUIElementTypeButton");
	public By Location = By.xpath("(//XCUIElementTypeStaticText[@name='activityDetailLocationLabel'])[1]");
	public By addLocationbtn = By.xpath("//XCUIElementTypeButton[@name='No location']");
	public By locationButton = By.xpath("//XCUIElementTypeButton[@name='activityDetailLocationButton']");
	public By verifyLocation(String Locationname) {
		return By.xpath("//XCUIElementTypeButton[@name='"+Locationname+"']");
	}
	public By verifyPresentation = By.xpath("//XCUIElementTypeTable/XCUIElementTypeOthere/XCUIElementTypeStaticText");
	public By locationMoreinfo = By.xpath("//XCUIElementTypeButton[@name='No location']/../XCUIElementTypeButton");
	public By contentCopyIcon = By.xpath("//XCUIElementTypeButton[@name='activityDetailMeetingUrlCopyButton']");
	public By remoteMeetingUrl = By.xpath("//XCUIElementTypeStaticText[@name='activityDetailMeetingUrlLabel']");
	public By mailIcon = By.xpath("//XCUIElementTypeButton[@name='activityDetailMeetingUrlMailButton']");  
	public By UrlMoreinfo = By.xpath("//XCUIElementTypeButton[@name='ic wechat']/../XCUIElementTypeButton[2]");
	public By Accounts = By.xpath("//XCUIElementTypeStaticText[@name='activityDetailAccountLabel']");
	public By selectAccountbtn = By.xpath("//XCUIElementTypeStaticText[@name='Select Accounts']");
	public By accountsMoreinfo = By.xpath("//XCUIElementTypeStaticText[@name='Select Accounts']/../XCUIElementTypeButton");
	public By Participants = By.xpath("//XCUIElementTypeStaticText[@name='activityDetailParticipantLabel']");
	public By selectParticipantsbtn = By.xpath("//XCUIElementTypeStaticText[@name='activityDetailParticipantValueLabel']");
	public By participantsMoreinfo = By.xpath("//XCUIElementTypeStaticText[@name='Select Participants']/../XCUIElementTypeButton");
	
	public By presentations = By.xpath("(//XCUIElementTypeStaticText[@name='MeetingDetailTableHeaderFooterViewTitleLabels'])[2]");
	public By addPresentations = By.xpath("(//XCUIElementTypeButton[@name='MeetingDetailTableHeaderFooterViewTitleLabelFirstBButton'])[2]");
	public By presentationsView = By.xpath("(//XCUIElementTypeCollectionView");
	public By presentation(String presentationName) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+presentationName+"']/following-sibling::XCUIElementTypeButton");
		//return By.xpath("(//XCUIElementTypeButton[@name='ic add'])["+index+"]");
	}
	public By ProductKeyMessages = By.xpath("(//XCUIElementTypeStaticText[@name='MeetingDetailTableHeaderFooterViewTitleLabels'])[3]");
	public By keymessage = By.xpath("//XCUIElementTypeStaticText[@name='PRODUCTS/KEY MESSAGES']");
	public By radionbutton(String productname) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+productname+"']/../XCUIElementTypeButton");
		
	}
	public By notes = By.xpath("//XCUIElementTypeCell[@name='notesCell']");
	public By addParticipant(String participant) {
		
	//	return By.xpath("//XCUIElementTypeStaticText[@name='"+ParticipantName+"']/../XCUIElementTypeButton");
		return By.xpath("(//XCUIElementTypeStaticText[@label='"+participant+"']/following-sibling::XCUIElementTypeButton)");
		//return By.xpath("(//XCUIElementTypeButton[@name='ic add'])["+index+"]");
	}
	
	public By done=By.xpath("//XCUIElementTypeButton[@name='Done']");	
	public By cameraIcn = By.xpath("//XCUIElementTypeToolbar//XCUIElementTypeButton[@name='ic photo camera']");
	public By clearIcn = By.xpath("//XCUIElementTypeToolbar//XCUIElementTypeButton[@name='ic clear']");
	public By alldoneIcn = By.xpath("//XCUIElementTypeToolbar//XCUIElementTypeButton[@name='ic done all']");
	public By peopleIcn = By.xpath("//XCUIElementTypeToolbar//XCUIElementTypeButton[@name='ic people']");
	public By collectionsIcn = By.xpath("//XCUIElementTypeToolbar//XCUIElementTypeButton[@name='ic collections']");
	public By resizeIcn = By.xpath("//XCUIElementTypeToolbar//XCUIElementTypeButton[@name='ic swap horiz']");
	
	public By changeLocation = By.xpath("//XCUIElementTypeNavigationBar[@name='Change Location']");
	public By enterLocationField = By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[3]//XCUIElementTypeTextField");
	public By locationSuggestion = By.xpath("//XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther[]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText");
	public By locationIcon = By.xpath("//XCUIElementTypeButton[@name='ic location on 18pt']");
	public By searchLocation = By.xpath("//XCUIElementTypeButton[@name='Search']");
	public By searchField = By.xpath("((//XCUIElementTypeSearchField[@name='Search'])[1])");
//	public By suggestedList=By.xpath("(//XCUIElementTypeStaticText[@name='Dallas Parkway'])[5]");
	public By suggestedList=By.xpath("//XCUIElementTypeStaticText[@name='California Street, Aguanga, California, United States of America, 92536']");
	public By updatedTime=By.xpath("//XCUIElementTypeButton[@name='activityDetailTimeButton']");
	//"(//XCUIElementTypeButton[contains(text(),'ScheduleFollowUp')])"
	//public By selectLocation = By.xpath("//XCUIElementTypeStaticText[@name='Select this location'] google map");
	public By selectLocation = By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage");
	//contact Email
	
	public By templateDropdown = By.xpath("//XCUIElementTypeButton[@name='drop down']");
	public By toAddress1 = By.xpath("//XCUIElementTypeButton[@name='Brijesh Bodla']");
	public By emailSendButton  = By.xpath("//XCUIElementTypeButton[@name='Send']");
	public By contactsAddButtonInEmail =By.xpath("//XCUIElementTypeButton[@name='ic add']");
	public By addContactTextField = By.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeTextField");
	public By todropdown = By.xpath("//XCUIElementTypeStaticText[@name='Brijesh Bodla']");
	public By toPopuptext(String todetails){
	return		By.xpath("//XCUIElementTypeStaticText[@name='"+todetails+"']");
	}
	public By connectionInfoTemplate = By.xpath("//XCUIElementTypeStaticText[@name='Connection Info Template']");
	public By amgenDemoTemplate = By.xpath("//XCUIElementTypeStaticText[@name='Amgen Demo Template']");
	public By qatestemailTemplate = By.xpath("//XCUIElementTypeStaticText[@name='Qatestemail template001']");
	}
	

