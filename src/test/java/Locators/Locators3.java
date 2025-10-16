package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String Password = getPassword(driver);

		// navigating to URL
		// driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// Locating Username Field Using ID Attribute

		// navigating to login Page
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[@class='go-to-login-btn']"))
				.click();

		driver.findElement(By.id("inputUsername")).sendKeys("Ayush");

		// Locating Password Field Using name Attribute
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		// Locating Submit Button Field Using className Attribute
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		// finding the Tag p
		String Text = driver.findElement(By.tagName("p")).getText();
		System.out.println(Text);
		Assert.assertEquals(Text, "You are successfully logged in.");
		// Xpath by test
		// tagname[text()=""]
		// close the browser

		// clicking on Logout Button
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
		String New_Password = driver.findElement(By.cssSelector("form p")).getText();
		String pass[] = New_Password.split("'");
		String[] pass2 = pass[1].split("'");
		String updated_password = pass2[0];
		return updated_password;

	}

}
