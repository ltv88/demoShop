package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public String pageUrl;

    public BasePage(){
    }

    public void open(){
        Selenide.open(pageUrl);
    }

    public boolean checkIsOpen(){
        return WebDriverRunner.url().equals(pageUrl);
    }

}
