package com.selenium.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsEx {

	public static void main(String args[]) throws IOException {
		
		
		Properties pro = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\MavenWithSelenium\\pro.properties");

		pro.load(fi);

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		// driver.navigate().to("http://www.facebook.com");
		driver.get("http://www.facebook.com");

		driver.findElement(By.id(pro.getProperty("Username_pro"))).sendKeys(pro.getProperty("Email_ID"));
		driver.findElement(By.xpath(pro.getProperty("password_pro"))).sendKeys(pro.getProperty("Password"));
		
		driver.findElement(By.xpath(pro.getProperty("login_Button"))).click();
		
		//Alert alert = driver.switchTo().alert();
		
		//alert.accept();
		
		
		//driver.findElement(By.id("UserNAvigationLOgout_pro")).click();

	}

}
