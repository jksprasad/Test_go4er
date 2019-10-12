package com.go4er.common;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;

public class Base {
	
	@BeforeSuite
	public static  AndroidDriver<WebElement> lunchApp() 
	{
		
		AndroidDriver<WebElement>  driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("BROWSER_NAME", "Android");
		cap.setCapability("VERSION", "8.1"); 
		cap.setCapability("deviceName","Pixel_go4");
		cap.setCapability("platformName","Android");    
        
		cap.setCapability("appPackage", "go4er.llc.user");  
		cap.setCapability("appActivity", "go4er.llc.user.views.splash.SplashActivity"); 
		try{
        
        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      
        System.out.println(driver.getContextHandles());
        driver.context("NATIVE_APP");
        return driver;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	
	
		
	}

}
