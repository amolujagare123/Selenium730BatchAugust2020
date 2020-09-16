import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sandesh {

    @Test
    public void printtext()
    {

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/test/");

        List<WebElement> textList = driver.findElements(By.xpath("//ul[@id='treemenu']//li/a"));

        System.out.println(textList.size()); // 11 is the size

        for(int i=0;i<textList.size();i++)
        {
            System.out.println(textList.get(i).getText());
        }
    }

}
