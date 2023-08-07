package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTests extends TestBase {

    HomePage homePageObject;

    @Test
    public void ValidateThatPhonesCategoryHasItems() {
        homePageObject = new HomePage(driver);
        homePageObject.openPhonesCategory();
        softAssert.assertTrue(homePageObject.hasItems());
    }

    @Test
    public void ValidateThatLaptopsCategoryHasItems() {
        homePageObject = new HomePage(driver);
        homePageObject.openLaptopsCategory();
        softAssert.assertTrue(homePageObject.hasItems());
    }

    @Test
    public void ValidateThatMonitorsCategoryHasItems() {
        homePageObject = new HomePage(driver);
        homePageObject.openMonitorsCategory();
        softAssert.assertTrue(homePageObject.hasItems());
    }
}
