package com.rogansshoes.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rogansshoes.qa.base.TestBase;
//import com.rogansshoes.qa.pages.HomePage;
import com.rogansshoes.qa.pages.HomePage1;
import com.rogansshoes.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	
	static LoginPage loginpg;
	static HomePage1 homepage;
	
	public LoginPageTest() {
		super();
	}

@BeforeMethod

public void Setup() {
	initialization();
	
	 loginpg=new LoginPage();
}

/*
@Test(priority=1)
public void LoginPageTestTitle() {
	
	String title= loginpg.validateLoginPage();
	Assert.assertEquals(title, "Shoes & Boots for Women, Men, Kids, Babies & Toddlers | Rogan's Shoes");
	
}

@Test(priority=2)
public void clickLogin() {
	loginpg.clickLogin();
}
*/
@Test(priority=3)
public static String Login()  {
	//loginpg.clickLogin();
	homepage= loginpg.Login(prop.getProperty("username"), prop.getProperty("password"));
	homepage= loginpg.Login(prop.getProperty("username"), prop.getProperty("password"));
	
	return driver.getTitle();
}


/*
@AfterMethod

public void teardown() {
	driver.quit();
}

*/
	

}
