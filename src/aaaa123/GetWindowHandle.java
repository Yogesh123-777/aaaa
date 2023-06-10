package aaaa123;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class GetWindowHandle {

	public static void main(String[] args) {
		
	
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.amazon.in/");
		
			Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		driver.quit();
	}

}
