package TestNGDemo.SuiteDemoListners.suiteDemo;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");

        String expected = "string1";
        String actual = "string2";

        Assert.assertEquals(actual,expected,"strings are not equal");

    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }


    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");


    }
}
