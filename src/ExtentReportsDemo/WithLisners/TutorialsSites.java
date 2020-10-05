package ExtentReportsDemo.WithLisners;

import ExtentReportsDemo.WithLisners.init.BeforeAfter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialsSites extends BeforeAfter  {



    @Test
    public void opentutorialspoints()  {

        driver.get("https://tutorialspoint.com");
    }

    @Test
    public void openScriptingLogic()  {

        driver.get("https://scriptinglogic.com");
    }

    @Test
    public void openjavatpointc()  {


        driver.get("https://javatpoint.com");
    }

}
