package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Created by 88lit on 3/1/2018.
 */
public class Header {

    private SelenideElement logo = $("div.header__inner a.header__logo:nth-child(1)");
    private SelenideElement logIn = $x("//span[@class='icon icon--user']");

    public Header() {
    }

    public LoginPage openLoginPage() {
        logIn.click();
        return new LoginPage();
    }

    public HomePage openHome() {
        logo.click();
        return new HomePage();
    }


}
