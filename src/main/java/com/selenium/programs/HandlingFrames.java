package com.selenium.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) throws IOException {
		
		Properties pro = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\MavenWithSelenium\\pro.properties");
				pro.load(fi);
				
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("https://classic.crmpro.com/index.html");
				
				driver.findElement(By.name(pro.getProperty("Username_name_pro"))).sendKeys(pro.getProperty("Username"));
				driver.findElement(By.name(pro.getProperty("Password_name_pro"))).sendKeys(pro.getProperty("Password"));
				
				driver.findElement(By.xpath(pro.getProperty("LoginButton_class_pro"))).submit();
				
				driver.switchTo().frame("mainpanel");
				
				driver.findElement(By.xpath("//a[@text='Contacts']")).click();
				
				
	}

}
