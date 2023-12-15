package lt.eimantas.partyInbox.pages.shoppingCart;

import lt.eimantas.partyInbox.pages.Common;
import lt.eimantas.partyInbox.pages.Locator;
import lt.eimantas.partyInbox.pages.login.PartyInboxLoginPages;

public class ShoppingCartPages {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void login(String email, String password) {
        PartyInboxLoginPages.writeEmail(email);
        PartyInboxLoginPages.writePassword(password);

        PartyInboxLoginPages.clickButtonPrisijungti();
        PartyInboxLoginPages.clickOnUserButton();
    }



    public static void clickOnProductCatalog() {
        Common.clickOnElement(Locator.Cart.clickOnProductCatalog);
    }

    public static void chooseCategory() {
        Common.clickOnElement(Locator.Cart.chooseCategory);
    }

    public static void chooseCategoryKind() {
        Common.clickOnElement(Locator.Cart.chooseCategoryKind);
    }

    public static void chooseWhatToBuy() {
        Common.moveAndClickOnElement(Locator.Cart.chooseWhatToBuy);
    }

    public static void addItemToCart() {
        Common.clickOnElement(Locator.Cart.addItemToCart);
    }

    public static void clickOnCartSign() {
        Common.clickOnElement(Locator.Cart.clickOnCartSign);
    }

    public static void viewCart() {
        Common.clickOnElement(Locator.Cart.viewCart);
    }

    public static String checkOrApearedButtonToPay() {
        return Common.getText(Locator.Cart.checkOrAppearedButtonToPay);
    }
}
