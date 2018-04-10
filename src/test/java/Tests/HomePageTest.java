package Tests;

import Pages.HomePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;



public class HomePageTest extends BaseTest {

    HomePage homePage;

    @Test(dataProvider = "chooseBrand", dataProviderClass = Params.class)
    public void pickUpBrand(String brand){
        Thread.currentThread().getId();
        HomePage homePage = new HomePage();

        homePage.chooseBrand(brand)

                .getCategoryDescription().shouldHave(Condition.text(brand));
    }

}
