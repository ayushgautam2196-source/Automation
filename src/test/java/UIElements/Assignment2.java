package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Ayush Gautam");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("asdf@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ASDFQWER");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement DD = driver.findElement(By.id("exampleFormControlSelect1"));
		Select Gender= new Select(DD);
		Gender.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("21-05-2023");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class, 'success alert')]")).getText());
		
		

	}

}
