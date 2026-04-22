package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class case12 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement noele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")));
		noele.click();
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		//coming google
	}
}
