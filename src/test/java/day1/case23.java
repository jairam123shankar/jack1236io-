package day1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class case23 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pagenumber = driver.findElement(By.xpath("//div[@class='dt-info']")).getText();
		String[] text = pagenumber.split(" ");
		System.out.println(text.length);
		
		String pages1=text[3];
		System.out.println(pages1);
		int totalpages=Integer.parseInt(pages1);
		System.out.println(totalpages);
				
				
	
		
	}
}
