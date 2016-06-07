package com.inmarkit.qa.framework.ch.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CHSharePageModel extends CHModelBase {

	
	CHSharePageModel chSharePage = null;
	public CHSharePageModel(WebDriver driver) {
		super(driver);
		
	}
	
	private WebElement item = null;
	private WebElement shareTab = null;
	private WebElement sharebutton = null;
	private WebElement commentBox = null;
	private WebElement submitButton = null;
	
	
	public WebElement item() {
		item = driver.findElement(By.xpath("//*[@id='item-121381']/div[2]/a"));
		return item;
	}
	
	public WebElement shareTab() {
		shareTab = driver.findElement(By.xpath("//*[@id='item-detail-navbar-collapse']/ul/li[2]/a"));
		return shareTab;
	}
	
	public WebElement sharebutton() {
		sharebutton = driver.findElement(By.xpath("//*[@id='post-twitter']"));
		return sharebutton;
	}
	
	public WebElement commentBox() {
		commentBox = driver.findElement(By.xpath("//*[@id='imi-after-post-network-select']/div[1]/textarea"));
		return commentBox;
	}
	
	public WebElement submitButton() {
		submitButton = driver.findElement(By.xpath("//*[@id='post-submit']"));
		return submitButton;
	}
	
	
	
	
	
	
	
	
	

}
