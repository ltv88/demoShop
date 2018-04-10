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
//    private String pageUrl = "https://www.fashionette.de/account/customer";


    public AccountPage(){
        this.pageUrl = "https://www.fashionette.de/account/customer";
    }


    public HomePage logout(){
        logoutBtn.click();
        return new HomePage();
    }

    public SelenideElement getSlogan() {
        return slogan;
    }
}

