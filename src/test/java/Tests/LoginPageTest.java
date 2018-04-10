package Tests;

import Pages.AccountPage;
import Pages.Header;
import Pages.HomePage;
import Pages.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by 88lit on 2/28/2018.
 */

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "loginTestPass", dataProviderClass = Params.class)
    public void loginPassed(String email, String pass) {
        loginPage.open();
        loginPage.checkIsOpen();
        loginPage.login(email, pass);

        new AccountPage().getSlogan().shouldHave(Condition.text("Hallo serge"));

        new AccountPage().logout().checkIsOpen();
    }

//    @Test(dataProvider = "loginTestFails", dataProviderClass = Params.class)
//    public void loginFails(String email, String pass) {
//
//        header.openLoginPage().login(email, pass);
//
//        Assert.assertEquals(new LoginPage(selenide).isErrorTextVisible(), true);
//    }
//
//    @Test(dataProvider = "errorEmail", dataProviderClass = Params.class)
//    public void loginValidEmail(String email, String pass){
//        header.openLoginPage().login(email, pass);
//
//        Assert.assertEquals(new LoginPage(selenide).isEmailErrTextVisible(), true);
//    }
//
//    @Test(dataProvider = "errorPass", dataProviderClass = Params.class)
//    public void loginValidPass(String email, String pass){
//        header.openLoginPage().login(email, pass);
//
//        Assert.assertEquals(new LoginPage(selenide).isPassErrTextVisible(), true);
//    }
//
//    @DataProvider(name = "emptyFields")
//    public static Object[][]emptyFieldsCase(){
//        return new Object[][]{
//                {"", ""}
//        };
//    }
//    @Test(dataProvider = "emptyFields")
//    public void cantLoginWithEmptyFields(String email, String pass){
//        LoginPage loginPage = header.openLoginPage();
//
//        loginPage.login(email, pass);
//
//        Assert.assertEquals(new LoginPage(selenide).isEmailErrTextVisible(), true);
//        Assert.assertEquals(new LoginPage(selenide).isPassErrTextVisible(), true);
//        Assert.assertEquals(new LoginPage(selenide).isErrorTextVisible(), true);
//
//    }


}
