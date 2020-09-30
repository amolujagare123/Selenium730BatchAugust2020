package TestNGDemo.suiteDemo;

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

    @Test (groups = "email")
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }
    @Parameters({"url","os"})
    @Test
    public void classTwoTest3(String myUrl,String myOs)
    {
        System.out.println("classTwoTest3");

        String url = myUrl;

        System.out.println("Opening:"+url);
        System.out.println("Operating System:"+myOs);
    }
}
