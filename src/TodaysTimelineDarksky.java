import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodaysTimelineDarksky {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://darksky.net/forecast/40.7127,-74.0059/us12/en");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,750)");


        WebElement expander = driver.findElement(By.xpath("//a[@data-day='0']//span[@class='toggle']"));
        expander.click();
    }
}
