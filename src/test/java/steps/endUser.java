package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import pages.loginPage;

public class endUser {

    loginPage pageObj;

    @Step
    public void openUrl(){
        pageObj.goToUrl();
    }

    @Step
    public void Login(){
        pageObj.getLogin();
    }

}
