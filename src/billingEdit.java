import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class billingEdit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://billing.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@type='email']"));
        // now lets type into the textbox ----> use sendKeys("text")
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();

        String clientName="A1QW Pvt Ltd";

        driver.findElement(By.xpath("//span[contains(text(),'Clients')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'View Clients')]")).click();

        driver.findElement(By.xpath("//tr[td/a[text()='"+clientName+"']]//div[contains(@class,'btn-group')]")).click();

        driver.findElement(By.xpath("//tr[td/a[text()='"+clientName+"']]//i[contains(@class,'edit')]")).click();

    }
}
