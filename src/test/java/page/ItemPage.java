package page;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends PageComponent {

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElementFacade addToCartBtn;

    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElementFacade removeBtn;

    public void clickAddToCartBtn() {
         addToCartBtn.click();

    }

    public String getTextRemoveBtn() {
        return addToCartBtn.getText();
    }


}
