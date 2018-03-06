import org.testng.annotations.DataProvider;

public class Params {

    @DataProvider(name = "loginTestPass")
    public static Object[][] loginPass() {
        return new Object[][]{{"meflt88@gmail.com", "qwe123"}
        };
    }

    @DataProvider(name = "loginTestFails")
    public static Object[][] loginFails() {
        return new Object[][]{ {"meflt@mail.ru", "qwe123"}
        };
    }

    @DataProvider(name = "chooseBrand")
    public static Object[][] brands(){
        return new Object[][] {
                {"Michael Kors"} ,
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
                {"Stella McCartney"}};
    }


}
