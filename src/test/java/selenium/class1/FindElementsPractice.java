package selenium.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FindElementsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://stg.mimir.tv/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("input-18")).sendKeys("abdullah@craftsmenltd.com");
        Thread.sleep(1000);
        driver.findElement(By.id("input-21")).sendKeys("Munna12345@#");
        Thread.sleep(1000);
        driver.findElement(By.className("v-btn__content")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
