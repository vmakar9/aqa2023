package org.pages.loginpage;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends PageTools {

    private final By enterBtn = By.xpath("//input[@type='submit']");
   public void typeLoginInput(String login){
        $(By.xpath("//input[@placeholder='Username']")).shouldBe(Condition.visible).append(login);
    }

    public void typePasswordInput(String password){
        $(By.xpath("//input[@placeholder='Password']")).shouldBe(Condition.visible).append(password);
    }

    public void clickEnterButton(){
       click(enterBtn);
    }
}
