package ExtentReportsDemo.WithLisners;

import ExtentReportsDemo.WithLisners.init.BeforeAfter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends BeforeAfter  {


    @Test
    public void openfacebook()  {
        driver.get("https://facebook.com");

    }

    @Test
    public void opentwitter()  {
        driver.get("https://twitter.com");

    }

    @Test
    public void openinstagram()  {
        driver.get("https://instagram.com");

    }
}
