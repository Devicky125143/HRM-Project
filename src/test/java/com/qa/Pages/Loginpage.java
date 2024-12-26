package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Baseclass;

public class Loginpage extends Baseclass {
    
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@name='username']")WebElement username;
	@FindBy(xpath = "//input[@name='password']")WebElement password;
	@FindBy(xpath = "//button[@type='submit']")WebElement Login;
	
	public void Login(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		Login.click();
		
	}
}
