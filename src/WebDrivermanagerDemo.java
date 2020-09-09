import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDrivermanagerDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       /* WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
*/
/*
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();*/

      //  for edge browser

        /*WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();*/

        driver.get("http://demo.guru99.com/v4");

    }
}
