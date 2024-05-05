package com.stc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomNewTestv1 {

	public WebDriver driver=null;
	public pomNewTestv1(WebDriver driver)
	{
		this.driver=driver;

	}

	public void sendKeysID(String id,String msg)
	
	{  driver.findElement(By.id(id)).sendKeys(msg);
	
		}

public void sendKeysXpath(String xpath,String msg)
	
	{
	driver.findElement(By.xpath(xpath)).sendKeys(msg);
	
	}
}
