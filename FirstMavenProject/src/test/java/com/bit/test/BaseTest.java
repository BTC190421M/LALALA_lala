package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.utility.ReadPropFile;

public class BaseTest {
		WebDriver driver;
		Properties prop;
		
		@Before 
		public void openBrowser() throws IOException {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://www.jcpenney.com/");
		
			prop = ReadPropFile.readFile("/Users/taki/eclipse-workspace/FirstMavenProject/Maven.properties");
			String browser = prop.getProperty("browser");
			
			/*
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			
			}else if(browser.equals("FireFox")) {
				System.setProperty("webdriver.geko.driver", "");
				driver = new FirefoxDriver();
				
			}else if(browser.equals("IE")) {
				System.setProperty("webdriver.InternetExplorar.driver", "");
				driver = new InternetExplorerDriver();
				
			}else if(browser.equals("Edge")) {
				System.setProperty("webdriver.Edge.driver", "");
				driver = new EdgeDriver();
				
			}else if(browser.equals("Opera")) {
				System.setProperty("webdriver.Opera.driver", "");
				driver = new OperaDriver();
				
			}else if(browser.equals("Sa")) {
				System.setProperty("webdriver.Sa.driver", "");
			driver = new SafariDriver();
			}
			driver.get(prop.getProperty("url"));
		}
		*/
			
			
			
			if (driver.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			
			}else if(driver.equals("FireFox")) {
				System.setProperty("webdriver.geko.driver", "");
				driver = new FirefoxDriver();
				
			}else if(driver.equals("IE")) {
				System.setProperty("webdriver.InternetExplorar.driver", "");
				driver = new InternetExplorerDriver();
				
			}else if(driver.equals("Edge")) {
				System.setProperty("webdriver.Edge.driver", "");
				driver = new EdgeDriver();
				
			}else if(driver.equals("Opera")) {
				System.setProperty("webdriver.Opera.driver", "");
				driver = new OperaDriver();
				
			}else if(driver.equals("Sa")) {
				System.setProperty("webdriver.Sa.driver", "");
			driver = new SafariDriver();
			}
			driver.get(prop.getProperty("url"));
		}
			
			
			
			
			
			
		
		
		@After
		public void closeBrowser() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
		

	}


