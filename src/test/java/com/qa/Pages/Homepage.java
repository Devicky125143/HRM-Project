package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.Base.Baseclass;

public class Homepage  extends Baseclass{
    
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")WebElement adminbtn;
	
	@FindBy(xpath = "(//button[@type='button'])[6]")WebElement addbtn;
	
	//@FindBy (xpath = "(//div[@class='oxd-select-text-input'])[1]")WebElement Userrole;
	
	
	public void Adminbutton() throws InterruptedException {
    adminbtn.click();
    Thread.sleep(4000);
    addbtn.click();
    System.out.println("add the files");
	/*
	 * Thread.sleep(3000); Userrole.click();
	 */
    
	}
}
