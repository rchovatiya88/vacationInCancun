package com.vacationInCancun;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	

	public static void main (String[] args) throws InterruptedException, IOException { 

	    // tell webdriver where to find the chrome driver
	   // String currentDir = System.getProperty("user.dir");
		
	    
	
		String exePath = "C:\\Selenium\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", exePath );
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.expedia.com");
	   
	    driver.findElement(By.id("tab-package-tab")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("package-origin")).sendKeys("Newark, NJ, United States (EWR-Liberty Intl.)");
	    driver.findElement(By.id("package-destination")).sendKeys("Cancun (and vicinity), Quintana Roo, Mexico");
	    driver.findElement(By.id("package-departing")).sendKeys("09/16/2016");
	    driver.findElement(By.id("package-returning")).sendKeys("09/19/2016");
	    driver.findElement(By.id("search-button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("sbarprice")).click();
	    
	    Thread.sleep(5000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
        	jse.executeScript("window.scrollBy(0,325)", "");
        	Thread.sleep(2000);
        	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	//The below method will save the screen shot in d drive with name "screenshot.png"
        	FileUtils.copyFile(scrFile, new File("C:\\Selenium\\screenshots\\firstpage.jpg"));
	   
		   //assertThat(chrome.getTitle(), is("HTML Form Elements"));
		    	
		  //  driver.quit();
        	jse.executeScript("window.scrollBy(325,675)", "");
           Thread.sleep(1000);
           File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //The below method will save the screen shot in d drive with name "screenshot.png"
              FileUtils.copyFile(scrFile1, new File("C:\\Selenium\\screenshots\\secondpage.jpg"));
              Thread.sleep(2000);
              jse.executeScript("window.scrollBy(675,900)", "");
              Thread.sleep(2000);
              
      	  /*  File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
              //The below method will save the screen shot in d drive with name "screenshot.png"
                 FileUtils.copyFile(scrFile2, new File("C:\\Selenium\\screenshots\\thirdpage.jpg"));
                 
                 Thread.sleep(2000);
                 jse.executeScript("window.scrollBy(900,1225)", "");
                 Thread.sleep(2000);
                 
         	    File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                 //The below method will save the screen shot in d drive with name "screenshot.png"
                    FileUtils.copyFile(scrFile3, new File("C:\\Selenium\\screenshots\\fourthpage.jpg"));
                    
                    Thread.sleep(2000);
                    jse.executeScript("window.scrollBy(1225,1550)", "");
                    Thread.sleep(2000);
                    
            	    File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    //The below method will save the screen shot in d drive with name "screenshot.png"
                       FileUtils.copyFile(scrFile4, new File("C:\\Selenium\\screenshots\\fifthpage.jpg"));
                       
                       Thread.sleep(2000);
                       jse.executeScript("window.scrollBy(1550,1875)", "");
                       Thread.sleep(2000);
                       
               	    File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                       //The below method will save the screen shot in d drive with name "screenshot.png"
                          FileUtils.copyFile(scrFile5, new File("C:\\Selenium\\screenshots\\sixthpage.jpg")); */
                          
                          jse.executeScript("window.scrollBy(1875,0)", "");
                          
                          
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
                  	  Thread.sleep(5000);
                  		jse.executeScript("window.scrollBy(0,325)", "");
                    	Thread.sleep(2000);
                    	File scrFile60 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                    	//The below method will save the screen shot in d drive with name "screenshot.png"
                    	FileUtils.copyFile(scrFile60, new File("C:\\Selenium\\screenshots\\nextdate\\firstpage.jpg"));
            	   
            		   //assertThat(chrome.getTitle(), is("HTML Form Elements"));
            		    	
            		  //  driver.quit();
                    	jse.executeScript("window.scrollBy(325,675)", "");
                       Thread.sleep(1000);
                       File scrFile10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                       //The below method will save the screen shot in d drive with name "screenshot.png"
                          FileUtils.copyFile(scrFile10, new File("C:\\Selenium\\screenshots\\nextdate\\secondpage.jpg"));
                          Thread.sleep(2000);
                          jse.executeScript("window.scrollBy(675,900)", "");
                          Thread.sleep(2000);
                          
                  	    File scrFile20 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                          //The below method will save the screen shot in d drive with name "screenshot.png"
                             FileUtils.copyFile(scrFile20, new File("C:\\Selenium\\screenshots\\nextdate\\thirdpage.jpg"));
                             
                             Thread.sleep(2000);
                             jse.executeScript("window.scrollBy(900,1225)", "");
                             Thread.sleep(2000);
                             
                     	    File scrFile30 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                             //The below method will save the screen shot in d drive with name "screenshot.png"
                                FileUtils.copyFile(scrFile30, new File("C:\\Selenium\\screenshots\\nextdate\\fourthpage.jpg"));
                                
                                Thread.sleep(2000);
                                jse.executeScript("window.scrollBy(1225,1550)", "");
                                Thread.sleep(2000);
                                
                        	    File scrFile40 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                                //The below method will save the screen shot in d drive with name "screenshot.png"
                                   FileUtils.copyFile(scrFile40, new File("C:\\Selenium\\screenshots\\nextdate\\fifthpage.jpg"));
                                   
                                   Thread.sleep(2000);
                                   jse.executeScript("window.scrollBy(1550,1875)", "");
                                   Thread.sleep(2000);
                                   
                           	    File scrFile50 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                                   //The below method will save the screen shot in d drive with name "screenshot.png"
                                      FileUtils.copyFile(scrFile50, new File("C:\\Selenium\\screenshots\\nextdate\\sixthpage.jpg"));
                                      
                                      jse.executeScript("window.scrollBy(1875,0)", "");
driver.quit();

	}
	
	
}
 