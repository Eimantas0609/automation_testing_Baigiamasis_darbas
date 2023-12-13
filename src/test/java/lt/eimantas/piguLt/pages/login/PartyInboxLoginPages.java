package lt.eimantas.piguLt.pages.login;
import lt.eimantas.piguLt.pages.Common;
import lt.eimantas.piguLt.pages.Locator;


public class PartyInboxLoginPages {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }


    public static void writeEmail(String email) {

            Common.addText(Locator.login.writeEmail, email);
        }


    public static void writePassword(String password) {
        Common.addText(Locator.login.writePassword, password);
    }

    public static void closeAlert() {
        Common.clickOnElement(Locator.login.closeAlert);
    }

    public static void clickButtonPrisijungti() {

        Common.clickOnElement(Locator.login.clickButtonPrisijungti);

    }

    public static void clickOnUserButton() {
        Common.clickOnElement(Locator.login.ClickOnUserButton);
    }

    public static String userName() {
        return Common.getText(Locator.login.getUserName);
    }
}


