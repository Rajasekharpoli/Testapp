package com.selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fblogin {
	
	public static void main(String args[]) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prajasekhar533@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("my@rkcompany6");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).sendKeys(Keys.ENTER);
		String val= driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("value");
		System.out.println(val);
		String url =driver.getCurrentUrl();
		
		System.out.println(url);
		
		
	
		
		
	}

}
