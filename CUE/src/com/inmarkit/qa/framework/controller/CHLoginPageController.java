package com.inmarkit.qa.framework.controller;





import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.ch.model.CHLoginPageModel;

public class CHLoginPageController extends CHControllerBase{

	CHLoginPageModel chlogInPage = null;
	
	public CHLoginPageController(WebDriver driver) {
		super(driver);
		chlogInPage = new CHLoginPageModel(driver);
	}

	public void login(String email, String password){
		chlogInPage.signInButton1().click();
		delayFor(3000);
		chlogInPage.emailBox().sendKeys(email);
		delayFor(1000);
		chlogInPage.passWordBox().sendKeys(password);
		delayFor(1000);
		chlogInPage.signInButton2().click();
		delayFor(30000);
		
		
	}
}
	