package com.qa.Tests;

import org.testng.annotations.Test;

import com.qa.Base.Baseclass;
import com.qa.Pages.Loginpage;

public class Tc_LoginTest_001 extends Baseclass {
   
	@Test
	public void browseropen() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		Loginpage lp= new Loginpage(driver);
		lp.Login("Admin", "admin123");
		
		String act="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String exp=driver.getCurrentUrl();
		if(act.contains(exp)) {
			System.out.println("===LOGIN PAGE TEST PASSED===");
		}
		else {
			System.out.println("LOGIN PAGE TEST FAILED ");
		}
	}
}
