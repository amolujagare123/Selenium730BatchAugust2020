import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        // how to open a browser

       System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        /*System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/

        driver.manage().window().maximize();

        driver.get("http://scriptinglogic.com");

        /*System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());*/

        Thread.sleep(5000);

        driver.navigate().to("http://facebook.com");

        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        Thread.sleep(5000);

        driver.navigate().refresh();


    }

}
