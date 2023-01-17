package testPackage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FirstTest extends BaseTest {



    @Test
    public void test(){
      $(By.xpath("//input[@placeholder='Username']")).append("standard_user");
      $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");
      $(By.xpath("//input[@type='submit']")).click();
//      $(By.xpath("xpath")).doubleClick();

//        $(By.xpath("//input[@placeholder='Username']")).clear();
//        Selenide.sleep(3000);
//        $(By.xpath("//input[@placeholder='Password']")).clear();
//        Selenide.sleep(3000);

//       $(By.xpath("//input[@id = 'twotabsearchtextbox' ]")).append("Java");
//       Selenide.actions().sendKeys(Keys.ENTER).perform();
       Selenide.sleep(1000);
//        $(By.xpath("//select[@class = 'product_sort_container']")).click();
//        Selenide.actions().sendKeys(Keys.ESCAPE).perform();
//        Selenide.actions().keyDown($(By.xpath("xpath_from_element")),Keys.SHIFT).perform();
//        Selenide.actions().keyUp($(By.xpath("To_element_target")),Keys.SHIFT).perform();
//        Selenide.actions().dragAndDrop($(By.xpath("source_element")),$(By.xpath("target_element")));
//        Selenide.actions().dragAndDropBy($(By.xpath("element")),200,0);

//        $(By.xpath("//nav[@class='nav-menu']//div[contains(@class, 'nav-menu-has-children')]")).hover();

//        System.out.println($(By.xpath("(//div[@class='inventory_item_name'])[1]")).text());

//        for(String text : $$(By.xpath("//div[@class='inventory_item_name']")).texts()){
//            System.out.println(text);
//        }

          ElementsCollection elements = $$(By.xpath("//div[@class='inventory_item_name']"));
        for (SelenideElement element : elements) {
            System.out.println(element);
        }
//
//        Selenide.sleep(1000);


    }


}
