package Tests;

import Pages.HomePage;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;



public class HomePageTest extends DriverManager{

    @Test(dataProvider = "chooseBrand", dataProviderClass = Params.class)
    public void pickUpBrand(String brand){
        Thread.currentThread().getId();
        HomePage homePage = new HomePage();

        homePage.chooseBrand(brand)

                .getCategoryDescription().shouldHave(Condition.text(brand));
    }

}
