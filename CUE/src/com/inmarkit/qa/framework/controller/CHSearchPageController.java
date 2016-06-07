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

	
	
	
    public void searchItem(String searchWord){
        chSearchPage.searchButton().click();
        delayFor(2000);
        chSearchPage.searchButton1().sendKeys(searchWord);
        delayFor(2000);
        chSearchPage.searchButton1().sendKeys(Keys.RETURN);
        delayFor(5000);
        
}
	   
	
	
	
}
