package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


/**
 * Created by 88lit on 3/1/2018.
 */
public class LoginPage extends HomePage {

    public LoginPage() {
    }

    private SelenideElement logo = $("a.header__logo:nth-child(1) > img.logo-claim");
    private SelenideElement xButtonText = $(".box__close span[style=\"\"]");
    private SelenideElement xButton = $(".box__close [class*='icon--cross-big-red']");
    private SelenideElement loginTitle = $(By.xpath("//*[text()='Pages.LoginPage']"));
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
        eMailField.shouldHave(Condition.attribute("aria-invalid", "false"));
        passField.shouldHave(Condition.attribute("aria-invalid", "false"));
        submitBtn.getWrappedElement().click();

        return new AccountPage();
    }

    public boolean isErrorTextVisible(){
        return loginErrText.exists();
    }

}
