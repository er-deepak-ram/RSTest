package com.example.qa.pages;

import java.awt.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.example.qa.base.TestBase;

public class HomePage1  extends TestBase {

	// footer link CUSTOMER SERVICE

	@FindBy(linkText="Contact Us")
	WebElement Contact;
	
	@FindBy(linkText="FAQs")
	WebElement faq;
	
	@FindBy(linkText="Mobile Work Shoe Service")
	WebElement mobile;
	
	@FindBy(linkText="Employment")
	WebElement emp;
	
	@FindBy(linkText="Store Information")
	WebElement storeinfo;
	
	@FindBy(xpath="//header/z-widget[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/b[1]/a[1]")
	WebElement store;
	
	@FindBy(xpath="//body[1]/div[1]/header[1]/z-widg")
	WebElement buy;
	
	// footer links shop now
	@FindBy(linkText="Shop By Brands")
	WebElement Brand;

	@FindBy(linkText="Womens Shoes")
	WebElement wms;
	
	@FindBy(linkText="Mens Shoes")
	WebElement mns;
	
	@FindBy(linkText="Kids Shoes")
	WebElement kids;
	
	@FindBy(linkText="Clothing & Accessories")
	WebElement cloth;
	
	@FindBy(linkText="Clearances")
	WebElement clear;
	
	// Social Media 
	
	@FindBy(xpath="//header/z-widget[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]/img[1]")
	WebElement insta;
	
	@FindBy(xpath="//header/z-widget[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]/img[1]")
	WebElement twitt;
	
	@FindBy(xpath="//header/z-widget[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]/img[1]")
	WebElement facebook;
	
	@FindBy(xpath="//header/z-widget[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[5]/a[1]/img[1]")
	WebElement pin;
	
	
	
	//Category
	@FindBy(xpath="//a[@class='Btn-link']")
	WebElement cat;
	
	// PLP
	
	@FindBy(xpath="//a[@data-test-selector='linkProductTitle']")
	WebElement singleprd;
	
	
	// Login
	@FindBy(id="login_username")
	static
	WebElement username;
	
	
	@FindBy(id= "login_password")
	static
	WebElement password;
	
	@FindBy(id= "loginButton")
	static
	WebElement loginbtn;
	
	//PLP
	@FindBy(xpath="//a[@data-test-selector='linkProductTitle']")
	WebElement PLPProduct;
	
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
	
	//shipping
	
	@FindBy(xpath="//input[@id='FEDEX_2_DAY']")
	WebElement fed;
	

	@FindBy(xpath="//input[@id='COD1']")
	WebElement cod;
	
	@FindBy(xpath="//textarea[@id='AdditionalInstruction']")
	WebElement adinfo;
	
	
	@FindBy(xpath="//input[@id='Agree']")
	WebElement agree;
	
	@FindBy(xpath="	//button[@id='btnCompleteCheckout']")
	WebElement purchase;
	
	//button[@id='btnCompleteCheckout']
	
	// Action
	
	
	
	public HomePage1() {
		PageFactory.initElements(driver, this);
	}

	public String validatecontactus()
	{
	Contact.click();
	return driver.getTitle();
	}
	
	
	public String validatefaq()
	{
	faq.click();
	return driver.getTitle();
	}

	public String validateshopbybrand()
	{
	Brand.click();
	return driver.getTitle();
	}

	public String validatewomens()
	{
		wms.click();
	return driver.getTitle();
	}

	
	public String validatemens()
	{
		mns.click();
	return driver.getTitle();
	}

	public String validatekids()
	{
		kids.click();
	return driver.getTitle();
	}
	
	public String validateclothandassc()
	{
		cloth.click();
	return driver.getTitle();
	}
	
	public String validateclearence()
	{
		clear.click();
	return driver.getTitle();
	}
	
	public String mobileworkshoe ()
	{
		mobile.click();
	return driver.getTitle();
	}
	
	public String instagram ()
	{
		insta.click();
	return driver.getTitle();
	}
	
	public String twitter ()
	{
		twitt.click();
	return driver.getTitle();
	}
	
	public String facebook ()
	{
		facebook.click();
	return driver.getTitle();
	}
	
	public String pinterest ()
	{
		pin.click();
	return driver.getTitle();
	}
	
	public String storesafety ()
	{
		store.click();
	return driver.getTitle();
	}
	
	
	public String buyonline ()
	{
		store.click();
	return driver.getTitle();
	}
	
