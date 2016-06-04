package com.inmarkit.qa.framework.ScriptBase;




import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.inmarkit.qa.framework.controller.CHLoginPageController;
import com.inmarkit.qa.framework.controller.CHSearchPageController;


public class ScriptBase {
	
	public WebDriver driver = null;

	@Before
	public void beforeTest() {
			 


     System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get("https://business.cueconnect.com/");
   
      
		
		
	}

		 
	public void delayFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void mouseClick(WebElement element) {
		String code = "var fireOnThis = arguments[0];"
				+ "var evObj = document.createEvent('MouseEvents');"
				+ "evObj.initEvent( 'click',true,false );"
				+ "fireOnThis.dispatchEvent(evObj);";
		((JavascriptExecutor) driver).executeScript(code, element);
	}

	
	
		
     public CHLoginPageController loginPage(){
		return new CHLoginPageController(driver);
	}
	
     
     public  CHSearchPageController searchPage(){
 		return new CHSearchPageController(driver);
 	}
    
	
	
	

	@After
	public void tearDown() {
		driver.quit();
	}
	
}

