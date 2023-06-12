package aaaa123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class abcd 
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("Admin1234");
		System.out.println("this is a facebook website");
		System.out.println("this is a facebook website");

		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.cssSelector("Forgotten password?")).click();
	}

}