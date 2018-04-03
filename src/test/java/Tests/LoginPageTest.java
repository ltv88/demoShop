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

public class LoginPageTest extends BaseTest {

     Header header = new Header();
     LoginPage loginPage;

    @Test(dataProvider = "loginTestPass", dataProviderClass = Params.class)
    public void loginPassed(String email, String pass) {

        LoginPage login =  new Header().openLoginPage();

        AccountPage accountPage = login.login(email, pass);

        accountPage.getSlogan().shouldHave(Condition.text("Hallo serge"));

        new AccountPage().logout().checkIsOpen();
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

    @DataProvider(name = "emptyFields")
    public static Object[][]emptyFieldsCase(){
        return new Object[][]{
                {"", ""}
        };
    }
    @Test(dataProvider = "emptyFields")
    public void cantLoginWithEmptyFields(String email, String pass){
        LoginPage loginPage = header.openLoginPage();

        loginPage.login(email, pass);

        Assert.assertEquals(new LoginPage().isEmailErrTextVisible(), true);
        Assert.assertEquals(new LoginPage().isPassErrTextVisible(), true);
        Assert.assertEquals(new LoginPage().isErrorTextVisible(), true);

    }


}
