package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static ExtentReportsDemo.util.Myscreenshot.takescreenshot;

public class Logintest {

    ExtentReports extent;

    @BeforeClass
    public void init()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("My company project");
        reporter.config().setReportName("All regression tests");

        extent.setSystemInfo("Developers name","Abhishek Anand");
        extent.setSystemInfo("Testers Name","Aparna Nisal");
        extent.setSystemInfo("Project due date","12 dec 2020");
        extent.setSystemInfo("Client Name","Scripting Logic");
    }



    @Test
    public void myloginTest001()
    {
       ExtentTest test = extent.createTest("myloginTest001");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("browser is maximized");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String expected = "http://stock.scriptinglogic.net/dashboard.php";

        String actual = driver.getCurrentUrl();

        try{
            Assert.assertEquals(actual,expected,"actual url is different");
            test.pass("test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
        }

        extent.flush();
    }

    @Test
    public void myloginTest002() throws IOException {
        ExtentTest test = extent.createTest("myloginTest002");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("browser is maximized");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String expected = "http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";

        String actual = driver.getCurrentUrl();

        try{
            Assert.assertEquals(actual,expected,"actual url is different");
            test.pass("test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }


        extent.flush();
    }

    @Test
    public void myloginTest003()
    {
        ExtentTest test = extent.createTest("myloginTest003");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("browser is opened");

        driver.manage().window().maximize();

        test.info("browser is maximized");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        test.info("login button is clicked");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String expected = "http://stock.scriptinglogic.net/";

        String actual = driver.getCurrentUrl();

        try{
            Assert.assertEquals(actual,expected,"actual url is different");
            test.pass("test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
        }

        extent.flush();
    }
}
