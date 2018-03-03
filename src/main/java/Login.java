import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.$;


/**
 * Created by 88lit on 3/1/2018.
 */
public class Login {

    private WebDriver driver;


    public Login(){
//        this.driver = driver;
    }

//
//    private WebElement logo = driver.findElement(By.cssSelector("a.header__logo:nth-child(1) > img.logo-claim"));
//    private WebElement xButtonText = driver.findElement(By.cssSelector("//*[text()='Zurück']"));
//    private WebElement xButton = driver.findElement(By.cssSelector(".box__close [class*='icon--cross-big-red']"));
//    private WebElement loginTitle = driver.findElement(By.xpath("//*[text()='Login']"));
//    private WebElement eMailTitle = driver.findElement(By.xpath("//label[@for='email']"));
//    private WebElement eMailField = driver.findElement(By.xpath("//input[@name='email']"));
//    private WebElement passTitle = driver.findElement(By.cssSelector("label[for='login__password']"));
//    private WebElement passField = driver.findElement(By.xpath("//input[@name='password']"));
//    private WebElement submitBtn = driver.findElement(By.xpath("//button[contains(text(),\"Einloggen\")]"));
//    private WebElement forgotPass = driver.findElement(By.cssSelector("a[class=\"forgot-password-toggle\"]"));

    public void login(String email, String pass){
        $("//input[@name='email']").clear();
        $("//input[@name='email']").sendKeys(email);
        $("//input[@name='password']").clear();
        $("//input[@name='password']").sendKeys(pass);
        $("//button[contains(text(),\"Einloggen\")]").click();
//        eMailField.clear();
//        eMailField.sendKeys(email);
//        passField.clear();
//        passField.sendKeys(pass);

//        submitBtn.click();
    }




}
