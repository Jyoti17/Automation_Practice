package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
		int a = driver.findElements(By.xpath("//input[@type ='radio']")).size();
		System.out.println("Total number of radio "  + a);
		WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@value='f']"));
		if (radioButtonFemale.isSelected()) {
			System.out.println("Radio button is selected ");
			
		}
		else {
			
			System.out.println("Radio button is not selected");
			
		}
		
		
		

}
}
