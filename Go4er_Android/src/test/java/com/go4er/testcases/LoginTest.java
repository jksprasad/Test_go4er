package com.go4er.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.go4er.common.Base;
import com.go4er.utils.Utils;

import io.appium.java_client.android.AndroidDriver;

public class LoginTest extends Base {
	
	public static AndroidDriver<WebElement>  driver;
	
	@Test (priority = 1)
    public static void welcome_Screes() {
		driver= lunchApp();
		driver.findElement(By.xpath(Utils.welcome1_Next)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Boolean Welcome_2 = driver.findElements(By.xpath(Utils.welcome2_Header)).size()!=0;
 		if(Welcome_2 == true){
 		
 			String welcome2_lable = driver.findElement(By.xpath(Utils.welcome2_Header)).getText();
 			System.out.println(welcome2_lable);
 			Assert.assertEquals("Get quotes from multiple\n" + 
 					"courier providers", welcome2_lable);
 		}
 		
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		
 		driver.findElement(By.xpath(Utils.welcome1_Next)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Boolean Welcome_3 = driver.findElements(By.xpath(Utils.welcome2_Header)).size()!=0;
 		if(Welcome_3 == true){
 		
 			String welcome2_lable = driver.findElement(By.xpath(Utils.welcome2_Header)).getText();
 			System.out.println(welcome2_lable);
 			Assert.assertEquals("Read reviews and pick the\n" + 
 					"best courier company for\n" + 
 					"your order", welcome2_lable);
 		}
		
	}

}
