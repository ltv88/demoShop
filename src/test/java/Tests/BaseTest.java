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
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.navigator;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by 88lit on 3/1/2018.
 */
public class BaseTest {

    public BaseTest() {
    }

    @BeforeClass(alwaysRun = true)
    public void getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
        Configuration.browser = "chrome";
    }

    @AfterClass(alwaysRun = true)
    public void closeDriver() {
        WebDriverRunner.closeWebDriver();
    }

}
