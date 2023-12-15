package lt.eimantas.partyInbox.pages.login;

import lt.eimantas.partyInbox.pages.Common;
import lt.eimantas.partyInbox.pages.Locator;


public class PartyInboxLoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void writeEmail(String email) {

        Common.addText(Locator.Login.writeEmail, email);
    }

    public static void writePassword(String password) {
        Common.addText(Locator.Login.writePassword, password);
    }

    public static void closeAlert() {
        Common.clickOnElement(Locator.Login.closeAlert);
    }

    public static void clickButtonPrisijungti() {
        Common.clickOnElement(Locator.Login.clickButtonPrisijungti);
    }

    public static void clickOnUserButton() {
        Common.clickOnElement(Locator.Login.clickOnUserButton);
    }

    public static String userName() {
        return Common.getText(Locator.Login.readUserName);
    }

    public static String warningMessage() {
        return Common.getText(Locator.Login.readWarning);
    }

    public static void clickButtonAtsijungti() {
        Common.clickOnElement(Locator.Login.clickButtonAtsijungti);
    }
}


