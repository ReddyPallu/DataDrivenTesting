package com.learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicBrowser {

	public static void main(String[] args) {
				//WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Libs\\chromedriver_win32\\chromedriver.exe");
				String url = "http://www.qatechhub.com";
				WebDriver driver = new ChromeDriver();
				//driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(url);
				String PageTitle = driver.getTitle();
				System.out.println("Title of page :"+PageTitle);
	
				//System.out.println("Page source is ::"+driver.getPageSource());
				System.out.println("Current URL ::"+driver.getCurrentUrl());
				
				driver.close();
	
	
	
	
	}
	
	
	
	
	
}
