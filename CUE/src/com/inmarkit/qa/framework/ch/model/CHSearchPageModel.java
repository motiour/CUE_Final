package com.inmarkit.qa.framework.ch.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CHSearchPageModel extends CHModelBase {

	public CHSearchPageModel(WebDriver driver) {
		super(driver);
		
	}

	
	private WebElement searchButton = null;
	private WebElement searchButton1 = null;
	
	

	public WebElement searchButton() {
		searchButton = driver.findElement(By.xpath("//*[@class='search']"));
	   return searchButton;
	}

	public WebElement searchButton1() {
		searchButton1 = driver.findElement(By.xpath("//*[@id='imi-search-field-fixed']/form/input"));
		return searchButton1;
	}

	


}
