import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups="grouptwo" )
public class TestClassTwo {

    @Test(groups = "reg")
    public void classTwoMethodOne(){
        System.out.println("Inside Class Two : method test one");
    }
    @BeforeMethod
    public void classTwoBeforeMethod(){
        System.out.println("Inside Class Two : Before test method");
    }


}
