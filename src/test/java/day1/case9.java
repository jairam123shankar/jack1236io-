package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class case9 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentwindowid = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demo.opencart.com/");
		String text2 = driver.getTitle();
		System.out.println(text2);
		WebElement s1 = driver.findElement(By.xpath("//input[@name='search']"));
		s1.sendKeys("hp");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://selenium143.blogspot.com/");
		System.out.println(driver.getTitle());
		
	}
}
