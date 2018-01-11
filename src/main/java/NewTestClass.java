import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTestClass {

    final static Logger logger = Logger.getLogger(NewTestClass.class);

    @BeforeMethod(groups = {"reg"})
    public void method1(){
        System.out.println("Hello class new - method1 : Before method ");
    }

    @Test(groups = {"reg"})
    public void method2(){
        System.out.println("hello class new - method 2 - test method");
        if(logger.isDebugEnabled()){
            logger.debug("This is a debug message........");
            logger.debug("Debugging group=reg, testmethod2...");
        }
    }

    @Test
    public void method3(){
        System.out.println("hello class new - method 3 - test method");
    }

    @Test
    public void method4(){
        System.out.println("hello class new - method 4 - test method");
    }

    @BeforeSuite(groups = {"reg"})
    public void methodBeforeSuit(){
        System.out.println("hello class new - method methodBeforeSuit - before suit");
    }


}
