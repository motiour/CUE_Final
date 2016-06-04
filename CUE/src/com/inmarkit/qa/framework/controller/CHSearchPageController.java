package com.inmarkit.qa.framework.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.ch.model.CHLoginPageModel;
import com.inmarkit.qa.framework.ch.model.CHSearchPageModel;

public class CHSearchPageController extends CHControllerBase{
	
	CHLoginPageModel chlogInPage = null;
	CHSearchPageModel chSearchPage = null;

	public CHSearchPageController(WebDriver driver) {
		super(driver);
		chlogInPage = new CHLoginPageModel(driver);
		chSearchPage =new CHSearchPageModel(driver);
		
	}

	
	public void login(String email, String password){
		chlogInPage.signInButton1().click();
		delayFor(3000);
		chlogInPage.emailBox().sendKeys(email);
		delayFor(1000);
		chlogInPage.passWordBox().sendKeys(password);
		delayFor(1000);
		chlogInPage.signInButton2().click();
		delayFor(20000);
	
		
		
	}
	
    public void searchItem(String searchWord){
        chSearchPage.searchButton().click();
        delayFor(2000);
        chSearchPage.searchButton1().sendKeys(searchWord);
        delayFor(2000);
        chSearchPage.searchButton1().sendKeys(Keys.RETURN);
         delayFor(5000);
}
	   
	
	
	
}
