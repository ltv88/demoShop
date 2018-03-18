package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Created by 88lit on 3/1/2018.
 */
public class Header {

    private SelenideElement logo = $("div.header__inner a.header__logo:nth-child(1)");
    private SelenideElement phone = $x("//div[@class=\"header__phone\"] //*[@href]");
    private SelenideElement serviceEmail = $x("//div[@class=\"header__email\"] //*[@href]");
    private SelenideElement logIn = $x("//span[@class='icon icon--user']");
    private SelenideElement search = $x("//div[@class='header__search-icon']");
    private ElementsCollection navigationMain = $$x("//ul[@class='header__navigation header__navigation--main']");
    private ElementsCollection navigationMeta = $$x("//ul[@class='header__navigation header__navigation--meta']");


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

    public void openSale() {
        navigationMeta.get(0).click();
    }

    public void openNew() {
        navigationMeta.get(1).click();
    }

    public void openSearh() {
        search.click();
    }

    public void openBags() {
        navigationMain.get(0).click();
    }

    public void openDesigner() {
        navigationMain.get(1).click();
    }

    public void openFitsBag() {
        navigationMain.get(2).click();
    }

}
