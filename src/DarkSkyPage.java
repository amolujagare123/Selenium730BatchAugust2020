import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DarkSkyPage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://darksky.net/forecast/40.7127,-74.0059/us12/en");

        List<WebElement> timeList = driver.findElements(By.xpath("//span[@class='hour']/span"));

        System.out.println(timeList.size()); // 11 is the size

        for(int i=0;i<timeList.size();i++)
        {
            System.out.print(timeList.get(i).getText()+",");
        }

    }
}
