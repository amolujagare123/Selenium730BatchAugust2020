package Junitdemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {
    WebDriver driver;

    @Before // the method below this annotation runs before every test
    public void myMethod1()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After// the method below this annotation runs after every test
    public void myMethod2()
    {
        driver.close();
    }

    @Test
    public void openFacebook()
    {
        driver.get("http://facebook.com");
    }

    @Test
    public void openGmail()
    {
        driver.get("http://gmail.com");
    }

    @Test
    public void openTutorials()
    {
        driver.get("http://scriptinglogic.com");
    }

    @Test
    public void openForums()
    {
        driver.get("http://stackoverflow.com");
    }

}
