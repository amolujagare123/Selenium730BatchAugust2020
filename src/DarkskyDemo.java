import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DarkskyDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://darksky.net/forecast/40.7127,-74.0059/us12/en");

        List<WebElement> timeList = driver.findElements(By.className("hour"));

        System.out.println(timeList.size());

        for(int i=0;i<timeList.size();i++)
        {
            System.out.println(timeList.get(i).getText());
        }

    }
}
