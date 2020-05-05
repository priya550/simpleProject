package com.vst.BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayCreateAccount {
	
	//Create EBay Account
	public void createaccount()
	{
		// Launch EBay Browser And Create Account
		
				System.setProperty("webdriver.chrome.driver", "C:/Priyanga/Drivers19/Chrome/chromedriver.exe");
				WebDriver chdriver = new ChromeDriver();
				System.out.println("Chrome Browser has Launched Successfully");
				
				chdriver.manage().window().maximize();
				chdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				chdriver.get("https://www.ebay.com/");
				
				//Get Home Page Title
				chdriver.getTitle();
				String homepagetitle = chdriver.getTitle();
				System.out.println("EBay Site Launched : " +homepagetitle);
				
				//Click SignIn
				chdriver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
				
				//Create Account
				chdriver.findElement(By.cssSelector("#InLineCreateAnAccount")).click();
				
				//First Name
				chdriver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Priyanga");
				
				//Last Name
				chdriver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Subbiah");
				
				//Email
				chdriver.findElement(By.cssSelector("#email")).sendKeys("priyangasubbiah1990@gmail.com");
				
				//Password
				chdriver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Priyanga13");
				//Show Password
				//chdriver.findElement(By.xpath("//input[@name='checkbox-default']")).click();
				
				//Button - Create Account
				chdriver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']"));
				System.out.println("EBay Account Has Created..");
				
				//Quit from the Browser
				chdriver.quit();
				System.out.println("Quit Successfully");
				

	}

}
