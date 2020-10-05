package ExtentReportsDemo.WithLisners.init;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static TestNGDemo.util.ForReports.getExtetObject;
import static TestNGDemo.util.ForReports.takescreenshot;

public class MyListners extends BeforeAfter implements  ITestListener{


    static ExtentReports extent = getExtetObject();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("onTestStart");
        test = extent.createTest(iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("success");
        test.pass(iTestResult.getMethod().getMethodName()+": is passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("failed");
        test.fail(iTestResult.getMethod().getMethodName()+": is failed\t"
        +iTestResult.getThrowable());

        try {
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("skipped");
    }

    /*@Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }*/

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("finish");

        extent.flush();
    }

}
