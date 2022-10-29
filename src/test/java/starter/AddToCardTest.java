package starter;

import actions.*;
import modal.User;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class AddToCardTest {

    WebDriver driver;
    NavigateActions navigate;
    LoginActions loginActions;
    InventoryAction inventoryAction;
    MainHeaderAction mainHeaderAction;
    ItemAction itemAction;

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
        inventoryAction.selectItemInventory(5);
        assertFalse(mainHeaderAction.isItemInBasket());
        itemAction.clickAddCartBtn();
        assertAll("Check for item add basket'",
                () -> assertEquals(itemAction.getTextRemoveBtn(), "Remove"),
                () -> assertTrue(mainHeaderAction.isItemInBasket()),
                () -> assertEquals(mainHeaderAction.getQuantityItemInBasket(), 1)
        );
    }
}
