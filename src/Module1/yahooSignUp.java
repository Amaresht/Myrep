package Module1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooSignUp {

		public static void main(String[] args) throws InterruptedException {
			  // TODO Auto-generated method stub
			System.setProperty("webdriver.firefox.marionette", "D:\\Selenium\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			 

			    driver.get("https://login.yahoo.com/account/create?intl=in&.done=http%3A%2F%2Fin.mail.yahoo.com&specId=yidReg&altreg=0");
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("//*[@id='usernamereg-firstName']")).sendKeys("Hello");
			    driver.findElement(By.id("usernamereg-firstName")).sendKeys("hello");
				driver.findElement(By.id("usernamereg-lastName")).sendKeys("hello1");
				driver.findElement(By.id("usernamereg-yid")).sendKeys("Hello123");
				driver.findElement(By.id("usernamereg-password")).sendKeys("Hello123");
				driver.findElement(By.id("usernamereg-phone")).sendKeys("98457438574387");
				Select Month=new Select(driver.findElement(By.id("usernamereg-month")));
				Month.selectByValue("10");
				Select Day=new Select(driver.findElement(By.id("usernamereg-day")));
				Day.selectByValue("18");
				Select Year=new Select(driver.findElement(By.id("usernamereg-year")));
				Year.selectByValue("1980");
				
				
			    /*driver.findElement(By.id("usernamereg-freeformGender")).click();
			   
			    WebElement  w = driver.findElement(By.id("reg-gender-list"));
			    List<WebElement> options = w.findElements(By.tagName("li")); 
			    for(WebElement ele:options){
			     System.out.println(ele.getText());
			     if(ele.getText().equalsIgnoreCase("female")){
			      ele.click();
			      System.out.println(ele.getText());*/
			     }
			     
			    
	}


