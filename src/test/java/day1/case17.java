package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class case17 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement boxfield = driver.findElement(By.xpath("//input[@id='datepicker']"));
		boxfield.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String expectedmonth="October";
		String expectedyear="2023";
		String expday="27";
		
		String actmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String actyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(actmonth.equals(expectedmonth) && actyear.equals(expectedyear))) {
			driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
			actmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			actyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		driver.findElement(By.xpath("//a[text()='"+expday+"']")).click();
		
	}
}
