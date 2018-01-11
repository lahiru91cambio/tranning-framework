import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups="groupw3")
public class TestClassWthree {

    @Test(groups = "runGroup01")
    void classTwoMethodOne(){
        System.out.println("Inside TestClassWthree : method test one");
    }
    @Test(groups =  "runGroup02")
    void classTwoMethodTwo(){
        System.out.println("Inside TestClassWthree : method test two");
    }
    @BeforeMethod
    void classTwoBeforeMethod(){
        System.out.println("Inside TestClassWthree : Before test method");
    }
}
