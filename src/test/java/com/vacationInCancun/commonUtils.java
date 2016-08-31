package com.vacationInCancun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonUtils {

	
	public static  WebDriver chromeDriver(){
		String exePath = "C:\\Selenium\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath );
	    WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void searchButton (WebDriver driver){
		driver.findElement(By.id("search-button")).click();
	}
}
