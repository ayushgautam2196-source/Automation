package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Enabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String textStyle;
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement One_Trip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		WebElement To_Date = driver.findElement(By.xpath("//div[@class='picker-second']"));
		WebElement RoundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		WebElement MultiTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2"));

		// Thread.sleep(1000);
		RoundTrip.click();
		//MultiTrip.click();

		if (One_Trip.isSelected() || RoundTrip.isSelected()) {
			textStyle = To_Date.getDomAttribute("style");
			System.out.println(textStyle);

			String expectedValue = One_Trip.isSelected() ? "0.5" : "1";
			System.out.println(textStyle.contains(expectedValue) ? "Passed" : "Failed");

		} else if (MultiTrip.isSelected()) {
			System.out.println(To_Date.isDisplayed() ? "Failed" : "Passed");
		}

		else {
			System.out.println("Failed");
		}

		/*
		 * if(One_Trip.isSelected()) {
		 * 
		 * if(To_Date.isEnabled()) { System.out.println("Failed"); } else {
		 * System.out.println("Passed"); }
		 * 
		 * } else if(RoundTrip.isSelected()) { if(To_Date.isEnabled()) {
		 * System.out.println("Passed"); } else { System.out.println("Failed"); }
		 * 
		 * } else if (MultiTrip.isSelected()) {
		 * 
		 * if(To_Date.isDisplayed()) { System.out.println("Failed"); }
		 */

	}

}
