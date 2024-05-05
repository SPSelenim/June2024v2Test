package com.stc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestv1 {
  @Test
  public void f() {
	  System.out.println("TTTT");
	  try
	  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	driver.findElement(By.id("fname")).sendKeys("PAWAL");
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("xxxxxx");
	String strActual=driver.findElement(By.xpath("//a[@name='Development']")).getAttribute("href");
	System.out.println("ACTUAL is :"+strActual);
	  Thread.sleep(2000);
		
	
	  driver.quit();
	  
	  }
	  catch(Exception e)
	  {
		  System.out.println( e.getMessage());
	  }
  }
}
