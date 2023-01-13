package org.base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeClass(alwaysRun = true, description = "Creating configs for out tests")
    public void configuration(){
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
        // Configuration.browserSize = "1368*768";
        Configuration.screenshots = true;
        Configuration.headless = false;
        Configuration.pageLoadStrategy = "normal";
        Configuration.pageLoadTimeout = 20000;
        Configuration.timeout = 10000;
        // Configuration.reportsFolder = "screenshots";
    }

    @BeforeMethod(alwaysRun = true, description = "Opening base url")
    public void setUp(){
        Selenide.open("https://www.saucedemo.com/");

    }

    @AfterMethod(alwaysRun = true, description = "WebDriver Clean Up")
    public void cleanWebDriver(){
        Selenide.clearBrowserCookies();
        Selenide.refresh();

    }

    @AfterSuite(alwaysRun = true, description = "Closing WEB Browser")
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
