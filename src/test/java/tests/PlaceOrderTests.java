package tests;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

import static utils.jsonReader.getTestData;

public class PlaceOrderTests extends TestBase {
    HomePage homePageObject;
    LoginPage loginPageObject;
    CartPage cartPageObject;
    ProductPage productPageObject;

    PlaceOrderPage placeOrderPageObject;

    String testFilePath = "src/test/java/data/placeOrder.json";
    String name = getTestData(testFilePath, "name");
    String country = getTestData(testFilePath, "country");
    String city = getTestData(testFilePath, "city");
    String card = getTestData(testFilePath, "card");
    String month = getTestData(testFilePath, "month");
    String year = getTestData(testFilePath, "year");


    public PlaceOrderTests() throws IOException, ParseException {
    }

    @Test
    public void ValidateThatOrderAddedToCartCorrectly() throws InterruptedException {
        homePageObject = new HomePage(driver);
        productPageObject = new ProductPage(driver);
        cartPageObject = new CartPage(driver);
        placeOrderPageObject = new PlaceOrderPage(driver);
        homePageObject.selectItem();
        productPageObject.addToCart();
        Thread.sleep(2000);
        productPageObject.acceptAlert();
        cartPageObject.navigateToCart();
        cartPageObject.clickPlaceOrder();
        placeOrderPageObject.placeOrder(name, country, city, card, month, year);
        softAssert.assertEquals(placeOrderPageObject.getSuccessMessage(), "Thank you for your purchase!");
    }
}
