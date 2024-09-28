package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");

        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByIndex(2);//we can select value from a dropdown by index/value/visibleText
        Thread.sleep(2000);
        country.selectByValue("CONGO");
        Thread.sleep(2000);
        country.selectByVisibleText("FRANCE");
        Thread.sleep(2000);

        List<WebElement> x = country.getOptions();//listed all the dropdown options
        for (WebElement el: x){
            System.out.println(el.getText().trim());
        }

        Thread.sleep(2000);
        driver.quit();
    }

}
