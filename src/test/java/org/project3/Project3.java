package org.project3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project3 {
	
	WebDriver driver;
	
	@BeforeSuite
	private void tc1() {
		System.out.println("Setup");

	}
	@BeforeClass
	private void tc2() {
		System.out.println("passed");
	}
	@BeforeMethod
	private void tc3() {
		System.out.println("passed");

	}
	@BeforeTest
	private void tc5() {
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test
	private void tc6() {
		WebElement depature = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select select1 =new Select(depature);
		select1.selectByValue("Paris");
		WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select select2 =new Select(destination);
		select2.selectByVisibleText("Buenos Aires");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@class='btn btn-small'])[2]")).click();
		driver.findElement(By.id("inputName")).sendKeys("username");
		driver.findElement(By.id("address")).sendKeys("abcdefghijklmnop");
		driver.findElement(By.id("city")).sendKeys("xyz");
		driver.findElement(By.id("state")).sendKeys("abc");
		driver.findElement(By.id("zipCode")).sendKeys("123455");
		WebElement cardType = driver.findElement(By.xpath("//select[@class='form-inline']"));
		Select select=new Select(cardType);
		select.selectByValue("amex");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234567890123456");
		driver.findElement(By.id("creditCardMonth")).sendKeys("07");
		driver.findElement(By.id("creditCardYear")).sendKeys("2050");
		driver.findElement(By.id("nameOnCard")).sendKeys("acb");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		

	}
	@AfterTest
	private void tc7() {
		System.out.println("passed");

	}
	@AfterMethod
	private void tc8() {
		driver.quit();

	}
	@AfterClass
	private void tc9() {
		System.out.println("passed");

	}
	@AfterSuite
	private void tc10() {
		System.out.println("passed");

	}
	

}
