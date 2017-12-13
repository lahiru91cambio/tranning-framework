import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassFour {

        @Test(groups = "runGroup02")
        void classTwoMethodOne(){
            System.out.println("Inside TestClassFour : method test one");
        }
        @Test(groups = "runGroup01")
        void classTwoMethodTwo(){
            System.out.println("Inside TestClassFour : method test two:include :test xml");
        }

    }
