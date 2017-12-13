import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups="groupw3")
public class TestClassWthree {

    @Test
    void classTwoMethodOne(){
        System.out.println("Inside TestClassWthree : method test one");
    }
    @Test
    void classTwoMethodTwo(){
        System.out.println("Inside TestClassWthree : method test two");
    }
    @BeforeMethod
    void classTwoBeforeMethod(){
        System.out.println("Inside TestClassWthree : Before test method");
    }
}
