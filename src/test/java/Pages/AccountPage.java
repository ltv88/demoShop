package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AccountPage extends BasePage {

    private SelenideElement slogan = $("[class~='account__welcome--slogan']");
    private ElementsCollection accountItems = $$("[class=\"account__item\"]");
    private SelenideElement newsLetter = $("#footer-newsletter");
    private SelenideElement logoutBtn = $(".account__logout");

    public AccountPage(Selenide selenide){
        super(selenide);
        this.url = "https://www.fashionette.de/account/customer";
        PageFactory.initElements(WebDriverRunner.getWebDriver(), this);
    }

    public HomePage logout(){
        logoutBtn.click();
        return new HomePage(selenide);
    }

    public SelenideElement getSlogan() {
        return slogan;
    }
}
