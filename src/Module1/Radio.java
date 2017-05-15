package Module1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {
	public static void main(String []args){
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement le=driver.findElement(By.xpath(".//*[@id='u_0_j']"));
		le.click();
		le.isSelected();
		
		
	}

}
