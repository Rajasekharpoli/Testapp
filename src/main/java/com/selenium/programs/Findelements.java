package com.selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelements {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		//System.out.println(list.);
	}

}
