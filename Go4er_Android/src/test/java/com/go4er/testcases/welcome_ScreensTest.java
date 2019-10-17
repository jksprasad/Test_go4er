package com.go4er.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.go4er.common.Base;
import com.go4er.utils.Utils;

import io.appium.java_client.android.AndroidDriver;

public class welcome_ScreensTest extends Base {
	
	public static AndroidDriver<WebElement>  driver;
	
	
	@Test (priority = 1)
    public static void welcome_Screens() {
		driver= lunchApp();
		driver.findElement(By.xpath(Utils.welcome_Next)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Boolean Welcome_2 = driver.findElements(By.xpath(Utils.welcome_Header)).size()!=0;
 		if(Welcome_2 == true){
 		
 			String welcome2_lable = driver.findElement(By.xpath(Utils.welcome_Header)).getText();
 			System.out.println(welcome2_lable);
 			Assert.assertEquals("Get quotes from multiple\n" + 
 					"courier providers", welcome2_lable);
 			System.out.println("=====Now App Loaded 2nd Welcome page Successfully=====");
 		}
 		
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		
 		driver.findElement(By.xpath(Utils.welcome_Next)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Boolean Welcome_3 = driver.findElements(By.xpath(Utils.welcome_Header)).size()!=0;
 		if(Welcome_3 == true){
 		
 			String welcome2_lable = driver.findElement(By.xpath(Utils.welcome_Header)).getText();
 			System.out.println(welcome2_lable);
 			Assert.assertEquals("Read reviews and pick the\n" + 
 					"best courier company for\n" + 
 					"your order", welcome2_lable);
 			System.out.println("=====Now App Loaded 3rd Welcome page Successfully=====");
 		}
 		
 		driver.findElement(By.xpath(Utils.welcome_Next)).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Boolean Welcome_4 = driver.findElements(By.xpath(Utils.welcome_Header)).size()!=0;
 		if(Welcome_4 == true){
 		
 			String welcome3_lable = driver.findElement(By.xpath(Utils.welcome_Header)).getText();
 			System.out.println(welcome3_lable);
 			Assert.assertEquals("Sit back and relax!", welcome3_lable);
 			System.out.println("=====Now App Loaded Last Welcome page Successfully=====");
 		}
 		
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		driver.findElement(By.xpath(Utils.welcome_Next)).click();
 		
 		
 		
 		Boolean loc_permission = driver.findElements(By.xpath(Utils.loc_Permission)).size()!=0;
 		if(loc_permission == true){
 		
 			String loc_PermissionText = driver.findElement(By.xpath(Utils.loc_Permission)).getText();
 			System.out.println(loc_PermissionText);
 			Assert.assertEquals("Allow Go4er to access this device's location?", loc_PermissionText);
 			System.out.println("=====Location permission Popup displayed=====");
 			
 			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	 		driver.findElement(By.xpath(Utils.allow_Loc)).click();
 		} else {
 			
 			System.out.println("User already accept the location Permissions");	
 		}
		
	}
	

}
