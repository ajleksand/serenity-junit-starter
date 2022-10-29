package actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractions {
    @Step("Navigate to the home page")
    public void toTheHomePage() {
        openUrl("https://www.saucedemo.com/");
    }
}
