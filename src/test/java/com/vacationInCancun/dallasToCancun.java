package com.vacationInCancun;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dallasToCancun {
WebDriver driver = commonUtils.chromeDriver(); ;

@BeforeClass
public void setupBrowser(){
	
    driver.manage().window().maximize();
    driver.get("http://www.expedia.com");	
}

@Test

public void dallasCancun() throws InterruptedException, IOException{
	
	Thread.sleep(2000);
    driver.findElement(By.id("package-origin")).sendKeys("Dallas, TX, United States (DFW-All Airports)");
    driver.findElement(By.id("package-destination")).sendKeys("Cancun (and vicinity), Quintana Roo, Mexico");
    driver.findElement(By.id("package-departing")).sendKeys("09/16/2016");
    driver.findElement(By.id("package-returning")).sendKeys("09/19/2016");
    commonUtils.searchButton(driver);
    Thread.sleep(5000);
    driver.findElement(By.id("sbarprice")).click();
    Thread.sleep(5000);
    scroll.scrolling300(driver);
    
    screenshots.takeScreenShotdtcd1pg1();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd1pg2();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd1pg3();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd1pg4();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd1pg5();
    scroll.scrollingback(driver);
    
    dates.date1(driver);
    driver.findElement(By.id("sbarprice")).click();
    Thread.sleep(5000);
    scroll.scrolling300(driver);
    screenshots.takeScreenShotdtcd2pg1();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd2pg2();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd2pg3();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd2pg4();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd2pg5();
    scroll.scrollingback(driver);
    
    dates.date2(driver);
    driver.findElement(By.id("sbarprice")).click();
    Thread.sleep(5000);
    scroll.scrolling300(driver);
    screenshots.takeScreenShotdtcd3pg1();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd3pg2();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd3pg3();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd3pg4();
    scroll.scrolling450(driver);
    screenshots.takeScreenShotdtcd3pg5();
    scroll.scrollingback(driver);

}



@AfterClass
public void closeBrowser(){
	driver.quit();
}


}

