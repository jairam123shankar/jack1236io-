package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class case21 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logpage = driver.findElement(By.xpath("//h2[text()='LoginSection']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", logpage);
		
		
		
		
		//jse.executeScript("prompt('can u enter ur name')");
		
		//jse.executeScript("confirm('can u enter your name')");
		
		//jse.executeScript("confirm('Are you sure?')");
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert a=driver.switchTo().alert();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(a.getText());
		a.accept();*/
		
	}
}
