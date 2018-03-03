import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
/**
 * Created by 88lit on 2/28/2018.
 */
public class LoginTest {
    //    @BeforeMethod
//    public void getUrl(){
//        driver.get("https://www.fashionette.de/login");
//    }

    @Test
    public void loginTest() {

        Configuration.browser="chrome";
        navigator.open("https://www.fashionette.de/login");
        String email = "asdasd";
        String pass = "asdad";
        new Login().login(email, pass);
    }
//
//    @AfterClass
//    public void closeDriver(){
//        driver.quit();
//        driver = null;
//    }
}
