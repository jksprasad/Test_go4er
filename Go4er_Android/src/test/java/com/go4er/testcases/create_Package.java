package com.go4er.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.go4er.common.Base;
import com.go4er.utils.Utils;

import io.appium.java_client.android.AndroidDriver;

public class create_Package extends Base{
	
	public static AndroidDriver<WebElement>  driver;
	
	@Test (priority = 1)
	public static void fill_Fields1() {
		driver = lunchApp();
		Boolean screen1_Header = driver.findElements(By.xpath(Utils.packscreen_Header)).size()!=0;
 		if(screen1_Header == true){
 		
 			String packScreen1_Header = driver.findElement(By.xpath(Utils.packscreen_Header)).getText();
 			System.out.println(packScreen1_Header);
 			Assert.assertEquals("\"Making Life Easier\"", packScreen1_Header);
 			System.out.println("=====Create Package Screen1 loaded=====");
 			
 			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		}
 		driver.findElement(By.xpath(Utils.package_Name)).sendKeys("New Package1");
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		
 		driver.findElement(By.xpath(Utils.fragile)).click();
		
	}

}
