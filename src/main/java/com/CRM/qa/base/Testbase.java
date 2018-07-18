package com.CRM.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	static WebDriver driver;
	static Properties prop;
	
	
	Testbase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\shisher\\workspace\\com.mymavenprojectCRM.test"
					+ "\\src\\main\\java\\com\\CRM\\qa\\congif\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		public static void initilization()
		{
			String BrowserName = prop.getProperty("Browser");
			
			if (BrowserName.equalsIgnoreCase("chrome")){
				//System.setProperty("webdriver.chrome.driver", arg1)
				//WebDriver driver = new ChromeDriver();
			}
			else if (BrowserName.equalsIgnoreCase("FF")){
				System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\chrome driver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			}
			
			
			
			
			
		}

	}
	

}
