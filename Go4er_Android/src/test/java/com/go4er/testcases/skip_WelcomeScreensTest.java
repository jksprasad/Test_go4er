package com.go4er.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.go4er.common.Base;
import com.go4er.utils.Utils;

import io.appium.java_client.android.AndroidDriver;

public class skip_WelcomeScreensTest extends Base {
	
	public static AndroidDriver<WebElement>  driver;
	
	@Test (priority = 1)
    public static void skip_Welcome() {
		driver= lunchApp();
		
		driver.findElement(By.xpath(Utils.welcome_Skip)).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Boolean loc_permission = driver.findElements(By.xpath(Utils.loc_Permission)).size()!=0;
 		if(loc_permission == true){
 		
 			String loc_PermissionText = driver.findElement(By.xpath(Utils.loc_Permission)).getText();
 			System.out.println(loc_PermissionText);
 			Assert.assertEquals("Allow Go4er to access this device's location?", loc_PermissionText);
 			System.out.println("=====Location permission Popup displayed=====");
 			
 			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	 		driver.findElement(By.xpath(Utils.allow_Loc)).click();
 		}
 		else {
 			
 			System.out.println("User already accept the location Permissions");	
 		}

		
	}

}
