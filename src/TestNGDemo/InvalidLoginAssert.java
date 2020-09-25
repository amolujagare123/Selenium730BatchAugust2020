package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InvalidLoginAssert {

    @Test
    public void loginTest()
    {
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



        String expected = "Wrong Username or Password1";
        String actual ="";

        try {
             actual =
                    driver.findElement(By.xpath("//div[contains(@class,'error-box')]")).getText();
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected,"incorrect error message or errormessage absent");

    }
}
