package Tests;

import Pages.BasePage;
import Pages.HomePage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.navigator;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by 88lit on 3/1/2018.
 */
public class BaseTest {

    public Selenide selenide;

    public BaseTest() {
        this.selenide = open();
    }

    @BeforeMethod
    public void getDriver() {
        Configuration.browser = "chrome";
    }

    @AfterClass
    public void closeDriver() {
        WebDriverRunner.closeWebDriver();
    }

}
