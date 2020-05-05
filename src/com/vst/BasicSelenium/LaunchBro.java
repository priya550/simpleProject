package com.vst.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBro {

	public static void main(String[] args) {
		// Launch Chrome Browser

		System.setProperty("webdriver.chrome.driver", "C:/Priyanga/Drivers19/Chrome/chromedriver.exe");
		
		WebDriver chdriver = new ChromeDriver();
		
		System.out.println("Chrome Browser has opened successfully");
		chdriver.get("https://www.amazon.com/");
		
	}

}
