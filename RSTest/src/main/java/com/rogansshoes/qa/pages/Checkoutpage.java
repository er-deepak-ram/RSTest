package com.rogansshoes.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rogansshoes.qa.base.TestBase;

public class Checkoutpage extends TestBase {


	//OR for shipping address
	
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
	
	//shipping method
	
	@FindBy(id="FEDEX_2_DAY")
	WebElement fed;
	
	//payment method

	@FindBy(css="#COD1")
	WebElement cod;
	
	//additional info
	@FindBy(id="AdditionalInstruction")
	WebElement info;
	
	@FindBy(id="Agree")
	WebElement agree;
	
	@FindBy(id="btnCompleteCheckout")
	WebElement purchase;
	
	
	// Initializing Page objects
	public Checkoutpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	
	
	
	
	
	public void shippaddr(String fn,String ln, String no,String em,String st,String cty,String po) {
		
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		phnno.sendKeys(no);
		email.sendKeys(em);
		street1.sendKeys(st);
		city.sendKeys(cty);
		postal.sendKeys(po);
		
		WebElement Drpdwn = driver.findElement(By.id("SelectStateName"));
		  
		  Select sp=new Select(Drpdwn);
		  sp.selectByVisibleText("Wisconsin");
		save.click();
	}
	
}
