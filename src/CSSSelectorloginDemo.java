import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorloginDemo {


        public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("http://stock.scriptinglogic.net/");

            WebElement txtUsername = driver.findElement(By.cssSelector("input[name='username']"));
            txtUsername.sendKeys("admin");

            WebElement txtPassword = driver.findElement(By.cssSelector("input#login-password"));
            txtPassword.sendKeys("admin");

            WebElement btnSubmit = driver.findElement(By.cssSelector("input[type='submit']"));
            btnSubmit.click();

        }

}
