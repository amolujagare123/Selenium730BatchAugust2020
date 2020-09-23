package TestNGDemo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroupsDemo {

    @BeforeGroups("security")
    public void setUpSecurityBefore() {
        System.out.println("setUpSecurityBefore()");
    }

    @AfterGroups("security")
    public void tearDownSecurityAfter() {
        System.out.println("tearDownSecurityAfter()\n");
    }

    @BeforeGroups("database")
    public void setUpDatabaseBefore() {
        System.out.println("setUpDatabaseBefore()");
    }

    @AfterGroups("database")
    public void tearDownDatabaseAfter() {
        System.out.println("tearDownDatabaseAfter()\n");
    }

    @BeforeGroups("ui")
    public void setUpUIBefore() {
        System.out.println("setUpUIBefore()");
    }

    @AfterGroups("ui")
    public void tearDownUIAfter() {
        System.out.println("tearDownUIAfter()\n");
    }

    @Test(groups= "database")
    public void testInsert(){
        System.out.println("testInsert()");
    }

    @Test(groups= "database")
    public void testUpdate(){
        System.out.println("testUpdate()");
    }

    @Test(groups= "database")
    public void testDelete(){
        System.out.println("testDelete()");
    }

    @Test(groups= "security")
    public void accessHomePage() {
        System.out.println("accessHomePage()");
    }

    @Test(groups= "security")
    public void accessAdminPage() {
        System.out.println("accessAdminPage()");
    }

    @Test(groups= "ui")
    public void openConfirmationDialog() {
        System.out.println("openConfirmationDialog()");
    }

    @Test(groups= "ui")
    public void openFileDialog() {
        System.out.println("openFileDialog()");
    }
}
