package com.qa.Tests;

import org.testng.annotations.Test;

import com.qa.Base.Baseclass;
import com.qa.Pages.Homepage;

public class Tc_Homepage_002 extends Baseclass{
   
	@Test(priority = 1)
	public void Test1() throws InterruptedException {
		Tc_LoginTest_001 tc=new Tc_LoginTest_001();
		tc.browseropen();
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void Test2() throws InterruptedException {
		Homepage hm= new Homepage(driver);
		hm.Adminbutton();
	}
	}
	
