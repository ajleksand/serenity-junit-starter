package actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import page.ItemPage;

public class ItemAction extends UIInteractions {
    ItemPage itemPage;

    @Step("Click add cart button")
    public void clickAddCartBtn() {
        itemPage.clickAddToCartBtn();
    }

    @Step("Get text remove button")
    public String getTextRemoveBtn() {
        return itemPage.getTextRemoveBtn();
    }


}
