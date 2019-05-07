package com.objectRepository;

import org.openqa.selenium.By;

public class Indegene_PresentationsPageLocators {

	//Presentations panel locators
	public By selectPresent=By.xpath("//XCUIElementTypeButton[@label='Select']");
	public By titlePresent=By.xpath("//XCUIElementTypeButton[@label='Title']");
	public By dropDownPresentation=By.xpath("//XCUIElementTypeButton[@label='drop down']");
	public By sortByOption(String option) {
		return By.xpath("//XCUIElementTypeStaticText[@label='"+option+"']");
	}
	public By changeViewPresent=By.xpath("//XCUIElementTypeButton[@label='ic view list']");
	public By searchFld = By.xpath("//XCUIElementTypeSearchField");
	public By cancel = By.xpath("//XCUIElementTypeButton[@label='Cancel']");
	public By presentations = By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
	public By nameOfPresentation(int i) { return By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell["+i+"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]");
	}public By fvrtbtn = By.xpath("//XCUIElementTypeButton[@label='Favorite']");
	public By dwnldbtn = By.xpath("//XCUIElementTypeButton[@label='Download']");
	public By unFvrtbtn = By.xpath("//XCUIElementTypeButton[@label='Un-Favorite']");
	public By unDwnldbtn = By.xpath("//XCUIElementTypeButton[@label='Un-Download']");
	public By remove = By.xpath("//XCUIElementTypeButton[@name='Remove']");
	public By done = By.xpath("//XCUIElementTypeButton[@label='Done']");
	public By Presentation(int index) {
		return By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell["+index+"]");
	}
	public By Presentation1(String index) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+index+"']");
	}
	
	public By favIcn(int index) {
		return By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell["+index+"]");
	} 
	public By favIcn1=By.xpath("//XCUIElementTypeImage[@name='icon_favorite']");
	public By dwnldIcn(int index) {
		return By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell["+index+"]");
	}
	//Carousel locators
	//public By carouselHeader = By.xpath("//XCUIElementTypeWindow//XCUIElementTypeOther[3]/XCUIElementTypeNavigationBar/XCUIElementTypeOther");
	public By carouselHeader(int no) { 
	return By.xpath("//XCUIElementTypeOther[@name='Slide"+no+".html']");
	}

	
	public By carouselHeader1(int no) { 
		return By.xpath("//XCUIElementTypeOther[@name='Slide"+no+"']");
		}
	public By pageSelectDropDown = By.xpath("//XCUIElementTypeWindow//XCUIElementTypeOther[3]//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	public By pageOptions = By.xpath("");
	public By pageOptions(int option) {
		return By.xpath("");
	}
	//public By keywordSelectDropDown = By.xpath("//XCUIElementTypeWindow//XCUIElementTypeOther[3]//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]");
	public By keywordSelectDropDown = By.xpath("//XCUIElementTypeButton[@name='All Key Messages']");
	public By keywordOptions(String message) {
		return By.xpath("//XCUIElementTypeStaticText[@name='"+message+"']");
	}
	//public By slides = By.xpath("//XCUIElementTypeWindow//XCUIElementTypeOther[3]//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]//XCUIElementTypeCollectionView/XCUIElementTypeCell");
	//public By slides = By.xpath("//XCUIElementTypeOther/XCUIElementTypeImage");
	public By slides = By.xpath("//XCUIElementTypeCollectionView//XCUIElementTypeCell");
	public By slide(int number) {
		return By.xpath("//XCUIElementTypeWindow//XCUIElementTypeOther[3]//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]//XCUIElementTypeCollectionView/XCUIElementTypeCell["+number+"]");
		}
	/*public By nameOfSlide(int number) {
		return By.xpath("//XCUIElementTypeWindow//XCUIElementTypeOther[3]//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]//XCUIElementTypeCollectionView/XCUIElementTypeCell["+number+"]//XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]");
		}*/
	public By nameOfSlide(int number) {
	return By.xpath("//XCUIElementTypeButton[@name='ThumbnailCarouselCellViewTitleLabel"+number+"']");
	}
	public By nameOfSlide1(int number) {
		return By.xpath("(//XCUIElementTypeOther[@name='Slide"+number+".html'])");
	}
	public By nameOfSlideno(int number) {
		return By.xpath("(//XCUIElementTypeOther[@name='Slide"+number+"'])");
	}
	public By fullScreenButton = By.xpath("//XCUIElementTypeButton[@label='ic fullscreen']");
	public By carouselViewButton = By.xpath("//XCUIElementTypeButton[@label='ic view carousel']");
	public By fullScreenExitButton = By.xpath("//XCUIElementTypeButton[@label='ic fullscreen exit']");
}
