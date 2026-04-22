package day1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class case16 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		screenshotcase1("error1", driver);
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		screenshotcase1("error2",driver);
	
	}
	
	public static void screenshotcase1(String filename, WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(System.getProperty("user.dir")+"\\folder1\\"+filename+".png"));
	}
	
}
