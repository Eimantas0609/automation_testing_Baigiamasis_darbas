package lt.eimantas.partyInbox.pages.shoppingCart;

import lt.eimantas.partyInbox.pages.Common;
import lt.eimantas.partyInbox.pages.Locator;
import lt.eimantas.partyInbox.pages.login.PartyInboxLoginPage;

public class ShoppingCartPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void login(String email, String password) {
        PartyInboxLoginPage.writeEmail(email);
        PartyInboxLoginPage.writePassword(password);

        PartyInboxLoginPage.clickButtonPrisijungti();
        PartyInboxLoginPage.clickOnUserButton();
    }


    public static void clickOnProductCatalog() {
        Common.clickOnElement(Locator.Cart.productCatalog);
    }

    public static void chooseCategory() {
        Common.clickOnElement(Locator.Cart.category);
    }

    public static void chooseCategoryKind() {
        Common.clickOnElement(Locator.Cart.categoryKind);
    }

    public static void chooseWhatToBuy() {
        Common.moveAndClickOnElement(Locator.Cart.selection);
    }

    public static void addItemToCart() {
        Common.clickOnElement(Locator.Cart.purchase);
    }

    public static String readMessageAboutAddingToCart() {
        return Common.getText(Locator.Cart.messageAboutCart);
    }
}
