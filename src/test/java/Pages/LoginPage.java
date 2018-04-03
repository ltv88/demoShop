package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.*;


/**
 * Created by 88lit on 3/1/2018.
 */
public class LoginPage  extends BasePage{

    private SelenideElement eMailField = $(By.xpath("//input[@name='email']"));
    private SelenideElement passwordField = $(By.xpath("//input[@name='password']"));
    private SelenideElement submitBtn = $("button[data-form-login-submit]");
    private SelenideElement loginErrorText = $(".login__errortext");
    private SelenideElement emailErrorText = $("#email-error");
    private SelenideElement passwordErrorText = $("#password-error");

    public LoginPage(Selenide selenide) {
        super(selenide);
        this.url = "https://www.fashionette.de/login";
    }

    @Override
    public void open() {
        Selenide.open(url);
        PageFactory.initElements(WebDriverRunner.getWebDriver(), this);
    }

    public AccountPage login(String email, String pass) {
        eMailField.clear();
        eMailField.setValue(email);
        passwordField.clear();
        passwordField.setValue(pass);
        submitBtn.getWrappedElement().click();

        return new AccountPage(selenide);
    }

    public boolean isEmailErrTextVisible(){
        return emailErrorText.isDisplayed();
    }

    public boolean isPassErrTextVisible(){
        return passwordErrorText.isDisplayed();
    }

    public boolean isErrorTextVisible(){
        return loginErrorText.isDisplayed();
    }

}
