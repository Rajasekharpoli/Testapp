package com.selenium.programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertPopupsWindowsTest {

  @Test
	public static void main(String args[]) throws IOException, InterruptedException {
		
		Properties pro = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\MavenWithSelenium\\pro.properties");
		
		pro.load(fs);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(pro.getProperty("Alert_URL"));
		
		driver.findElement(By.xpath(pro.getProperty("Create_Now_Monster"))).click();
		
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(pro.getProperty("UploadResume"))).sendKeys("C:\\Users\\pc\\Desktop\\ex.html.txt");
		
		
	}
}
