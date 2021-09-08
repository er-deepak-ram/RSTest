package com.example.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.example.qa.util.TestUtil;
import com.example.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase()  {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\HP\\eclipse-workspace- new\\RSTest\\src\\main\\java\\com\\rogansshoes\\qa\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void initialization() {
		
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\chromedriver.exe");
			 driver= new ChromeDriver();
			 
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		driver.get(prop.getProperty("url"));
		//driver.manage().timeouts();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICITE_Wait,TimeUnit.SECONDS);
		
		System.out.println(prop.getProperty("url"));
		
		
	}
	
	
	
}
