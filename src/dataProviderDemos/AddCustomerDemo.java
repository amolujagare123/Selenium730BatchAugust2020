package dataProviderDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddCustomerDemo {
    WebDriver driver;

    @BeforeClass
    public void myMethod()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername =  driver.findElement(By.id("login-username"));
        // now lets type into the textbox ----> use sendKeys("text")
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnSubmit = driver.findElement(By.name("submit"));
        btnSubmit.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }



    @Test (dataProvider = "getData")
    public void addCustomertest(String name,String address ,String contact1,String contact2)
    {

        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(name);

        WebElement txtAddress =  driver.findElement(By.name("address"));
        txtAddress.sendKeys(address);

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys(contact1);

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys(contact2);


        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();
    }

    @DataProvider
    public Object[][] getData() throws IOException {

        FileInputStream fp= new FileInputStream("Data\\anotherFile.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fp);

        XSSFSheet sheet = workbook.getSheet("Sheet4");

        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][4];

        for(int i=0;i<rowCount;i++)
        {
            XSSFRow row = sheet.getRow(i);

            for(int j=0;j<4;j++) {
                XSSFCell element = row.getCell(j);
                data[i][j] = element.toString().trim();
            }

        }

        return data;
    }

}
