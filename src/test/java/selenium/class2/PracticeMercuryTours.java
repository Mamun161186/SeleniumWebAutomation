package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class PracticeMercuryTours {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("Abdullah");
        Thread.sleep(1000);
        driver.findElement(By.name("lastName")).sendKeys("Al Mamun");
        Thread.sleep(1000);
        driver.findElement(By.name("phone")).sendKeys("01859444664");
        Thread.sleep(1000);
        driver.findElement(By.id("userName")).sendKeys("almamun161186@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("address1")).sendKeys("block:A, Aftabnagar");
        Thread.sleep(1000);
        driver.findElement(By.name("city")).sendKeys("Dhaka");
        Thread.sleep(1000);
        driver.findElement(By.name("state")).sendKeys("Dhaka");
        Thread.sleep(1000);
        driver.findElement(By.name("postalCode")).sendKeys("1212");
        Thread.sleep(1000);

        Select c = new Select(driver.findElement(By.name("country")));
        c.selectByValue("BANGLADESH");
        Thread.sleep(1000);

        driver.findElement(By.id("email")).sendKeys("mamun161186");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.name("confirmPassword")).sendKeys("12345");
        Thread.sleep(1000);
        driver.findElement(By.name("submit")).click();






        Thread.sleep(6000);
        driver.quit();
    }
}
