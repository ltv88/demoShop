package Tests;

import Pages.AccountPage;
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

        header.openLoginPage()

                .login(email, pass)

                .getSlogan().shouldHave(Condition.text("Hallo serge"));

        new AccountPage().logout().isHomePage();
    }

    @Test(dataProvider = "loginTestFails", dataProviderClass = Params.class)
    public void loginFails(String email, String pass) {

        header.openLoginPage().login(email, pass);

        Assert.assertEquals(new LoginPage().isErrorTextVisible(), true);
    }

    @Test(dataProvider = "errorEmail", dataProviderClass = Params.class)
    public void loginValidEmail(String email, String pass){
        header.openLoginPage().login(email, pass);

        Assert.assertEquals(new LoginPage().isEmailErrTextVisible(), true);
    }

    @Test(dataProvider = "errorPass", dataProviderClass = Params.class)
    public void loginValidPass(String email, String pass){
        header.openLoginPage().login(email, pass);

        Assert.assertEquals(new LoginPage().isPassErrTextVisible(), true);
    }

    @Test(dataProvider = "loginValid", dataProviderClass = Params.class)
    public void loginValid(String email, String pass){
        header.openLoginPage().login(email, pass);

        Assert.assertEquals(new LoginPage().isEmailErrTextVisible(), true);
        Assert.assertEquals(new LoginPage().isPassErrTextVisible(), true);
        Assert.assertEquals(new LoginPage().isErrorTextVisible(), true);

    }


}
