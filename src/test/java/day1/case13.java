package day1;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class case13 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		WebElement comp = driver.findElement(By.xpath("//input[@name='firstname']"));
		comp.sendKeys("Arun");
		act.sendKeys(Keys.TAB).sendKeys("shankar")
		.sendKeys(Keys.TAB).sendKeys("arun@gmail.com").sendKeys(Keys.TAB).build().perform();		
		
		
	}
}
