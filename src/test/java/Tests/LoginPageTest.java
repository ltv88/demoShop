package Tests;

import Pages.AccountPage;
import Pages.Header;
import Pages.HomePage;
import Pages.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by 88lit on 2/28/2018.
 */

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Parameters({"email", "password"})
    @Test
    public void loginPassed(String email, String pass) {
        loginPage.open();
        loginPage.checkIsOpen();
        loginPage.login(email, pass);

        new AccountPage().getSlogan().shouldHave(Condition.text("Hallo serge"));

        new AccountPage().logout().checkIsOpen();
    }

    @Parameters({"badEmail", "badPassword"})
    @Test
    public void loginFails(String email, String pass) {
        loginPage.open();

        loginPage.login(email, pass);

        Assert.assertTrue(new LoginPage().isErrorTextVisible());
    }

    @DataProvider(name = "loginValidation")
    public static Object[][] loginValidationCase() {
        return new Object[][]{
                {"", "qwe123"},
                {"meflt88gmail.com","qwe123"}
        };
    }
    @Test(dataProvider = "loginValidation")
    public void loginValidEmail (String email, String pass){
        loginPage.open();

        loginPage.login(email, pass);

        Assert.assertTrue(new LoginPage().isEmailErrTextVisible());
    }

    @DataProvider(name = "passwordValidation")
    public static Object[][] passwordValidationCase() {
        return new Object[][]{
                {"meflt88@gmail.com", ""},
                {"meflt88@gmail.com","qwe"}
        };
    }
    @Test(dataProvider = "passwordValidation")
    public void loginValidPass(String email, String pass){
        loginPage.open();

        loginPage.login(email, pass);

        Assert.assertTrue(new LoginPage().isPassErrTextVisible());
    }

    @Parameters({"emptyEmail", "emptyPassword"})
    @Test
    public void cantLoginWithEmptyFields(String email, String pass){
        loginPage.open();

        loginPage.login(email, pass);

        Assert.assertEquals(new LoginPage().isEmailErrTextVisible(), true);
        Assert.assertEquals(new LoginPage().isPassErrTextVisible(), true);
        Assert.assertEquals(new LoginPage().isErrorTextVisible(), true);

    }


}
