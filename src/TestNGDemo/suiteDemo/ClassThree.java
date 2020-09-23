package TestNGDemo.suiteDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

     @BeforeSuite
    public void mymethod1()
    {
        System.out.println("@BeforeSuite - mymethod1");
    }


    @AfterSuite
    public void mymethod2()
    {
        System.out.println("@AfterSuite - mymethod2");
    }


    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }

    @Test (groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Parameters({"url","os"})
    @Test
    public void classThreeTest3(String myUrl,String myOs)
    {
        System.out.println("classThreeTest3");

        String url = myUrl;

        System.out.println("Opening:"+url);
        System.out.println("Operating System:"+myOs);
    }

}
