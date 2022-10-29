package page;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageComponent {

    @FindBy(id = "user-name")
    private WebElementFacade loginInp;
    @FindBy(id = "password")
    private WebElementFacade passwordInp;
    @FindBy(id = "login-button")
    private WebElementFacade loginBtn;

    public void sendKeysLoginInp(String name) {
        loginInp.sendKeys(name);
    }

    public void sendKeysPasswordInp(String password) {
        passwordInp.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

}
