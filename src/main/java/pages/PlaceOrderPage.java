package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage extends PageBase {

    @FindBy(id = "name")
    WebElement nameText;

    @FindBy(id = "country")
    WebElement countryText;

    @FindBy(id = "city")
    WebElement cityText;

    @FindBy(id = "card")
    WebElement creditCardText;

    @FindBy(id = "month")
    WebElement monthText;

    @FindBy(id = "year")
    WebElement yearText;

    @FindBy(xpath = "//*[text()='Purchase']")
    WebElement purchaseText;

    @FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > h2")
    WebElement successMessage;

    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    public void placeOrder(String name, String country, String city, String card, String month, String year) {
        nameText.sendKeys(name);
        countryText.sendKeys(country);
        cityText.sendKeys(city);
        creditCardText.sendKeys(card);
        monthText.sendKeys(month);
        yearText.sendKeys(year);
        purchaseText.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
