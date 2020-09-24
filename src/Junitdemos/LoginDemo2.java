package Junitdemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemo2 {

    @Test
    public void mytest(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        // now lets type into the textbox ----> use sendKeys("text")
        txtUsername.sendKeys("admin1");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnSubmit = driver.findElement(By.name("submit"));
        btnSubmit.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      /*  String expected = "http://stock.scriptinglogic.net/dashboard.php";

        String actual = driver.getCurrentUrl();

        Assert.assertEquals("actual url is different",expected,actual);*/

        /*String expected = "POSNIC - Dashboard1";
        String atual =  driver.getTitle();

        Assert.assertEquals("it is the different page title",expected,atual);*/


        String expected = "Dashboard";

       // for actual result find the web element of the Dashboard & using getText() method grab the text out of it
        String actual ="";
        try {

             actual =
                    driver.findElement(By.xpath("//ul[@id='tabs']//a[contains(@class,'dashboard-tab')]")).getText();
        }
        catch (Exception e)
        {
            actual="";
            System.out.println("unable to find dashboard element");
        }

        Assert.assertEquals("Dashboard text is absent",expected,actual);

    }
}
