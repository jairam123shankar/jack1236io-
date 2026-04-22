package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class case19 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> names = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		String expectedtext="Chrome";
		
		for(int i=1;i<=names.size();i++) {
			String a=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText();
			if(a.equals(expectedtext)) {
				String y=driver.findElement(By.xpath("//tbody/tr["+i+"]/td[4]")).getText();
				System.out.println(y);
			}
			
		}
		
		
	}
}
