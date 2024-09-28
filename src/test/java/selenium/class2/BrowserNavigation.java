package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(2000);

        driver.navigate().to("https://parabank.parasoft.com");
        Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys("hello");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("2441139");
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();


        Thread.sleep(2000);
        driver.quit();


    }
}
