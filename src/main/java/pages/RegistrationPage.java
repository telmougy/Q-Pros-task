package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase {

    @FindBy(id = "sign-username")
    WebElement userNameTextBox;

    @FindBy(id = "sign-password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement signupButton;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void register(String userName, String password) {
        userNameTextBox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
        signupButton.click();
    }

}
