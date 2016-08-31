package com.vacationInCancun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dates {
	public static void date1(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("acol-flight-check-in")).clear();
        driver.findElement(By.id("acol-flight-check-in")).sendKeys("09/20/2016");
        driver.findElement(By.id("acol-flight-check-out")).clear();
	    driver.findElement(By.id("acol-flight-check-out")).sendKeys("09/23/2016");
	  Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='acol-flight-check-out-date-picker']/div/div/div[1]/button")).click();
	Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='acolPackageWizardFrm']/fieldset/fieldset/button")).click();;

	    Thread.sleep(10000);
	    driver.findElement(By.id("sbarprice")).click();     
	}

	public static void date2(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("acol-flight-check-in")).clear();
        driver.findElement(By.id("acol-flight-check-in")).sendKeys("09/24/2016");
        driver.findElement(By.id("acol-flight-check-out")).clear();
	    driver.findElement(By.id("acol-flight-check-out")).sendKeys("09/27/2016");
	  Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='acol-flight-check-out-date-picker']/div/div/div[1]/button")).click();
	Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='acolPackageWizardFrm']/fieldset/fieldset/button")).click();;

	    Thread.sleep(10000);
	    driver.findElement(By.id("sbarprice")).click();     
	}
	
	public static void date3(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("acol-flight-check-in")).clear();
        driver.findElement(By.id("acol-flight-check-in")).sendKeys("09/27/2016");
        driver.findElement(By.id("acol-flight-check-out")).clear();
	    driver.findElement(By.id("acol-flight-check-out")).sendKeys("09/30/2016");
	  Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='acol-flight-check-out-date-picker']/div/div/div[1]/button")).click();
	Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='acolPackageWizardFrm']/fieldset/fieldset/button")).click();;

	    Thread.sleep(10000);
	    driver.findElement(By.id("sbarprice")).click();     
	}
	
	public static void date4(WebDriver driver) throws InterruptedException{
		driver.findElement(By.id("acol-flight-check-in")).clear();
        driver.findElement(By.id("acol-flight-check-in")).sendKeys("10/1/2016");
        driver.findElement(By.id("acol-flight-check-out")).clear();
	    driver.findElement(By.id("acol-flight-check-out")).sendKeys("10/3/2016");
	  Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='acol-flight-check-out-date-picker']/div/div/div[1]/button")).click();
	Thread.sleep(2000);
	    driver.findElement(By.xpath(".//*[@id='acolPackageWizardFrm']/fieldset/fieldset/button")).click();;

	    Thread.sleep(10000);
	    driver.findElement(By.id("sbarprice")).click();     
	}
}
	
	
