package Selenium;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenshotTest {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		String date=new  SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("E:\\Automation Testing\\WebDriver\\JavaProgram\\Screenshot-" + date + ".png"));
		
		
		
	}
	
}


