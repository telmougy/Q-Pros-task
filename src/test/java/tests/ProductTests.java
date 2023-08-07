package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class ProductTests extends TestBase {
    HomePage homePageObject;
    ProductPage productPageObject;

    @Test
    public void ValidateThatAddToCartButtonWorksCorrectly() throws InterruptedException {
        homePageObject = new HomePage(driver);
        productPageObject = new ProductPage(driver);
        homePageObject.selectItem();
        productPageObject.addToCart();
        Thread.sleep(2000);
        Assert.assertEquals(productPageObject.getAlertMessage(), "Product added");
    }
}
