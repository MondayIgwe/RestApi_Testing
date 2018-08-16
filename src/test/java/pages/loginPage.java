package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class loginPage extends PageObject {

    @Managed
    private WebDriver myDriver;

    //<editor fold>
    @FindBy(xpath = "//button[contains(text(),'Click here to login')]")
    private WebElementFacade login;




    //openPage
    public void goToUrl(){
        myDriver = getDriver();
        myDriver.get("https://www.unisa.ac.za/sites/myunisa/default/");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.manage().window().maximize();
        setDriver(myDriver);

    }
    //LOGIN
    public void getLogin() {
        login.click();
    }
}
