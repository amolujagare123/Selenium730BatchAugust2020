package TestNGDemo.suiteDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

   /* @BeforeTest
    public void mymethod1()
    {
        System.out.println("@BeforeTest - mymethod1");
    }


    @AfterTest
    public void mymethod2()
    {
        System.out.println("@AfterTest - mymethod2");
    }*/

    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Test (groups = "email") // (enabled=false)
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Parameters({"url","os"})
    @Test
    public void classOneTest3(String myUrl,String myOs)
    {
        System.out.println("classOneTest3");

        String url = myUrl;

        System.out.println("Opening:"+url);
        System.out.println("Operating System:"+myOs);

    }


}
