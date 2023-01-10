package testPackage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.testng.annotations.*;

public class FirstTest extends BaseTest {



    @Test
    public void test(){
        Selenide.sleep(5000);
    }


}
