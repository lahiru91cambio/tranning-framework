import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestClass {


    @BeforeClass
    public void methodOne() {
        System.out.println("Inside method one:BeforeClass");
    }

    @AfterClass
    public void methodTwo() {
        System.out.println("Inside method two:AfterClass");
    }

    @BeforeTest
    public void setproperty(){
        System.out.println("Inside setProperty method:@before Test");
    }


    @Test(priority = 0,groups="group1")
    public void testMethod1(){
        System.out.println("Inside test method:Test priority 0, group 1");
    }

    @Test(priority = 1,groups="group1")
    public void testMethod2() {
        System.out.println("Inside test method 2:Test priority 1, group 2");
    }

    @Test(groups = "group2")
    public void group2testMethod1(){
        System.out.println("Inside Group 2: group2testMethod1 ");
    }

    @Test(groups = "group2")
    public void group2testMethod12() {
        System.out.println("Inside Group 2: group2testMethod2");
    }

    @BeforeMethod
    public void beforeTest(){
        System.out.println("Executes before the test method : BeforeTest");
    }
    @AfterTest(dependsOnGroups = {"group1","group2"})
    public void afterTestMethod(){
        System.out.println("Depend on Methods method : After test: Depend on group 1 and 2");
    }




}
