package ExtentReportsDemo.WithLisners;

import ExtentReportsDemo.WithLisners.init.BeforeAfter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForumSites extends BeforeAfter{


    @Test
    public void openstackoverflow()  {
        driver.get("https://stackoverflow.com");
        String expected="s1";
        String actual="s2";
        Assert.assertEquals(actual,expected,"Strings are not equal");

    }

    @Test
    public void opensqaforums()  {
        driver.get("https://sqaforums.com/");
    }

    @Test
    public void openquora()  {
        driver.get("https://quora.com");
    }
}
