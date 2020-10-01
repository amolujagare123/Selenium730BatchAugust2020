package TestNGDemo.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements  ITestListener{

    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("failed");
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
    }

}
