package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductListPage extends HomePage {


    private ElementsCollection productList = $$x("//a[@data-product]");
    private SelenideElement categoryDescription = $(".listing-page__display-name__text");

    public ProductListPage(){

    }

    public SelenideElement getCategoryDescription(){
        return categoryDescription;
    }
    
}
