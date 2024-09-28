package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.List;

import static java.lang.Thread.*;

public class Selectors {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://parabank.parasoft.com ");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        String text = driver.findElement(By.className("caption")).getText().trim();//trim will cut down the spaces from start and end of a sentence
        System.out.println(text);

        driver.findElement(By.name("username")).sendKeys("hello");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("2441139");
        Thread.sleep(1000);
        //driver.findElement(By.className("form .button")).click(); //form tag
        driver.findElement(By.cssSelector("input.button")).click();
        Thread.sleep(1000);


        driver.findElement(By.linkText("Log Out")).click();
        Thread.sleep(1000);

       driver.findElement(By.linkText("Register")).click();
       Thread.sleep(1000);
       driver.findElement(By.partialLinkText("login info")).click();
       Thread.sleep(1000);

       List<WebElement> elements = driver.findElements(By.tagName("a")); //how many links are present. a for anchor tag
        for(WebElement x : elements){
            System.out.println(x.getAttribute("href"));// this method will get the value from mentioned attribute
        }
        Thread.sleep(1000);

/*       List<WebElement> elementss = driver.findElements(By.tagName("div")); //how many links are present. a for anchor tag
        for(WebElement xs : elementss){
            System.out.println(xs.getAttribute("class"));// this method will get the value from mentioned attribute
        }
        Thread.sleep(1000);*/

        Thread.sleep(5000);
        //driver.quit();//close all window
        driver.close();//close the current window
    }
}
