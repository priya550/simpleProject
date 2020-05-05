package com.vst.BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayLoginAlone {

	public static void main(String[] args) {
						
				//Login 
				System.setProperty("webdriver.chrome.driver", "C:/Priyanga/Drivers19/Chrome/chromedriver.exe");
				WebDriver chdriver = new ChromeDriver();
				System.out.println("Browser Opened Successfully..");
				chdriver.manage().window().maximize();
				chdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				chdriver.get("https://www.ebay.com/");
				
				//Get Home Page Title
				chdriver.getTitle();
				String homepagetitle = chdriver.getTitle();
				System.out.println("EBay Site Launched.. Home Page Title : "+homepagetitle);
				
				//SignIn_Link
				chdriver.findElement(By.linkText("Sign in")).click();
				System.out.println("Reached Signin Page..");
				
				//UserId
				chdriver.findElement(By.cssSelector("#userid")).sendKeys("sahanasubbiahmca@gmail.com");
				
				//Password
				chdriver.findElement(By.cssSelector("#pass")).sendKeys("Mallishri13");
				
				//Signin_Button
				chdriver.findElement(By.cssSelector("#sgnBt")).click();
				
				System.out.println("SignIn Successfully..");
				
				//Search Toys
				chdriver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Toys");
				chdriver.findElement(By.xpath("//input[@id='gh-btn']")).click();
				
				//Get Child Page Title
				chdriver.getTitle();
				String childpagetitle = chdriver.getTitle();
				System.out.println("EBay Child Page Title is : "+childpagetitle);
								
				//Logout
				chdriver.findElement(By.xpath("//b[@class='gh-eb-arw gh-sprRetina']")).click();
				chdriver.findElement(By.linkText("Sign out")).click();
				System.out.println("LogOut Successfully...");
				
				//Quit
				chdriver.quit();
				System.out.println("Quit Successfully..");
				
	}

}
