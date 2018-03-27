package Pages;

import Tests.DriverManager;
import com.codeborne.selenide.*;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * Created by 88lit on 3/1/2018.
 */
public class HomePage {

    private SelenideElement goShopLink = $x("//a[@class='shooting-bag__stage__link']");
    private ElementsCollection brandsLinks = $$x("//ul[@id='brands'] //li");
    String url = "https://www.fashionette.de/";

    Header header;

    public HomePage() {
        this.header = new Header();
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

    public boolean isHomePage(){
        return url().equals(url);
    }

}
