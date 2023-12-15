package lt.eimantas.partyInbox.tests.search;

import lt.eimantas.partyInbox.pages.search.SearchPage;
import lt.eimantas.partyInbox.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        SearchPage.openUrl("https://www.partyinbox.lt/");
        SearchPage.closeAlert();
    }

    @Test
    public void testSearch() {
        String wantedItem = "kostiumas";
        String expectedResult;
        expectedResult = wantedItem;
        String actualResult;
        SearchPage.writeWhatSearch(wantedItem);
        SearchPage.clickFind();
        actualResult = SearchPage.findedItem().toLowerCase();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }
}
