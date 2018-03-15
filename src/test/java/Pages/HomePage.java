package Pages;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by 88lit on 3/1/2018.
 */
public class HomePage {


    private SelenideElement goShopLink = $x("//a[@class='shooting-bag__stage__link']");
    private ElementsCollection brandsLinks = $$x("//ul[@id='brands'] //li");


    public HomePage() {
    }

    public ProductListPage chooseBrand(String brandName) {
        for (SelenideElement brand : brandsLinks) {
            if (brand.getText().equals(brandName)){
                brand.click();
                break;
            }
        }
        return new ProductListPage();
    }

}
