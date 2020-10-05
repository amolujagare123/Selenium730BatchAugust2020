package ExtentReportsDemo.WithLisners.init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BeforeAfter {

    public static WebDriver driver;

    @BeforeClass
    public  void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
