package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import pages.loginPage;

public class endUser {

    loginPage pageObj;

    @Step
    public void openUrl()throws Throwable{
        pageObj.goToUrl();
    }

    @Step
    public void Login()throws Throwable{
        pageObj.getLogin();
    }

}
