package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class case18 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement datefield = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'form-field')]")));
		datefield.click();
		//driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flatpickr-calendar animate open arrowBottom']")));
		
	}
}
