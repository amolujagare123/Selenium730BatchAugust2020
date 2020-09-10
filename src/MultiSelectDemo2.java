import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement multiSelectLocation = driver.findElement(By.id("source_118"));

        Thread.sleep(3000);

        Select selLocation = new Select(multiSelectLocation);

        selLocation.selectByVisibleText("Mumbai");
        selLocation.selectByVisibleText("Delhi");
        selLocation.selectByVisibleText("Bangalore");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement listAddedlocation =  driver.findElement(By.id("fld_118"));
        Select seladdedlocation = new Select(listAddedlocation);

        seladdedlocation.selectByVisibleText("Mumbai");
        seladdedlocation.selectByVisibleText("Delhi");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();





    }

}


