package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//a
public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		// Locating Submit Button Field Using className Attribute
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		//finding the Tag p
		String Text = driver.findElement(By.tagName("p")).getText();
		System.out.println(Text);
		Assert.assertEquals(Text, "You are successfully logged in.");
		// Xpath by test
		//tagname[text()=""]
		//close the browser
		
		//clicking on Logout Button
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();

	}

}
