package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DarkskyAssert {

    @Test
    public void compareTemp()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net/forecast/40.7127,-74.0059/us12/en");

        // 1. lets find the curent (bold) teperature text

        String tempTextRow = driver.findElement(By.xpath("//span[@class='summary swap']")).getText();

        System.out.println(tempTextRow);

        String currTempExpected = tempTextRow.split("˚")[0];
        System.out.println("currTempExpected:"+currTempExpected);

        String timelineTempRow = driver.findElement(By.xpath("//div[@id='timeline']//span[@class='first']/span")).getText();

        System.out.println(timelineTempRow); // 67°

        String timelieTempActual = timelineTempRow.split("°")[0];

        System.out.println("timelieTempactual:"+timelieTempActual);

        Assert.assertEquals(timelieTempActual,currTempExpected,"both temperatures are not equal");



    }
}
