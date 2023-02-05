package com.bit.selenium2;

import org.openqa.selenium.By;

public class Scenarion {
	
	Shared s = new Shared();
	SharedData sd = new SharedData();
	
	/*Scenario : Target product checkout
	 * 1. Open browser
	 * 2. Navigate to target.com
	 * 3. Print Url
	 * 4. print the title
	 * 5. Type kids shoes on the search box
	 * 6. click on search button
	 * 7. Select girls from the list
	 * 8. Select the first product from the list
	 * 9. In product detail page select any size
	 * 10.Click on quantity drop down and select any quantity
	 * 11.Verify the same number of quantity also appears on the cart icon as well.
	 * 12.Click on cart icon and navigate to cart page
	 * 13.Click on save for later
	 * 14.Verify that "Your cart is empty" appears as title
	 * 15.Print the title. */
	
	public void TargetAddToCart() throws InterruptedException {
		
		s.openBrowser();
		s.navigateToUrl(sd.targetUrl);
		s.getPageUrl(sd.targetUrl);
		s.getPageTitle(sd.homePageTitle);
		//s.getPageTitle(sd.homePageTitle);
		s.typeOnElement(s.dr.findElement(By.id("search")), "kids shoes");
		s.clickOnElement(By.xpath("//button[text()='go']"));
		s.myWait(5000);
		s.clickOnElement(By.xpath("//div[@id='pageBodyContainer']/div[1]//div[4]//div[@class='children']/li[1]/a"));
		s.myWait(5000);
		s.clickOnElement(By.xpath("//div[@id='pageBodyContainer']//div[4]//div[2]/div//section/div/div[1]/div/div/div[1]//h3/div/div/a"));
		s.myWait(5000);
		s.clickOnElement(By.xpath("//div[@id='pageBodyContainer']/div/div[2]/div[2]/div/div[3]/div[1]/div[2]//div[1]//div[2]/a"));
		s.myWait(5000);
		s.clickOnElement(By.xpath("//span[text()='Qty']"));
		s.myWait(5000);
		s.clickOnElement(By.id("addToCartButtonOrTextIdFor84967887"));
		s.myWait(5000);
		s.clickOnElement(By.xpath("//a[text()='View cart & check out']"));
		s.myWait(5000);
		s.verifyOnElement(By.xpath("//nav[@id='headerPrimary']//a[4]"));
		s.myWait(5000);
		s.clickOnElement(By.xpath("//button[text()='Save for later']"));
		s.myWait(5000);
		s.verifyText(By.xpath("//h1[text()='Your cart is empty']"));
		
		
		
		
		
		
	}

}
