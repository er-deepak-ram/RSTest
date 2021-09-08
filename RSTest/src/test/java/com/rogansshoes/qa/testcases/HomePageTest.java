package com.rogansshoes.qa.testcases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rogansshoes.qa.base.TestBase;
import com.rogansshoes.qa.pages.Checkoutpage;
//import com.rogansshoes.qa.pages.HomePage;
import com.rogansshoes.qa.pages.HomePage1;
import com.rogansshoes.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	static	LoginPage loginpg;
	static HomePage1 homepage;
	static LoginPageTest lgntest;
	static	Checkoutpage check;
	
	@FindBy(id="login_username")
	static
	WebElement username;
	
	
	@FindBy(id= "login_password")
	static
	WebElement password;
	
	@FindBy(id= "loginButton")
	static
	WebElement loginbtn;
	
	
	// checkout page
	
	@FindBy(id="address_firstname")
	WebElement firstname;
	
	@FindBy(id="address_lastname")
	WebElement lastname;
	
	@FindBy(id="address_phoneno")
	WebElement phnno;
	
	@FindBy(id="address_emailaddress")
	WebElement email;
	
	@FindBy(id="address_street1")
	WebElement street1;
	
	@FindBy(id="address_city")
	WebElement city;
	
	@FindBy(id="address_postalcode")
	WebElement postal;
	
	@FindBy(id="SelectStateName")
	WebElement state;
	
	@FindBy(id="btnSaveAddress")
	WebElement save;
	
	
	
	
	
	
	
	
	
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod

	public void Setup() {
		initialization();
		homepage=new HomePage1();
	}
	/*
@Test (priority=1)
	public void shopbybrand() {
		String brandcheck=homepage.shopbybrand();
		Assert.assertEquals(brandcheck,"Shop By Brand | Rogan’s Shoes");	
	}

@Test (priority=2)
public void womensshoes() {
	String womencheck=homepage.womensshoes();
	Assert.assertEquals(womencheck, "Womens Shoes | Rogan's Shoes");	
}

@Test(priority=3)
public void mensshoes() {
	String mencheck= homepage.mensshoes();
	Assert.assertEquals(mencheck, "Men's Shoes | Rogan's Shoes");
}
@Test(priority=4)	
public void kidsshoes() {
	String kidcheck=homepage.kidsshoes();
	Assert.assertEquals(kidcheck,"Kids Shoes | Rogan's Shoes");
}
@Test(priority=5)	
public void clothandassc() {
	String clcheck=homepage.clothandassc();
	Assert.assertEquals(clcheck, "Clothing and Accessories | Rogan's Shoes");
}
@Test(priority=6)
public void clearence() {
	String clcheck=homepage.clearence();
	Assert.assertEquals(clcheck, "Clearance and Sale Shoes | Rogan's Shoes");
}
@Test(priority=7)
	public void contactus() {
	String check=homepage.contactus();
	Assert.assertEquals(check, "Contact Information | Rogan’s Shoes");
}
@Test(priority=8)
public void mobileworkshoe() {
	String check=homepage.mobileworkshoe();
	Assert.assertEquals(check, "Shoe Mobile - Mobile Work Shoe Service - Rogan's Shoes");
}

@Test(priority=9) 
public void atheletic() {
	homepage.atheletic();
}

/*
@Test 
public void instagram() {
	String check=homepage.instagram();
	Assert.assertEquals(check, "Shoes & Boots for Women, Men, Kids, Babies & Toddlers | Rogan's Shoes");
}

@Test 
public void twitter() {
	String check=homepage.twitter();
	Assert.assertEquals(check, "Shoes & Boots for Women, Men, Kids, Babies & Toddlers | Rogan's Shoes");
	
}

@Test
public void facebook() {
	String check=homepage.facebook();
	Assert.assertEquals(check, "Shoes & Boots for Women, Men, Kids, Babies & Toddlers | Rogan's Shoes");
}

@Test
public void pinterest() {
	String check= homepage.pinterest();
	Assert.assertEquals(check, "Shoes & Boots for Women, Men, Kids, Babies & Toddlers | Rogan's Shoes");
}

@Test(priority=9)
public void storesafety() {
	String check=homepage.storesafety();
	Assert.assertEquals(check, "Shoes & Boots for Women, Men, Kids, Babies & Toddlers | Rogan's Shoes");
}
/*

@Test(priority=9)
public void buyonline() {
	String check=homepage.buyonline();
	Assert.assertEquals(check, "Buy Online Pick-Up In-Store | Now Available | Rogan's Shoes");
}
*/
@ Test
public void homecat() throws InterruptedException  {
	homepage.Homecategory();
  // homepage.PLPDress();
  // homepage.PDP();
   homepage.shippaddr(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("phonenumber"), prop.getProperty("email"), prop.getProperty("streetaddress"), prop.getProperty("city"), prop.getProperty("postalcode"),prop.getProperty("info"));
   
}
/*
@ Test
public void checkship() {
	check.shippaddr(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("phonenumber"), prop.getProperty("email"), prop.getProperty("streetaddress"), prop.getProperty("city"), prop.getProperty("postalcode"));
}





/*
@Test
public void addtobag() {
	
	homepage.PLPDress();
	homepage.PDP();
}
/*
@Test 
public void menPLP() {
	homepage.PLPDress();
}

/*
@Test
public void Dresswomen() {
	//homecat();
	homepage.PLPDress();
}
*/
/*
@AfterMethod

public void teardown() {
	driver.quit();
}
*/
}

