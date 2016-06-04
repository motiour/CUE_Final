package com.inmarkit.qa.framework.script;

import org.junit.Test;

import com.inmarkit.qa.framework.ScriptBase.ScriptBase;

public class ChSearchTest extends ScriptBase{
	
	@Test
	public void logInwithValidIDandPWTest(){
		loginPage().login("mrahman3555@yahoo.com", "123456");
		searchPage().searchItem("email");
	}
	

}
