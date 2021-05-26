package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
		 prop= new Properties();
	
			FileInputStream ip= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\DEMOPROJECTPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
		
			prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void initialization() {
		
		String browsername= prop.getProperty("browser");
		
		if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();	
		}else if (browsername.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\OneDrive\\Documents\\Drivers\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

