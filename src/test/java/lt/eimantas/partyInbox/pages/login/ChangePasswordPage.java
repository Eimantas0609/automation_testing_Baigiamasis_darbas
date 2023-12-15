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
//        Common.clickOnElement(Locator.Login.clickOnLogedUserButton);
        Common.clickOnElement(Locator.Login.clickOnUserButton);
    }

    public static void clickOnChangeAccountInfo() {
        Common.clickOnElement(Locator.Login.clickOnChangeAccountInfo);
    }

    public static void enterNewPassword(String newPassword) {
        Common.addText(Locator.Login.enterNewPassword, newPassword);
    }

    public static void repeatNewPassword(String newPassword) {
        Common.addText(Locator.Login.repeatNewPassword, newPassword);
    }

    public static void clickSubmit() {
        Common.clickOnElement(Locator.Login.clickSubmit);
    }

    public static String readMessageAboutChanges() {
        return Common.getText(Locator.Login.readMessageAboutChanges);
    }
}
