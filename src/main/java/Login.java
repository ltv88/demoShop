import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.*;


/**
 * Created by 88lit on 3/1/2018.
 */
public class Login extends Main {

    public Login() {
    }

    private SelenideElement logo = $("a.header__logo:nth-child(1) > img.logo-claim");
    private SelenideElement xButtonText = $x("//*[text()='Zurück']");
    private SelenideElement xButton = $(".box__close [class*='icon--cross-big-red']");
    private SelenideElement loginTitle = $(By.xpath("//*[text()='Login']"));
    private SelenideElement eMailTitle = $(By.xpath("//label[@for='email']"));
    private SelenideElement eMailField = $(By.xpath("//input[@name='email']"));
    private SelenideElement passTitle = $("label[for='login__password']");
    private SelenideElement passField = $(By.xpath("//input[@name='password']"));
    private SelenideElement submitBtn = $x("//div[@class='btn__bottom'][@style=\"\"]");
    private SelenideElement forgotPass = $(By.cssSelector("a[class=\"forgot-password-toggle\"]"));
    //button[@type='submit'][contains(text(),'Einloggen')]

    public void login(String email, String pass) {
        eMailField.clear();
        eMailField.setValue(email);

        passField.clear();
        passField.setValue(pass);
        eMailField.shouldHave(Condition.attribute("aria-invalid", "false"));
        passField.shouldHave(Condition.attribute("aria-invalid", "false"));
        passField.pressEnter();
    }
}
