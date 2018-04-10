package Pages;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by 88lit on 3/1/2018.
 */
public class HomePage extends BasePage {

    private SelenideElement goShopLink = $x("//a[@class='shooting-bag__stage__link']");
    private ElementsCollection brandsLinks = $$x("//ul[@id='brands'] //li");
//    private String pageUrl = "https://www.fashionette.de";
    Header header;

    public HomePage() {
        this.header = new Header();
        this.pageUrl = "https://www.fashionette.de";
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

    public boolean checkIsOpen() {
        return WebDriverRunner.url().equals(pageUrl);
    }
}
