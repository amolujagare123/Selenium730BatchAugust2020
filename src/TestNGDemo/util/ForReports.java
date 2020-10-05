package TestNGDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForReports {

    public static ExtentReports getExtetObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("My company project");
        reporter.config().setReportName("All regression tests");

        extent.setSystemInfo("Developers name","Abhishek Anand");
        extent.setSystemInfo("Testers Name","Aparna Nisal");
        extent.setSystemInfo("Project due date","12 dec 2020");
        extent.setSystemInfo("Client Name","Scripting Logic");

        return  extent;
    }

    public static String takescreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File scrFil = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss").format(new Date());

        String fileName = "screenshot"+timeStamp+".png";

        FileUtils.copyFile(scrFil,new File("Reports\\screenshots\\"+fileName));

        return  fileName;
    }

    static WebDriver driver;
    
    public  static WebDriver initDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
