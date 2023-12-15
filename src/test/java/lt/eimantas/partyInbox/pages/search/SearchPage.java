package lt.eimantas.partyInbox.pages.search;

import lt.eimantas.partyInbox.pages.Common;
import lt.eimantas.partyInbox.pages.Locator;


public class SearchPage {
    public static void openUrl(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void closeAlert() {
        Common.clickOnElement(Locator.Login.closeAlert);
    }

    public static void writeWhatSearch(String wantedItem) {
        Common.addText(Locator.Search.writeTheDesiredItem, wantedItem);
    }

    public static void clickFind() {
        Common.clickOnElement(Locator.Search.clickFind);
    }

    public static String findedItem() {
        return Common.getText(Locator.Search.findedItem);
    }
}
