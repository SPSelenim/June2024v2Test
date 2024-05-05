package com.stc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestv1 {
  public WebDriver driver=null;
	
	@BeforeClass
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		  driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		  driver.manage().window().maximize();
		 
	}
	
	@Test
  public void f() {
	  System.out.println("TTTT");
	  try
	  {
		  Thread.sleep(2000);
	pomNewTestv1 pom1=new pomNewTestv1(driver);
	pom1.sendKeysID("fname", "PAWAL");
		pom1.sendKeysXpath("//input[@id='lname']", "xxxxx1xpath");
		  String strActual=driver.findElement(By.xpath("//a[@name='Development']")).getAttribute("href");
	System.out.println("ACTUAL is :"+strActual);
	  Thread.sleep(2000);
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println( e.getMessage());
	  }
  }
	
	@AfterClass
	public void tearDown()
	{
		 driver.quit();
	}
}
