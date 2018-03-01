import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by 88lit on 2/28/2018.
 */
public class LoginTest extends BeforeTest {
    //    @BeforeMethod
//    public void getUrl(){
//        driver.get("https://www.fashionette.de/login");
//    }

    @Test
    public void loginTest() {
        String email = "asdasd";
        String pass = "asdad";
        new Login(driver).login(email, pass);
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
        driver = null;
    }
}
