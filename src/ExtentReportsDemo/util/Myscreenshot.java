package ExtentReportsDemo.util;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Myscreenshot {

    public static String takescreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File scrFil = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss").format(new Date());

        String fileName = "screenshot"+timeStamp+".png";

        FileUtils.copyFile(scrFil,new File("Reports\\screenshots\\"+fileName));

        return  fileName;
    }
}
