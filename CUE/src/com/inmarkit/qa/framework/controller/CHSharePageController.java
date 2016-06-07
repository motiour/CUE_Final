package com.inmarkit.qa.framework.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.ch.model.CHLoginPageModel;
import com.inmarkit.qa.framework.ch.model.CHSharePageModel;

public class CHSharePageController extends CHControllerBase {

	
	CHLoginPageModel chlogInPage = null;
	CHSharePageModel chSharePage = null;
	
	CHSharePageController chSearchPage = null;
	
	public CHSharePageController(WebDriver driver) {
		super(driver);
		
		chlogInPage = new CHLoginPageModel(driver);
		chSharePage = new CHSharePageModel (driver);
		
	}
	
	
	public void shareItem(){
		 chSharePage.item().click();
		 delayFor(5000);
		 chSharePage.shareTab().click();
		 delayFor(5000);
		 chSharePage.sharebutton().click();
		 delayFor(5000);
		 chSharePage.commentBox().sendKeys("This is great");
		 delayFor(5000);
		 chSharePage.submitButton().click();
		 delayFor(5000);
		 
		 
	}
	
	

}
