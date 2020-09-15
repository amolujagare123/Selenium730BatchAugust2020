import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenClinicDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");

// edit icon of Fabina --

        String user = "Chantal";

        WebElement editIcon = driver.findElement(By.xpath("//tr[td[text()='"+user+"']]//img[@title='edit']"));

        editIcon.click();
    }
}
