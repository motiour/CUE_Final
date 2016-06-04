package com.inmarkit.qa.framework.controller;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CHControllerBase {

	protected WebDriver driver = null;

	public CHControllerBase(WebDriver driver) {
		this.driver = driver;

	}

	public void hoverItem(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}

	public void hoverItem(By by) {
		WebElement element = driver.findElement(by);
		hoverItem(element);
	}

	public void hoverItemEx(WebElement element) {
		Locatable hoverItem = (Locatable) element;
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());
	}

	public void hoverItemEx(By by) {
		WebElement element = driver.findElement(by);
		hoverItemEx(element);
	}

	public WebElement findElementWait(By by) {
		Wait<WebDriver> wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(visibilityOfElement(by));
		return element;
	}

	public String switchWindowByTitle(String titleToMatch) {
		String currentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String item : windows) {
			System.out.println(item);
			if (item.contentEquals(item)) {
				driver.switchTo().window(item);
				String title = driver.getTitle();
				if (title.contains(titleToMatch)) {
					break;
				}
			}
		}

		return currentWindow;
	}

	private ExpectedCondition<WebElement> visibilityOfElement(final By by) {

		return new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver d) {
				WebElement element = d.findElement(by);
				if (element.isDisplayed()) {
					return element;
				}
				return null;
			}
		};
	}

	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

