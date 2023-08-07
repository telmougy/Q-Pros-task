package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends PageBase {

    @FindBy(css = "#tbodyid > tr:nth-child(1) > td:nth-child(4) > a")
    List<WebElement> deleteButton;

    @FindBy(css = ".btn.btn-success")
    WebElement placeOrderButton;

    @FindBy(tagName = "tr")
    List<WebElement> Items;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void deleteItem() {
        deleteButton.get(0).click();
    }

    public void clickPlaceOrder() {
        placeOrderButton.click();
    }

    public int getItemsCount() {
        return Items.size();
    }
}
