package dataProviderDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegistrationDemo {

    @Test (dataProvider = "getData")
    public void myLoginTest(String name,String email,String contact,String city) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://scriptinglogic.org/request-call-demo-class-online/");
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@placeholder='Contact no./ Whatsapp No.']")).sendKeys(contact);
        driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys(city);

    }


    @DataProvider
    public Object[][] getData()
    {
        Object[][] data =
                {
                        { "name1","email1","contactno1","city1"},
                        { "name2","email2","contactno2","city2"},
                        { "name3","email3","contactno3","city3"},
                        { "name4","email4","contactno4","city4"}

                };

        return data;
    }

}