package com.example.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.qa.base.TestBase;
import com.example.qa.pages.Checkoutpage;
import com.example.qa.pages.HomePage1;

public class checkoutpagetest  extends TestBase {
	
	static	Checkoutpage check;
	static HomePage1 homepage;
  
	public checkoutpagetest() {
		super();
	}
	

	@BeforeMethod

	public void Setup() throws InterruptedException {
		initialization();
		check=new Checkoutpage();
		homepage.Homecategory();
//		homepage.Homecategory();
		//homepage.PLPDress();
		homepage.PDP();
	}
	
	
	/*public void tillpdp() throws InterruptedException {
		homepage.Homecategory();
//		homepage.Homecategory();
		homepage.PLPDress();
		homepage.PDP();
		check=new Checkoutpage();
	}*/
	@Test
	public void checkship() {
		check.shippaddr(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("phonenumber"), prop.getProperty("email"), prop.getProperty("streetaddress"), prop.getProperty("city"), prop.getProperty("postalcode"));
	}
	
}
	
