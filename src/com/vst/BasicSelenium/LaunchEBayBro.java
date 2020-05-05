package com.vst.BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEBayBro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Priyanga/Drivers19/Chrome/chromedriver.exe");
		WebDriver chdriver = new ChromeDriver();		
		System.out.println("Chrome Browser has opened successfully");
		chdriver.manage().window().maximize();
		chdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		chdriver.get("https://www.ebay.com/");
		
		// Get Title
		chdriver.getTitle();
		String homepagetitle = chdriver.getTitle();
		System.out.println("Ebay Site Launched : " +homepagetitle);
		
		// Quit
		
		chdriver.quit();
		System.out.println("Quit Successfully");

	}

}
