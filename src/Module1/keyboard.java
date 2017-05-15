package Module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yatra.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  WebElement key=driver.findElement(By.id("BE_flight_origin_city"));
		  key.sendKeys("chen");
		  key.sendKeys(Keys.ARROW_DOWN);
		  key.sendKeys(Keys.ENTER);
		  key.sendKeys(Keys.TAB);
		  
		  WebElement key1=driver.findElement(By.id("BE_flight_arrival_city"));
		  key1.sendKeys("bang");
		  key1.sendKeys(Keys.ENTER);
	}

}
