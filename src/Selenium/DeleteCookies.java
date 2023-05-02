package Selenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DeleteCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().window().maximize();
	     //Set ck = driver.manage().getCookies();
	    //  System.out.println("Cookie count: "+ck.size());
	      driver.manage().deleteAllCookies();
	      Set ch = driver.manage().getCookies();
	      System.out.println("Cookie count after delete: "+ch.size());
	}

}
