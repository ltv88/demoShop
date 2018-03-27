package Tests;

import Pages.Header;
import Pages.LoginPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by 88lit on 2/28/2018.
 */

public class LoginPageTest extends DriverManager {
     Header header = new Header();

    @Test(dataProvider = "loginTestPass", dataProviderClass = Params.class)
    public void loginPass(String email, String pass) {
        System.out.println(":> id "+Thread.currentThread().getId());
        header.openLoginPage()

                .login(email, pass)

                .getSlogan().shouldHave(Condition.text("Hallo serge"));
    }

    @Test(dataProvider = "loginTestFails", dataProviderClass = Params.class)
    public void loginFails(String email, String pass) {
        System.out.println(":> id "+Thread.currentThread().getId());
        header.openLoginPage().login(email, pass);

        Assert.assertEquals(new LoginPage().isErrorTextVisible(), true);

    }

    @Test
    public void loginValidation(){

    }

}
