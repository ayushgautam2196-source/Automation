package Ecommerce_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addingitemsincart {

	public static void main(String[] args) {
		String[] list = { "Cauliflower", "Cucumber", "Beans", "Brinjal" };
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver
				.findElements(By.xpath("//div[@class='product'] //h4[@class='product-name']"));
		

		for (int i = 0; i <= products.size(); i++) {
			String Extracted_Text = products.get(i).getText();
			
			List<String> arrayList = Arrays.asList(list);

			if (Extracted_Text.contains(arrayList)) {

			}
		}
	}

}
