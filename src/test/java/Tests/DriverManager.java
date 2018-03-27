package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.navigator;

/**
 * Created by 88lit on 3/1/2018.
 */
public class DriverManager {

    @BeforeMethod
    public void getDriver() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();

        Configuration.browser = "chrome";
        navigator.open("https://www.fashionette.de");
    }

    @AfterClass
    public void closeDriver() {
        WebDriverRunner.closeWebDriver();
    }
}
