package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector {
	public static void main(String [] args){
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&hl=en&service=mail#identifier");
		driver.findElement(By.cssSelector("#Email")).sendKeys("amaresh.t@deccansoft.com");
	
	}
	
	

}
