package com.example.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.qa.base.TestBase;

public class LoginPage extends TestBase{

	// PageFactory OR
	@FindBy(xpath="//img[@alt='Signin']")
	WebElement signin;
	
	@FindBy(id="login_username")
	static
	WebElement username;
	
	
	@FindBy(id= "login_password")
	static
	WebElement password;
	
	@FindBy(id= "loginButton")
	static
	WebElement loginbtn;
	
	// Initializing Page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPage() {
		
		return driver.getTitle();
		
	
	}
	
	public LoginPage clickLogin() {
	//	signin.click();
	
		driver.findElement(By.cssSelector("//span[contains(text(),'Sign In')]")).click();
		return new LoginPage();
		
	}


	
	public static  HomePage1 Login(String un, String pwd)  {
	//	signin.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		
		return new HomePage1();
	}


}