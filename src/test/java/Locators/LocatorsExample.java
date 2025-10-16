package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// navigating to URL
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Locating Username Field Using ID Attribute
		driver.findElement(By.id("inputUsername")).sendKeys("Ayush");

		// Locating Password Field Using name Attribute
		driver.findElement(By.name("inputPassword")).sendKeys("Ayush");

		// Locating Submit Button Field Using className Attribute
		driver.findElement(By.className("signInBtn")).click();

		/*
		 * CSS Selector className---> tagname.classname---> button.signInBtn -----> if
		 * there is only one classname unique we can use only .classname p.error;
		 * id----> tagname#id generic---> Tagname[attribute='Value'] Parent to Child
		 * Transverse Parent_tagname Child_tagname only through some part of whole
		 * input[name*='Pass']
		 */

		// Retrieving error message from browser
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// Click on Forget Password Button
		driver.findElement(By.linkText("Forgot your password?")).click();

		/*
		 * Xpath //tagname[@attribute='value'] //input[contains(@id,'User')]
		 */ // parent_tagname/child_tagname

		// Input First name using Xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		// Input Email using Customized CSS
		driver.findElement(By.cssSelector("input[Placeholder='Email']")).sendKeys("john@xyz.com");

		// Clear using index Xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		// Input Email using indexed CSS
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		// input Phone number using Parent to child Xpath Transversing
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7017976754");

		// Click on Reset Button Using Parent to Child CSS Transversing
		driver.findElement(By.cssSelector("div button:nth-child(2)")).click();

		// getting new password
		String New_Password = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(New_Password);

		// navigating to login Page
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[@class='go-to-login-btn']"))
				.click();

		// Entering Value in Username by xapth contains
		driver.findElement(By.xpath("//input[contains(@id,'User')]")).sendKeys("Ayush");

		// Entering Value in Password by CSS
		driver.findElement(By.cssSelector("input[name*='Pass']")).sendKeys("rahulshettyacademy");

		Thread.sleep(1000);
		// Selecting the checkbox
		driver.findElement(By.id("chkboxOne")).click();
		
		
		//Clicking on Login
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();

		// Closing the Browser
		// driver.quit();

	}

}
