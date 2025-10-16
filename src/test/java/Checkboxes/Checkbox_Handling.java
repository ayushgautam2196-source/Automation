package Checkboxes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Option_1 = driver.findElement(By.id("checkBoxOption1"));
		//Assert.assertTrue(Option_1.isSelected());
		Option_1.click();
		Assert.assertTrue(Option_1.isSelected());
		if(Option_1.isSelected()) {
			System.out.println("Passed");
		}
		Thread.sleep(2500);
		Option_1.click();
		Assert.assertFalse(Option_1.isSelected());
		if(Option_1.isSelected()) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Passed");
		}
		
		//Count of Checkbox
		
		List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count = Checkboxes.size();
	Assert.assertEquals(count, 3);
	
	if(Checkboxes.size()==3){
		System.out.println("Passed");
	}

		

	}

}
