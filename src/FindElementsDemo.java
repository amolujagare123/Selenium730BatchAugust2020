import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElementsDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername =  driver.findElement(By.id("login-username"));
        // now lets type into the textbox ----> use sendKeys("text")
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnSubmit = driver.findElement(By.name("submit"));
        btnSubmit.click();

        //Thread.sleep(9000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
       lnkAddCustomer.click();

       WebElement txtName = driver.findElement(By.name("name"));
       txtName.sendKeys("abhishekAnand");

       WebElement txtAddress =  driver.findElement(By.name("address"));
       txtAddress.sendKeys("this is my address");

       WebElement txtContact1 = driver.findElement(By.name("contact1"));
       txtContact1.sendKeys("78778887");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("78778087");

      //  driver.findElement(By.name("Submit")).click();

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();

    }
}
