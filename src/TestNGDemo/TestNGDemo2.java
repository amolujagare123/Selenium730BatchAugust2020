package TestNGDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 {

    WebDriver driver;

      @BeforeMethod
      public void myMethod1()
      {
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.manage().window().maximize();
      }

      @AfterMethod
      public void myMethod()
      {
          driver.close();
      }



    @Test//(priority = 4)
    public void facebookSite()
    {

        driver.get("http://facebook.com");

    }


    @Test //(priority = 1)
    public void stackOverflowsite()
    {

        driver.get("http://stackoverflow.com");

    }

    @Test //(priority = 3)
    public void gmailSite()
    {

        driver.get("http://gmail.com");

    }

    @Test //(priority = 2)
    public void scriptinglogicSite()
    {

        driver.get("http://scriptinglogic.com");

    }
}
