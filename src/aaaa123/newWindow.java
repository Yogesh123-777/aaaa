package aaaa123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement  ele= driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		driver.findElement(By.xpath("(//p[text()='Shop Now'])[1]")).click();
		WebElement bg = driver.findElement(By.xpath("(//div[@class='_24_Dny'])[21]"));
		boolean nm = bg.isSelected();
		
		
		

	}

}
