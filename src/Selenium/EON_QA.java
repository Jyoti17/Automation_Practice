package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EON_QA {

	public static WebDriver driver;

	public void login() {

		driver.findElement(By.name("username")).sendKeys("yugensys.eon+qa@eongroup.co");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	public void Mouseover() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Product"))).build().perform();
		act.click().build().perform();
	}

	public void SearchBox() {
		driver.findElement(By.xpath("//div[@class='search']")).click();
		WebElement test = driver.findElement(By.xpath("//form[@id='search']/div/input"));
		test.sendKeys("Test_JG_Auto");
		test.sendKeys(Keys.ENTER);
	}

	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://qa.app.eongroup.co/login/?next=dashboard ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void createProduct() {
		driver.findElement(By.linkText("Create Product")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test_JG_Auto");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	public static void main(String[] args) throws Exception {

		EON_QA eq = new EON_QA();

		eq.launchBrowser();
		eq.login();
		eq.Mouseover();
		eq.SearchBox();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
