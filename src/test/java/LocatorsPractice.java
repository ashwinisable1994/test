import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsPractice {
	@Test
	public void scrollUp() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\New_Chrome_Exe\\chromedriver_win32 (9)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	System.out.println(driver.findElements(By.tagName("img")).size());
	}
}