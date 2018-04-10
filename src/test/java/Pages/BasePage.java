package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

public class BasePage {

    public String url;

    public BasePage(){

    }

    public BasePage open(){
        Selenide.open(this.url);
        return new BasePage();
    }

    public boolean checkIsOpen(){
        return WebDriverRunner.url().equals(this.url);
    }

}
