import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://lifepartner.in");

        WebElement drpMaritialStatus = driver.findElement(By.name("ms"));
        Select selMaritialstatus = new Select(drpMaritialStatus);

        //selMaritialstatus.selectByVisibleText("Never married");
      //  selMaritialstatus.selectByIndex(2);
        selMaritialstatus.selectByValue("7");
    }

}
