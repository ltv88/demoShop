package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    Selenide selenide;
    public String url;

    public BasePage(Selenide selenide){
        this.selenide = selenide;
        PageFactory.initElements(WebDriverRunner.getWebDriver(), this);
    }

    public void open(){
        selenide.open(url);
    }

    public boolean checkIsOpen(){
        return WebDriverRunner.url().equals(url);
    }

}
