package com.qa.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
 public static WebDriver driver;
 
 @BeforeClass
 public void setup() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 }
 @AfterClass
 public void teradown() throws InterruptedException {
	 Thread.sleep(5000);
	 driver.quit();
 }
}
