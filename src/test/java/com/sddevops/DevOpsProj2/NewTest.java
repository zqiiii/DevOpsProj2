package com.sddevops.DevOpsProj2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	//declare Selenium WebDriver
	  private WebDriver webDriver;	
	  
	  
  @Test
  public void checkTitle() {
	  
	  webDriver.navigate().to("http://localhost:8090/DevOpsProj2/");
	  
	  //Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "Worker-Registration");
	  System.out.println("title: "+webDriver.getTitle());  
  }
  	  
  
  

  @BeforeTest
  public void beforeTest() {
	//Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  String chromeDriverDir = "C:\\Users\\65929\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";

	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver(); 
  }

  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.quit();			
  }

}
