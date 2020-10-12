package dataProviderDemos;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestDataprovider {

    @Test (dataProvider = "getData")
    public void myLoginTest(String username,String password)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys(password);

        WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        btnSubmit.click();
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[4][2];

        data[0][0] ="admin";
        data[0][1] ="admin";


        data[1][0] ="a1";
        data[1][1] ="a1";

        data[2][0] ="xyz";
        data[2][1] ="pqr";

        data[3][0] ="abc";
        data[3][1] ="abcd";

        return data;
    }

}
