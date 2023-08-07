package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id = "loginusername")
    WebElement usernameTextBox;

    @FindBy(id = "loginpassword")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginButton.click();

    }
}
