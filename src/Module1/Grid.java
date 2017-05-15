package Module1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grid {
	WebDriver d;
	 
	 @BeforeTest
	 public void settings() throws MalformedURLException{
	  
	  String pop = "172.16.1.1:909";
	  Proxy p = new Proxy();
	  p.setHttpProxy(pop).setFtpProxy(pop).setSslProxy(pop);
	  DesiredCapabilities con = new DesiredCapabilities();
	  con.setCapability(CapabilityType.PROXY, p);
	  String nodeurl="http://172.16.1.82:4444/wd/hub";
	  //DesiredCapabilities con = new DesiredCapabilities();
	  con.setBrowserName("firefox");
	  con.setPlatform(Platform.ANY);
	  //System.setProperty("webdriver.gecko.driver", "D:\\All Jars\\geckodriver-v0.10.0-win64\\geckodriver.exe");
	  d = new RemoteWebDriver(new URL(nodeurl),con);
	 }
	  @Test
	  public void executeTest() {
	   d.get("https://www.google.co.in/");
	   String s = d.getTitle();
	   System.out.println(s);
	  }
	}

