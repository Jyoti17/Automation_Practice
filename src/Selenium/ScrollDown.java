package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
	
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement meet= driver.findElement(By.xpath("//a[@class=\"btn btn-border active\"]"));
		js.executeScript("arguments[0].scrollIntoView();", meet);
	}

}
