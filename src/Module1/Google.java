package Module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("http://www.google.co.in");
		//System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.google.com");
		driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.id("Email")).sendKeys("amaresh.t@deccansoft.com");
		driver.findElement(By.id("next")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("Passwd")).sendKeys("amresh@2016");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath(".//*[@id=':h1']/div/div")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@name='to']")).sendKeys("amaresh.t@deccansoft.com");
		driver.findElement(By.xpath(".//*[@name='subjectbox']")).sendKeys("Hello");
		driver.findElement(By.xpath(".//*[@class='Am Al editable LW-avf']")).sendKeys("Good morning");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@data-tooltip='Send ‪(Ctrl-Enter)‬']")).click();
		
		
         
	}
}
