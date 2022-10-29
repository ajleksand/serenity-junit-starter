package actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import page.InventoryPage;

public class InventoryAction extends UIInteractions {

    InventoryPage inventoryPage;

    @Step("Select short container")
    public void selectShort(String sortType) {
        inventoryPage.selectSortContainer(sortType);
    }

    @Step("Click for item Name")
    public void selectItemInventory(int itemNumber) {
        inventoryPage.getInventoryItem(itemNumber);
    }
}
