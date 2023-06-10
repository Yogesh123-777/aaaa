package aaaa123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert {
	WebDriver driver;
	@BeforeMethod
	public void open() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
    
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("admin123");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
        Reporter.log(title,true);
       
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
}
