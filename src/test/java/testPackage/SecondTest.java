package testPackage;

import org.testng.annotations.Test;

public class SecondTest {


    @Test(priority = 1)
    public void test2(){
        System.out.println("Second test");
    }
}
