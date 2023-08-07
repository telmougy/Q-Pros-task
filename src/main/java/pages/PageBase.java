package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;
    @FindBy(id = "signin2")
    WebElement signUpButton;

    @FindBy(id = "login2")
    WebElement loginButton;

    @FindBy(css = "#cartur")
    WebElement cartButton;

    @FindBy(id = "nava")
    WebElement homeButton;

    @FindBy(id = "nameofuser")
    public WebElement userName;

    @FindBy(id = "logout2")
    WebElement logoutButton;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openSignupModal() {
        signUpButton.click();
    }

    public void openLoginModal() {
        loginButton.click();
    }

    public void logout() {
        logoutButton.click();
    }

    public void navigateToCart() {

        cartButton.click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getAlertMessage() {
        String alertMessage;
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertMessage;
    }
}