	public String storeinformation ()
	{
		storeinfo.click();
	return driver.getTitle();
	}
	
	
	public String employment ()
	{
		emp.click();
	return driver.getTitle();
	}
	
	
	public void Homecategory() throws InterruptedException {
		// selecting category
		mns.click();
		//selecting casual shoes
		
		driver.findElement(By.xpath("//a[contains(text(),'Mens Casual Shoes')]")).click();
		
		java.util.List<WebElement> prd=driver.findElements(By.xpath("//a[@data-test-selector='linkProductTitle']"));
		for(int i=0;i<prd.size();i++) {
			String name=prd.get(i).getText();
			System.out.println(prd.get(i).getText());

			if(name.contains("Florsheim Lakeside Slip Boat Shoes - Mens"));{
				singleprd.click();
				break;
				}	
		}
		
		
		//driver.findElements(By.className(""))
		
		driver.findElement(By.xpath("//label[contains(text(),'8')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='layout']/div[@id='layout-content']/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/ol[1]/li[1]/label[1]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Add To Bag')]")).click();
		
		driver.findElement(By.id("checkOut-link")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkout as a guest')]")).click();
		
	}
		/*
		//selecting single product from PLP
		int attempts = 0;
	    while(attempts < 2) {
	    	try {
	    		java.util.List<WebElement> prd=driver.findElements(By.xpath("//a[@data-test-selector='linkProductTitle']"));
	    		prd.stream().filter(e -> e.getText().contains("Florsheim Lakeside Slip Boat Shoes - Mens")).forEach(e -> e.click());
	    		 break;
	    		 
	    	}catch(StaleElementReferenceException e) {
	    		
	    	} attempts++;
	    }
	*/
	  
	    
		 
		//selecting size and width
	    
	    
		



		/*
		
		java.util.List<WebElement> prd=driver.findElements(By.xpath("//a[@class='Btn-link']"));
		prd.stream().filter(e -> e.getText().contains("Mens Casual Shoes")).forEach(e -> e.click());*/
		
	/*
		for(int i=0;i<prd.size();i++) {
			String name=prd.get(i).getText();
			System.out.println(prd.get(i).getText());

			if(name.contains("Mens Athletic Shoes"));{
                cat.click();
			break;}

			
			// System.out.println("driver.getTitle()");
		//	 return driver.getTitle();
			}
		driver.findElement(By.linkText("Mens Athletic Shoes")).click();
		
}
		
	

	public void PLPDress() throws InterruptedException {
		
		Homecategory();
		
		java.util.List<WebElement> PLPIM=driver.findElements(By.xpath("//a[@data-test-selector='linkProductTitle']"));
    	
		
		for(int i=0;i<PLPIM.size();i++) {
			String name=PLPIM.get(i).getText();
			System.out.println(PLPIM.get(i).getText());

			if(name.contains("Adidas Nemeziz Messi 19.3 Fxg Outdoor Soccer Cleats - Menss"));{
				singleprd.click();
			break;}

			// System.out.println("driver.getTitle()");
		//	 return driver.getTitle();
			}
		driver.findElement(By.linkText("Adidas Nemeziz Messi 19.3 Fxg Outdoor Soccer Cleats - Mens")).click();
		
       }
		/*
		int attempts = 0;
	    while(attempts < 10) {
	        try {
	        	java.util.List<WebElement> PLPIM=driver.findElements(By.xpath("//a[@data-test-selector='linkProductTitle']"));
	        	
	        	
	        	
	    	//	PLPIM.stream().filter(e -> e.getText().contains("Adidas Nemeziz Messi 19.3 Fxg Outdoor Soccer Cleats - Mens")).forEach(e -> e.click());
	           // break;
	        } catch(NoSuchElementException e) {
	        }
	        attempts++;
	    }
		// TODO Auto-generated method stub/
	   /* 
		java.util.List<WebElement> PLPIM=driver.findElements(By.xpath("//a[@data-test-selector='linkProductTitle']"));
		PLPIM.stream().filter(e -> e.getText().contains("Florsheim Lakeside Slip Boat Shoes - Mens")).forEach(e -> e.click());*/
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//label[@for='Size-8']")).click();
		
	//driver.findElement(By.xpath("//label[@for='ShoeWidth-M']")).click();
		
	//	driver.findElement(By.xpath("//button[contains (text(),'Add To Bag')]")).click();
		
	

	public void searchproduct() {
		
	}


	public void PDP() {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@id='Size-8']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'8')]")).click();
		
		driver.findElement(By.xpath("//button[contains (text(),'Add To Bag')]")).click();
	}


public void shippaddr(String fn,String ln, String no,String em,String st,String cty,String po, String string) throws InterruptedException {
		
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
		
		Thread.sleep(5000);
		
		fed.click();
		
		Thread.sleep(6000);
		
		cod.click();
		Thread.sleep(6000);
		
		adinfo.sendKeys("This test order is Automated");
		
		agree.click();
		
		//purchase.click();
		
	}
		
	
}	

