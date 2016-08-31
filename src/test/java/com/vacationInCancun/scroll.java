package com.vacationInCancun;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class scroll {
	public static void scrolling300(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,325)", "");
	
 }
	public static void scrolling450(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
	
 }
	public static void scrollingback(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(1000,0)", "");
	
 }

}
