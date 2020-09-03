import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        // how to open a browser

        /*System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        */

        System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://gmail.com");

    }

}
