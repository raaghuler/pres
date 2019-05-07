package com.objectRepository;

import org.openqa.selenium.By;

public class Indegene_AccountsPageLocators {
	
	public By Hamburger=By.xpath("(//XCUIElementTypeButton)[1]");
	public By accountName(String accountname) {
		return By.xpath("//XCUIElementTypeText[@label='"+accountname+"']"); 
		}

}
