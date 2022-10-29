package page;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.FindBy;

public class MainHeader extends PageComponent {

    @FindBy(id = "shopping_cart_container")
    private WebElementFacade basket;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElementFacade itemInBasket;

    public boolean isItemInBasket() {
        boolean isItemBasket;
        try {
            itemInBasket.shouldBeVisible();
            isItemBasket = true;
        } catch (TimeoutException e) {
            isItemBasket = false;
        }
        return isItemBasket;
    }

    public int getQuantityItemBasket() {
        return Integer.parseInt(itemInBasket.getText());
    }

}
