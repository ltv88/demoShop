package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AccountPage {

    private SelenideElement slogan = $("[class~='account__welcome--slogan']");
    private ElementsCollection accountItems = $$("[class=\"account__item\"]");
    private SelenideElement newsLetter = $("#footer-newsletter");
    private SelenideElement logoutBtn = $(".account__logout");

    public AccountPage(){

    }

    public HomePage logout(){
        logoutBtn.click();
        return new HomePage();
    }

    public SelenideElement getSlogan() {
        return slogan;
    }
}
