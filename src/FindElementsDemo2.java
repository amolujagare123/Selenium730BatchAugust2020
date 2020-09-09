import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsDemo2 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://scriptinglogic.org/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    List<WebElement> buttonList = driver.findElements(By.className("elementor-button-content-wrapper"));

        System.out.println("There are total "+buttonList.size()+" buttons");

        // how to click on the button number 3

        //buttonList.get(0); //-> 1st button
       // buttonList.get(1); //-> 2nd button
      //  buttonList.get(2).click(); //-> 3rd button

        for(int i=0;i<buttonList.size();i++)
        {
            System.out.println(buttonList.get(i).getText());
        }

    }


}
