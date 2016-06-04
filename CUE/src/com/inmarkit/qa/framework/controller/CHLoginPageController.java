package com.inmarkit.qa.framework.controller;





import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.ch.model.CHLoginPageModel;

public class CHLoginPageController extends CHControllerBase{

	CHLoginPageModel CHlogInPage = null;
	
	public CHLoginPageController(WebDriver driver) {
		super(driver);
		CHlogInPage = new CHLoginPageModel(driver);
	}

	public void login(String email, String password){
		CHlogInPage.signInButton1().click();
		delayFor(3000);
		CHlogInPage.emailBox().sendKeys(email);
		delayFor(1000);
		CHlogInPage.passWordBox().sendKeys(password);
		delayFor(1000);
		CHlogInPage.signInButton2().click();
		delayFor(30000);
		
		
	}
}
	