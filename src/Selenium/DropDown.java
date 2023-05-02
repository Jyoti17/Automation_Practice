package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.app.eongroup.co/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("yugensys.eon+qa@eongroup.co");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Product"))).build().perform();
		act.click().build().perform();
		
		WebElement DDL = driver.findElement(By.xpath("//main[@class= 'main']/div/div[2]/div/div[2]"));
		DDL.click();
		
		Select sct = new Select(DDL);
		sct.selectByIndex(3);
		
		
		
		
		
		
		
		
				//Action Drop-Dwon
				////main[@class= 'main']/div/div[2]/div/div[2]
		

	}

}
