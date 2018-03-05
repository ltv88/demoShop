import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Account {

    private SelenideElement slogan = $("[class~='account__welcome--slogan']");
    private ElementsCollection accountItems = $$("[class=\"account__item\"]");
    private SelenideElement newsLetter = $("#footer-newsletter");

    public Account(){

    }

    public SelenideElement getSlogan() {
        return slogan;
    }
}
