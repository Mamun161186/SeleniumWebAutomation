package selenium.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new FirefoxDriver();
        driver.get("https://www.selenium.dev/downloads/"); //to open the browser
        driver.manage().window().maximize(); //maximize the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //max time to find an element
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(5000);//view the page for 5sec
        driver.quit();//to close the browser
    }
}
