package lt.eimantas.partyInbox.pages.login;

import lt.eimantas.partyInbox.pages.Common;
import lt.eimantas.partyInbox.pages.Locator;


public class PartyInboxLoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void writeEmail(String email) {
        Common.addText(Locator.Login.inputEmail, email);
    }

    public static void writePassword(String password) {
        Common.addText(Locator.Login.inputPassword, password);
    }

    public static void closeAlert() {
        Common.clickOnElement(Locator.Login.alert);
    }

    public static void clickButtonPrisijungti() {
        Common.clickOnElement(Locator.Login.buttonPrisijungti);
    }

    public static void clickOnUserButton() {
        Common.clickOnElement(Locator.Login.buttonUser);
    }

    public static String userName() {
        return Common.getText(Locator.Login.userName);
    }

    public static String warningMessage() {
        Common.waitForElementToBeVisible(Locator.Login.greeting);
        return Common.getText(Locator.Login.greeting);
    }

    public static void clickButtonAtsijungti() {
        Common.clickOnElement(Locator.Login.buttonAtsijungti);
    }
}


