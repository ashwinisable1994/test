import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUp {
	@Test
	public void scrollUp() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\New_Chrome_Exe\\chromedriver_win32 (9)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scrollBy(0, 1200)");
	Thread.sleep(2000);
	WebElement router=driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/312afPe2piL._AC_SY200_.jpg']"));
	js.executeScript("arguments[0].scrollIntoView();", router);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/312afPe2piL._AC_SY200_.jpg']")).click();
		
	}
}
