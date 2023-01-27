package org.base;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageTools extends CustomLogger {
    private static String getPreviousMethodAsText(){
       String methodName =  Thread.currentThread().getStackTrace()[3].getMethodName();
        String replacedName = methodName.replaceAll(
                String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",
                        "(?<=[^A-Z])(?=[A-Z])",
                        "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " ");
        return  replacedName.substring(0,1).toUpperCase() + replacedName.substring(1).toLowerCase();
    }
    public By byLocator (By by, Object... args){
        return LocatorParse.parseLocator(by,args);
    }

    protected SelenideElement getSelenideElement(By by, Object ...args){
        return $(byLocator(by,args));
    }
    protected Actions getActions(){
        return Selenide.actions();
    }

    protected SelenideElement shouldBe(Condition condition,By by, Object ...args){
        return $(byLocator(by,args)).shouldBe(condition);
    }
    protected ElementsCollection shouldBe(CollectionCondition collectionCondition, By by , Object... args){
        return $$(byLocator(by , args)).shouldBe(collectionCondition);
    }
    protected SelenideElement shouldHave(Condition condition,By by, Object ...args){
        return $(byLocator(by,args)).shouldHave(condition);
    }
    protected ElementsCollection shouldHave(CollectionCondition collectionCondition, By by , Object... args){
        return $$(byLocator(by , args)).shouldHave(collectionCondition);
    }

    protected void click(By by, Object ...args){
        logInfo(getPreviousMethodAsText()  + " ',element ->  "+byLocator(by,args));
        shouldBe(Condition.visible, by, args).click();
    }


}
