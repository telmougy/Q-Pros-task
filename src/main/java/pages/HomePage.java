package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "hrefch")
    List<WebElement> cards;

    @FindBy(css = ".list-group-item")
    List<WebElement> categories;

    public void selectItem() {
        cards.get(0).click();
    }

    public boolean hasItems() {
        return !cards.isEmpty();
    }

    public void openPhonesCategory() {
        categories.get(1).click();
    }

    public void openLaptopsCategory() {
        categories.get(2).click();
    }

    public void openMonitorsCategory() {
        categories.get(3).click();
    }
}
