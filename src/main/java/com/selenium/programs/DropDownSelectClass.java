package com.selenium.programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class DropDownSelectClass {

	public static void main(String[] args) throws IOException {

			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			/*WebElement element = driver.findElement(By.id("day"));
			Select select = new Select(element);
			 select.selectByVisibleText("12");*/
			 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(screenshot, new File("C:\\MavenWithSelenium.png"));
			
	}
	

}
