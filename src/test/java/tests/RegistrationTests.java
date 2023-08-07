package tests;

import net.datafaker.Faker;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTests extends TestBase {
    RegistrationPage registrationPageObject;

    Faker faker = new Faker();
    String userName = faker.name().username();
    String password = faker.text().text(8);

    @Test(priority = 0)
    public void ValidateThatAppRegisterSuccessfullyWithValidUsernameAndPassword() throws InterruptedException {
        registrationPageObject = new RegistrationPage(driver);
        registrationPageObject.openSignupModal();
        registrationPageObject.register(userName, password);
        Thread.sleep(2000);
        softAssert.assertEquals(registrationPageObject.getAlertMessage(), "Sign up successful.");
    }

    @Test(priority = 1)
    public void ValidateThatErrorMessageAppearsWhenRegisterWithExistedUsername() throws InterruptedException {
        registrationPageObject = new RegistrationPage(driver);
        registrationPageObject.openSignupModal();
        registrationPageObject.register(userName, password);
        Thread.sleep(2000);
        softAssert.assertEquals(registrationPageObject.getAlertMessage(), "This user already exist.");
    }
}
