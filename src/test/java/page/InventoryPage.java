package page;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends PageComponent {

    @FindBy(xpath = "//select[@data-test='product_sort_container']")
    private WebElementFacade sortContainer;

    @FindBy(xpath = "//button[contains(@class,'btn_primary')]")
    private ListOfWebElementFacades listAddToCartBtn;


    public void selectSortContainer(String typeSort) {
        sortContainer.click();
        switch (typeSort) {
            case "A to Z" -> $(By.xpath("//option[@value = 'az']")).click();
            case "Z to A" -> $(By.xpath("//option[@value = 'za']")).click();
            case "low to high" -> $(By.xpath("//option[@value = 'lohi']")).click();
            case "high to low" -> $(By.xpath("//option[@value = 'hilo']")).click();
            default -> Assert.fail("Incorrect sort type.");
        }
    }


}
