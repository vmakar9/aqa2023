package testPackage.waitTest;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WaitTest extends BaseTest {
    @Test
    public void testMethod(){
        $(By.xpath("//input[@placeholder='Username']")).shouldBe(Condition.exist).append("standard_user");
//        $(By.xpath("//input[@placeholder='Username']")).shouldBe(Condition.visible).append("standard_user");
//        $(By.xpath("//input[@placeholder='Username']")).shouldBe(Condition.hidden).append("standard_user");
//        $(By.xpath("//input[@placeholder='Username']")).shouldHave(Condition.value("")).append("standard_user");
//        $(By.xpath("//input[@placeholder='Username']")).shouldHave(Condition.type("text")).append("standard_user");
//        $(By.xpath("//input[@placeholder='Username']")).shouldHave(Condition.name("user-name")).append("standard_user");
//        $(By.xpath("//input[@placeholder='Username']")).shouldHave(Condition.cssClass("input_error")).append("standard_user");
        $(By.xpath("//input[@placeholder='Password']")).should(Condition.visible, Duration.ofMillis(1000)).append("secret_sauce");
//        $(By.xpath("//input[@placeholder='Password']")).shouldHave(Condition.cssClass("login")).append("secret_sauce");
        $(By.xpath("//input[@type='submit']")).shouldBe(Condition.enabled).click();
//        $(By.xpath("//span[text()='Products']")).waitUntil(Condition.visible,3000);
//        $(By.xpath("//div[@class='inventory_item_name']")).shouldHave(Condition.text("backpack")).click();
//        $(By.xpath("//div[@class='inventory_item_name']")).shouldHave(Condition.textCaseSensitive("Backpack")).click();
//        $(By.xpath("//div[@class='inventory_item_name']")).shouldHave(Condition.exactText("Sauce Labs Backpack")).click();
//        $$(By.xpath("//div[@class='inventory_item_name']")).shouldBe(CollectionCondition.empty);
//        $$(By.xpath("//div[@class='inventory_item_name']")).shouldHave(CollectionCondition.size(6));
//        $$(By.xpath("//div[@class='inventory_item_name']")).shouldHave(CollectionCondition.sizeGreaterThan(5));
//        $$(By.xpath("//div[@class='inventory_item_name']")).shouldHave(CollectionCondition.sizeGreaterThanOrEqual(6));
//        $$(By.xpath("//div[@class='inventory_item_name']")).shouldHave(CollectionCondition.sizeLessThan(7));
//        $$(By.xpath("//div[@class='inventory_item_name']")).shouldHave(CollectionCondition.sizeLessThanOrEqual(6));
//        $$(By.xpath("//div[@class='inventory_item_name']")).shouldHave(CollectionCondition.sizeNotEqual(1));

//         Assert.assertTrue($(By.xpath("//input[@placeholder='Username']")).is(Condition.type("text")));
        String actualResult = $(By.xpath("//div[@class='inventory_item_name']")).text();
        String expectedResult = "Sauce Labs Backpac";
//        Assert.assertEquals(actualResult,expectedResult,"Values mismatch");
//        Assert.assertNotEquals(actualResult,expectedResult,"Values mismatch");
        Selenide.sleep(2000);

//        String text = $(By.xpath("//span[text()='Products']")).shouldBe(Condition.readonly).text();
//        System.out.println(text);


    }
}
