package testPackage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest extends BaseTest {



    @Test
    public void test(){
       // $(By.className("submit-button")).click();
       // $(By.id());
        $(By.xpath("//input[@placeholder = 'Username']")).append("standard_user");
      ElementsCollection inventoryList = $$(By.xpath("//div[@class='inventory_list']//child::div[@class='inventory_item']"));
        Selenide.sleep(5000);
    }


}
