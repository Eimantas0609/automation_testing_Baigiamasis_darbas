package lt.eimantas.partyInbox.tests.shoppingCart;

import lt.eimantas.partyInbox.pages.login.PartyInboxLoginPages;
import lt.eimantas.partyInbox.pages.shoppingCart.ShoppingCartPages;
import lt.eimantas.partyInbox.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTests extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ShoppingCartPages.openUrl("https://www.partyinbox.lt/mano-paskyra");
        PartyInboxLoginPages.closeAlert();
        ShoppingCartPages.login("jurenkovai@gmail.com", "test#2023");
    }

    @Test
    public void testCreateShoppingCart() {

        String expectedResult = "Atsiskaitymas";
        String actualResult;
        ShoppingCartPages.clickOnProductCatalog();
        ShoppingCartPages.chooseCategory();
        ShoppingCartPages.chooseCategoryKind();
        ShoppingCartPages.chooseWhatToBuy();
        ShoppingCartPages.addItemToCart();
        ShoppingCartPages.clickOnCartSign();
        ShoppingCartPages.viewCart();


        actualResult = ShoppingCartPages.checkOrApearedButtonToPay();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }
}
