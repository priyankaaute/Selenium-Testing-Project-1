package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Baseclass {
	public static WebDriver driver;
	
	@BeforeClass
	public void LaunchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void TestData() throws Exception {
		
		WebElement username=driver.findElement(By.id("user-name"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginbtn.click();
		
		WebElement additem=driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
		additem.click();
		
		WebElement additem2=driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
		additem2.click();
	    Thread.sleep(1000);
	    
		WebElement cartbtn=driver.findElement(By.id("shopping_cart_container"));
		cartbtn.click();
		Thread.sleep(2000);
		
		WebElement removeBtn=driver.findElement(By.xpath("//button[@class='btn_secondary cart_button']"));
		removeBtn.click();
		
		WebElement checkout=driver.findElement(By.linkText("CHECKOUT"));
		checkout.click();
		
		WebElement firstname=driver.findElement(By.id("first-name"));
		WebElement lastname=driver.findElement(By.id("last-name"));
		WebElement Zipcode=driver.findElement(By.id("postal-code"));
		firstname.sendKeys("Priya");
		lastname.sendKeys("Patil");
		Zipcode.sendKeys("1234");
		
		WebElement continuebtn=driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
		continuebtn.click();
		
    	WebElement close=driver.findElement(By.cssSelector(".bm-burger-button button"));
		close.click();
		
		WebElement logoutBtn=driver.findElement(By.id("logout_sidebar_link"));
		logoutBtn.click();
		
	}
	
	@AfterClass
	public void CloseBrowser(){
//		WebElement username=driver.findElement(By.id("user-name"));
//		WebElement password=driver.findElement(By.id("password"));
		
//		username.clear();
//		password.clear();
		
    //	driver.close();
    //	driver.quit();
	}
}

