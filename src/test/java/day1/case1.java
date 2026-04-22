package day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement searchele1 = driver.findElement(By.xpath("//input[@class='gsc-input']"));
        searchele1.sendKeys("seleniumjava");
        searchele1.submit();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
