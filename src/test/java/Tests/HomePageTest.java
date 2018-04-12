package Tests;

import Pages.HomePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();

    @DataProvider(name = "chooseAllBrands")
    public static Object[][] chooseAllBrandsCase() {
        return new Object[][]{
                {"Michael Kors"},
                {"MCM"},
                {"Prada"},
                {"Chloé"},
                {"Gucci"},
                {"Saint Laurent"},
                {"Furla"},
                {"Lauren Ralph Lauren"},
                {"Christian Louboutin"},
                {"Valentino"},
                {"Balenciaga"},
                {"Miu Miu"},
                {"Burberry"},
                {"UGG"},
                {"Stella McCartney"}
        };
    }

    @Test(dataProvider = "chooseAllBrands")
    public void pickUpBrand(String brand) {
        Thread.currentThread().getId();
        homePage.open();

        homePage.chooseBrand(brand)

                .getCategoryDescription().shouldHave(Condition.text(brand));
    }

}
