package lt.eimantas.partyInbox.tests.search;

import lt.eimantas.partyInbox.pages.search.SearchPages;
import lt.eimantas.partyInbox.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        SearchPages.openUrl("https://www.partyinbox.lt/");
        SearchPages.closeAlert();
    }

    @Test
    public void test() {
        String wantedItem = "kostiumas";
        String expectedResult;
        expectedResult = wantedItem;
        String actualResult;
        SearchPages.writeWhatSearch(wantedItem);
        SearchPages.clickFind();
        actualResult = SearchPages.findedItem().toLowerCase();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }
}
