package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


/**
 * Created by 88lit on 3/1/2018.
 */
public class LoginPage {

    Header header;

    public LoginPage() {
        this.header = new Header();
    }

    private SelenideElement logo = $("a.header__logo:nth-child(1) > img.logo-claim");
    private SelenideElement xButtonText = $(".box__close span[style=\"\"]");
    private SelenideElement xButton = $(".box__close [class*='icon--cross-big-red']");
    private SelenideElement loginTitle = $x("//*[text()='Pages.LoginPage']");
    private SelenideElement eMailTitle = $(By.xpath("//label[@for='email']"));
    private SelenideElement eMailField = $(By.xpath("//input[@name='email']"));
    private SelenideElement passTitle = $("label[for='login__password']");
    private SelenideElement passField = $(By.xpath("//input[@name='password']"));
    private SelenideElement submitBtn = $("button[data-form-login-submit]");
    private SelenideElement forgotPass = $(By.cssSelector(".forgot-password-toggle"));
    private SelenideElement loginErrText = $(".login__errortext");

    public AccountPage login(String email, String pass) {
        eMailField.clear();
        eMailField.setValue(email);
        passField.clear();
        passField.setValue(pass);
        submitBtn.getWrappedElement().click();

        return new AccountPage();
    }

    public boolean isErrorTextVisible(){
        return loginErrText.exists();
    }

}
