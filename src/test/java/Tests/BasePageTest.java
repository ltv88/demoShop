package Tests;

import Pages.BasePage;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;



public class BasePageTest extends DriverManager{

    @Test(dataProvider = "chooseBrand", dataProviderClass = Params.class)
    public void pickUpBrand(String brand){
        BasePage basePage = new BasePage();

        basePage.chooseBrand(brand)

                .getCategoryDescription().shouldHave(Condition.text(brand));
    }


}
