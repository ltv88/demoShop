import com.codeborne.selenide.Condition;
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
public class LoginPageTest {
    @BeforeMethod
    public void getUrl(){
            Configuration.browser="chrome";
            navigator.open("https://www.fashionette.de");
    }

    @Test
    public void loginTest() {
        Header header = new Header();
        String email = "meflt88@gmail.com";
        String pass = "qwe123";
        header.openLoginPage().login(email,pass).getSlogan().shouldHave(Condition.text("Hallo serge"));
    }

    @AfterClass
    public void closeDriver(){
        WebDriverRunner.closeWebDriver();
    }
}
