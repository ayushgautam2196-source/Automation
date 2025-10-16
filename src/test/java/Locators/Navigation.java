package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {

		// Launch the browser

		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();

		// navigating to URL

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//

	}

}
