package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class loginPage extends PageObject {

    @Managed
    private WebDriver myDriver;

    private  int implicitWaitTimeout = 60;

    //URL
    private String url = "https://www.unisa.ac.za/sites/myunisa/default/";

    //PROPERTY FILE
    Properties prop = new Properties();

    //<editor fold>
    @FindBy(xpath = "//button[contains(text(),'Click here to login')]")
    @CacheLookup
    private WebElementFacade login;




    //openPage
    public void goToUrl()throws Throwable{
        myDriver = getDriver();
//        prop.load( new FileInputStream("src\\test\\resources\\application.properties"));
//        prop.getProperty("url");
        myDriver.get(this.url);
        myDriver.manage().window().maximize();
        myDriver.manage().timeouts().implicitlyWait(implicitWaitTimeout, TimeUnit.SECONDS);
        setDriver(myDriver);

    }
    //HIGHLIGHT ELEMENTS
    @Step
    public void highLighterMethod(WebElementFacade element){
        ((JavascriptExecutor)myDriver).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }//HIGHLIGHT ELEMENTS
    @Step
    public void highLighterBorderMethod(WebElement element) throws Throwable{
        ((JavascriptExecutor)myDriver).executeScript("js.executeScript(arguments[0].setAttribute('style','border: solid 2px white');", element);
    }
    //CLICK BUTTON
    public void getLogin() throws Throwable{
        if (login.isCurrentlyEnabled()){
            //highLighterBorderMethod(login);
            Actions actions = new Actions(myDriver);
            actions.moveToElement(login).click().perform();
            //login.click();
            Thread.sleep(3000);
        }

    }


}
