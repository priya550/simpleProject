package com.vst.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBro {

	public static void main(String[] args) {
		// Launch IE Browser
		System.setProperty("webdriver.ie.driver", "C:/Priyanga/Drivers19/InternetExplorer/IEDriverServer.exe");
		WebDriver iedriver =new InternetExplorerDriver();
		System.out.println("Successfully Launched IE Browser");
		iedriver.get("https://www.ebay.com/");
		
	}

}
