package com.bit.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	
	
	ChromeDriver dr;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdalam/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		//dr = new ChromeDriver();
	}
	
	public void myWait(long millis) throws InterruptedException {
		
		Thread.sleep(millis);
	}
	public void closeBrowser() throws InterruptedException {
		
		myWait(5000);
		dr.quit();//it will quit the entire browser
		//dr.close();it will close current tab
	}
	public void navigateToUrl(String url) {
		
		dr.get(url);
	}
	public void getPageTitle(String expectedTitle) {
		String title = dr.getTitle();
		boolean result = title.equals(expectedTitle);
		System.out.println("the homepage title : " +title);
		System.out.println("the homepage title result : " +result);
	}
	//public void getPageTitle(String expectedTitle) {
		//String actualTitle = dr.getTitle();
		//boolean result = actualTitle.equals(expectedTitle);
		//System.out.println("The page title : " + result);
		
	//}
	public void getPageUrl(String expectedUrl) {
		
		String actualUrl = dr.getCurrentUrl();
		boolean result = actualUrl.contains(expectedUrl);
		System.out.println("Home Page Url : " +result);
		
	}
	public void verifyOnElement(By locator) {
		
		boolean result = dr.findElement(locator).isDisplayed();
		System.out.println("Element display result : " + result);
		
	}
	public void verifyText(By locator) {
		
		String text = dr.findElement(locator).getText();
		System.out.println(text);
	}
	public void clickOnElement(By abc) {
		dr.findElement(abc).click();
		}
	
	public void typeOnElement(WebElement webelement, String value) {
		webelement.sendKeys(value);
	}
	
	//public void clickOnElement(By locator) {
		
		//dr.findElement(locator).click();
//}
	//public void typeOnElement(WebElement element, String value) {
		
		//element.sendKeys(value);

	//}
	      
	public void typeOnElement1(WebElement webelement, String value) {
		webelement.sendKeys(value);
	}


}
