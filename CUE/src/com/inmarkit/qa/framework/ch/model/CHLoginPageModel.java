package com.inmarkit.qa.framework.ch.model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CHLoginPageModel extends CHModelBase {

	public CHLoginPageModel(WebDriver driver) {
		super(driver);
	}

	private WebElement signInButton1 = null;
	private WebElement emailBox = null;
	private WebElement passWordBox = null;
	private WebElement signInButton2 = null;



	
	public WebElement signInButton1() {
		signInButton1 = driver.findElement(By.id("imi-opensignin"));
	   return signInButton1;
	}

	public WebElement emailBox() {
		emailBox = driver.findElement(By.xpath("//*[@id='signin-email']"));
		return emailBox;
	}

	public WebElement passWordBox() {
		passWordBox = driver.findElement(By.xpath("//*[@id='signin-password']"));
		return passWordBox;
	}

	public WebElement signInButton2() {
		signInButton2 = driver.findElement(By.xpath("//*[@id='signin-submit']"));
		return signInButton2;
	}
	

}

