package lt.eimantas.partyInbox.pages.search;

import lt.eimantas.partyInbox.pages.Common;
import lt.eimantas.partyInbox.pages.Locator;


public class SearchPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void closeAlert() {
        Common.clickOnElement(Locator.Login.alert);
    }

    public static void writeWhatSearch(String wantedItem) {
        Common.addText(Locator.Search.inputTheDesiredItem, wantedItem);
    }

    public static void clickFind() {
        Common.clickOnElement(Locator.Search.signFind);
    }

    public static String findedItem() {
        return Common.getText(Locator.Search.nameOfItem);
    }
}
