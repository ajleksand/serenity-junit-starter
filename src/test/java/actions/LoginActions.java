package actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import page.LoginPage;

public class LoginActions extends UIInteractions {

    LoginPage loginPage;

    @Step("Send input Login")
    public void setLoginInp(String login) {
        loginPage.sendKeysLoginInp(login);
    }

    @Step("Send input password")
    public void setPasswordInp(String password) {
        loginPage.sendKeysPasswordInp(password);
    }

    @Step("Click login button")
    public void clickLoginBtn() {
        loginPage.clickLoginBtn();
    }


}
