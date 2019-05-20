package com.selenium.programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getText {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		/*for(int i=0;i<link.size();i++) {
			String names = link.get(i).getText();
			
			System.out.println(names);
		}*/
		
		for(WebElement names:link) {
			System.out.println(names.getText());
		}
		
		driver.close();
	}

}
