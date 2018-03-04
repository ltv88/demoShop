import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Created by 88lit on 3/1/2018.
 */
public class Header extends Main {

    private SelenideElement logo = $("div.header__inner a.header__logo:nth-child(1)");
    private SelenideElement phone = $x("//div[@class=\"header__phone\"] //*[@href]");
    private SelenideElement serviceEmail = $x("//div[@class=\"header__email\"] //*[@href]");
    private SelenideElement bags = $x("//*[text()='Taschen']");
    private SelenideElement designer = $x("//a[@href='#'][contains(text(),'Designer')]");
    private SelenideElement fitsBag = $x("//a[@href='#'][contains(text(),'Passend zur Tasche')]");
    private SelenideElement sale = $x("//*[@id='header__navigation--sale']");
    private SelenideElement newMerch = $x("//a[@href='https://www.fashionette.de/new']");
    private SelenideElement logIn = $x("//a[@href='https://www.fashionette.de/login']");
    private SelenideElement search = $x("//div[@class='header__search-icon']");

    public Header(){
    }

    public Login openLoginPage(){
        logIn.click();
        return new Login();
    }

    public void openSale(){
        sale.click();
    }

    public void openNew(){
        newMerch.click();
    }

    public void openSearh(){
        search.click();
    }

    public Main openHome(){
        logo.click();
        return new Main();
    }

    public void openBags(){
        bags.click();
    }

    public void openDesigner(){
        designer.click();
    }

    public void openFitsBag(){
        fitsBag.click();
    }

}
