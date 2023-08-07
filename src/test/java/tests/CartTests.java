package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class CartTests extends TestBase {

    HomePage homePageObject;
    LoginPage loginPageObject;

    CartPage cartPageObject;
    ProductPage productPageObject;

    @Test
    public void ValidateThatOrderAddedToCartCorrectly() throws InterruptedException {
        homePageObject = new HomePage(driver);
        productPageObject = new ProductPage(driver);
        cartPageObject = new CartPage(driver);
        homePageObject.selectItem();
        productPageObject.addToCart();
        Thread.sleep(2000);
        productPageObject.acceptAlert();
        cartPageObject.navigateToCart();
        softAssert.assertEquals(cartPageObject.getItemsCount(), 2);

    }

    @Test
    public void ValidateThatItemRemovedFromCartCorrectly() throws InterruptedException {
        homePageObject = new HomePage(driver);
        productPageObject = new ProductPage(driver);
        cartPageObject = new CartPage(driver);
        homePageObject.selectItem();
        productPageObject.addToCart();
        Thread.sleep(2000);
        productPageObject.acceptAlert();
        cartPageObject.navigateToCart();
        softAssert.assertEquals(cartPageObject.getItemsCount(), 2);
        cartPageObject.deleteItem();
        Thread.sleep(2000);
        softAssert.assertEquals(cartPageObject.getItemsCount(), 1);

    }

}
