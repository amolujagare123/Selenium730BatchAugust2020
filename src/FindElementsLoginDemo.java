import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsLoginDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        List<WebElement> inputTags =  driver.findElements(By.tagName("input"));

        System.out.println(inputTags.size());

        inputTags.get(0).sendKeys("admin"); // for username
        inputTags.get(1).sendKeys("admin"); // for password
        inputTags.get(2).click(); // for login button


    }
}
