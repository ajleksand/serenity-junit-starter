package starter;

import actions.InventoryAction;
import actions.LoginActions;
import actions.NavigateActions;
import modal.User;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import page.InventoryPage;

import static java.lang.Thread.sleep;

@ExtendWith(SerenityJUnit5Extension.class)
public class AddToCardTest {

    WebDriver driver;


    NavigateActions navigate;
    LoginActions loginActions;
    InventoryAction inventoryAction;

    @Test
    @DisplayName("Add item to basket")
    public void testLoginInSwagLabs() {

        //Создаем пользователя
        User standardUser = new User("standard_user", "secret_sauce");

        navigate.toTheHomePage();
        loginActions.setLoginInp(standardUser.getName());
        loginActions.setPasswordInp(standardUser.getPassword());
        loginActions.clickLoginBtn();
        inventoryAction.selectShort("Z to A");

    }


}
