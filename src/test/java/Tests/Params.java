package Tests;

import org.testng.annotations.DataProvider;

public class Params {

    @DataProvider(name = "loginTestPass")
    public static Object[][] loginPass() {
        return new Object[][]{{"meflt88@gmail.com", "qwe123"}
        };
    }

    @DataProvider(name = "loginTestFails")
    public static Object[][] loginFails() {
        return new Object[][]{ {"errortest@mail.ru", "2425"}
        };
    }

    @DataProvider(name = "errorEmail")
    public static Object[][] validEmail() {
        return new Object[][]{ {"", "qwe123"},
                {"meflt88gmail.com","qwe123"}
        };
    }

    @DataProvider(name = "errorPass")
    public static Object[][] validPass() {
        return new Object[][]{ {"meflt88@gmail.com", ""},
                {"meflt88@gmail.com","qwe"}
        };
    }

    @DataProvider(name = "loginValid")
    public static Object[][] loginValid() {
        return new Object[][]{ {"", ""}
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
