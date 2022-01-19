package testing;

import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminSeleniumTest {
	@Test
	public  void ubuntumain() throws IOException, InterruptedException {
       // System.setProperty("webdriver.chrome.driver","D:\\New folder\\appmvt-20211129T095833Z-001\\appmvt\\driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--disable-extensions");
		
		
		//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        // System.setProperty("webdriver.chrome.driver","D:\\New folder\\appmvt-20211129T095833Z-001\\appmvt\\driver\\chromedriver.exe");

		WebDriver driv = new ChromeDriver(chromeOptions);
		//WebDriver driv = new ChromeDriver();
		//driv.get("https://www.google.com/");
		System.out.println("started successfully");
        
        
	}
}
