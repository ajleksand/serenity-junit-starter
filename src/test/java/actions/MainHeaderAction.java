package actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import page.MainHeader;

public class MainHeaderAction extends UIInteractions {
    MainHeader mainHeader;

    @Step("Check item in basket")
    public boolean isItemInBasket() {
        return mainHeader.isItemInBasket();
    }

    @Step("Get quantity item in basket")
    public int getQuantityItemInBasket() {
        return mainHeader.getQuantityItemBasket();
    }

}
