import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");

        WebElement multiSel =  driver.findElement(By.id("multiSel"));

        Select selMultiSel = new Select(multiSel);

        selMultiSel.selectByVisibleText("text 1");
        selMultiSel.selectByVisibleText("text 2");
        selMultiSel.selectByVisibleText("text 3");
        selMultiSel.selectByVisibleText("text 4");

        Thread.sleep(4000);

      /*  selMultiSel.deselectByVisibleText("text 2");
        selMultiSel.deselectByVisibleText("text 3");*/

        selMultiSel.deselectAll();
    }
}
