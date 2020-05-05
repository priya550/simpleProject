package com.vst.BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class SearchEBay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		//Identify Search Text Box and Provide Toys As Input		
		chdriver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Toys");
		
		//Identify the search Button		
		chdriver.findElement(By.cssSelector("#gh-btn")).click();
		
		//Get the title of the child title page		
		chdriver.getTitle();
		String childpagetitle = chdriver.getTitle();
		System.out.println("Ebay child page Launched : " +childpagetitle);
				
		// Quit		
		chdriver.quit();
		System.out.println("Quit Successfully");

	}

}
