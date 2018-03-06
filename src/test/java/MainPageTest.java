import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.navigator;

public class MainPageTest {
    @BeforeMethod
    public void getUrl(){
        Configuration.browser="chrome";
        navigator.open("https://www.fashionette.de");
    }


    @Test(dataProvider = "chooseBrand", dataProviderClass = Params.class)
    public void pickUpBrand(String brand){
        Main main = new Main();

        main.chooseBrand(brand).getCategoryDescription().shouldHave(Condition.text(brand));
    }


}
