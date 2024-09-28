package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.List;

import static java.lang.Thread.*;

public class Selectors2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://parabank.parasoft.com ");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        String text = driver.findElement(By.className("caption")).getText().trim();//trim will cut down the spaces from start and end of a sentence
        System.out.println(text);

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("hello"); //to create a cssSelector-> tagName[attribute='value']
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2441139");//to create a xpath-> //tagName[@attribute='value']
        Thread.sleep(1000);
        //driver.findElement(By.className("form .button")).click(); //form tag

        WebElement w = driver.findElement(By.cssSelector("input.button"));
        System.out.println(w.getCssValue("background-color"));
        System.out.println(w.getCssValue("height"));
        System.out.println(w.getCssValue("border"));
        System.out.println(w.getCssValue("color"));
        System.out.println(w.getCssValue("text-transform"));

        driver.findElement(By.cssSelector("input.button")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Log Out")).click();
        Thread.sleep(1000);

        boolean b = driver.findElement(By.linkText("Register")).isDisplayed();//is the element present?
        System.out.println(b);
        Thread.sleep(1000);

        int i = driver.findElements(By.partialLinkText("login info")).size();//is the element present?
        System.out.println(i);
        Thread.sleep(1000);


        Thread.sleep(2000);
        driver.close();//close the current window
    }
}
