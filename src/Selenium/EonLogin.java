package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.runtime.model.ExceptionThrown;

public class EonLogin {

	public static void main (String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://sandbox.app.eongroup.co/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("deepakp+eon@yugensys.com");
		driver.findElement(By.name("password")).sendKeys("Yugen@123");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//div[@class=\"search\"]")).click();
		WebElement W= driver.findElement(By.xpath("//form[@id=\"search\"]/div/input"));
		W.sendKeys("YuEON");
		W.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//table[@class=\"table--products-list table\"]/tbody/tr[2]/td[1]/input")).click();

	}

}
