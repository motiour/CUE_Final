package com.inmarkit.qa.framework.script;



import org.junit.Test;

import com.inmarkit.qa.framework.ScriptBase.ScriptBase;


public class ChLoginTest extends ScriptBase{
	@Test
	public void logInwithValidIDandPWTest(){
		loginPage().login("mrahman3555@yahoo.com", "123456");
	}
	
	


}

