package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class day12 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("raj@gmail.com");
		WebElement newframe = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		driver.switchTo().frame(newframe);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kjhdf");
		driver.switchTo().defaultContent();
		String textname = driver.findElement(By.xpath("//li[2]")).getText();
		System.out.println(textname);
		
		
		
	}
}
