package Module1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseEvenints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.americangolf.co.uk/");
		WebElement golfclub= driver.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(golfclub).build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='CLUBS_1']/ul/li[1]/ul/li[1]/a/span[1]")));
		
		driver.findElement(By.xpath(".//*[@id='CLUBS_1']/ul/li[1]/ul/li[1]/a/span[1]")).click();
		


	}

	private static Actions Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
