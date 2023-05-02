package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class=\"navbar__tutorial-menu\"]")).click();
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[text()='QA Practices']"))).build().perform();
	act.moveToElement(driver.findElement(By.xpath("//*[@class='second-generation']/ul/li[3]"))).build().perform();
	
	act.click().build().perform();
  
	}

}
