package lt.eimantas.partyInbox.pages.login;

import lt.eimantas.partyInbox.pages.Common;
import lt.eimantas.partyInbox.pages.Locator;

public class ChangePasswordPage {
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

    public static void clickOnIconMyAccount() {
        Common.clickOnElement(Locator.Login.buttonUser);
    }

    public static void clickOnChangeAccountInfo() {
        Common.waitForElementToBeVisible(Locator.Login.noteChangeAccountInfo);
        Common.clickOnElement(Locator.Login.noteChangeAccountInfo);
    }

    public static void enterNewPassword(String newPassword) {
        Common.addText(Locator.Login.inputNewPassword, newPassword);
    }

    public static void repeatNewPassword(String newPassword) {
        Common.addText(Locator.Login.inputRepeatNewPassword, newPassword);
    }

    public static void clickSubmit() {
        Common.clickOnElement(Locator.Login.submission);
    }

    public static String readMessageAboutChanges() {
        Common.waitForElementToBeVisible(Locator.Login.messageAboutChanges);
        return Common.getText(Locator.Login.messageAboutChanges);
    }
}
