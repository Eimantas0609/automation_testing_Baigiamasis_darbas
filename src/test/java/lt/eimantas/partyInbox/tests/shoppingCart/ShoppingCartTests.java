package lt.eimantas.partyInbox.tests.shoppingCart;

import lt.eimantas.partyInbox.pages.login.PartyInboxLoginPage;
import lt.eimantas.partyInbox.pages.shoppingCart.ShoppingCartPage;
import lt.eimantas.partyInbox.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTests extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ShoppingCartPage.openUrl("https://www.partyinbox.lt/mano-paskyra");
        PartyInboxLoginPage.closeAlert();
        ShoppingCartPage.login("jurenkovai@gmail.com", "test#2023");
    }

    @Test
    public void testCreateShoppingCart() {

        String expectedResult = "Atsiskaitymas";
        String actualResult;
        ShoppingCartPage.clickOnProductCatalog();
        ShoppingCartPage.chooseCategory();
        ShoppingCartPage.chooseCategoryKind();
        ShoppingCartPage.chooseWhatToBuy();
        ShoppingCartPage.addItemToCart();
        ShoppingCartPage.clickOnCartSign();
        ShoppingCartPage.viewCart();


        actualResult = ShoppingCartPage.checkOrApearedButtonToPay();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }
}
