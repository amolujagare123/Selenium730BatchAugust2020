package TestNGDemo.suiteDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
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

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }

}
