import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class Shop {


    private ElementsCollection productList = $$x("//a[@data-product]");
    private SelenideElement categoryDescription = $x("//div[@class='category-description__textarea text__center'] //h1");

    public Shop(){

    }

    public SelenideElement getCategoryDescription(){
        return categoryDescription;
    }
    
}
