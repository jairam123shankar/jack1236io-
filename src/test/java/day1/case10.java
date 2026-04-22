package day1;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class case10 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement ele1 = driver.findElement(By.name("fname"));
		String ele2 = ele1.getDomAttribute("value");
		System.out.println(ele2);
		ele1.clear();
		ele1.sendKeys("Rajamouli");
		String ele3 = ele1.getDomProperty("value");
		System.out.println(ele3);
		
		System.out.println(ele1.getDomAttribute("value"));
	}
}
