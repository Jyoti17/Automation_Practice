package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProduct {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("black Shoes");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class=\"rush-component\"]/a/div/img)[1]")).click();


	}

}
