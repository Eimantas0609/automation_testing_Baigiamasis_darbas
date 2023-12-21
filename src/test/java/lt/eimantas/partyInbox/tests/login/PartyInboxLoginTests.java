package lt.eimantas.partyInbox.tests.login;

import lt.eimantas.partyInbox.pages.login.PartyInboxLoginPage;
import lt.eimantas.partyInbox.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PartyInboxLoginTests extends TestBase {
    @BeforeMethod
    @Override

    public void setUp() {
        PartyInboxLoginPage.openUrl("https://www.partyinbox.lt/prisijungti-prie-paskyros");
        PartyInboxLoginPage.closeAlert();
    }

    @Test
    public void testLoginPositive() {
        String email = "jurenkovai@gmail.com";
        String password = "test#2023";
        String expectedResult = "Eimantas";

        PartyInboxLoginPage.writeEmail(email);
        PartyInboxLoginPage.writePassword(password);

        PartyInboxLoginPage.clickButtonPrisijungti();
        PartyInboxLoginPage.clickOnUserButton();

        String actualResult = PartyInboxLoginPage.userName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
        PartyInboxLoginPage.clickOnUserButton();
        PartyInboxLoginPage.clickButtonAtsijungti();
    }

    @DataProvider(name = "invalid data")
    public Object[][] provideInvalidDataForLogin() {
        return new Object[][]{
                {"jurenkovai@gmail.co", "test#2023"},
                {"jurenkovai@gmail.com", "test2023"},
                {"", ""},
        };
    }

    @Test(dataProvider = "invalid data")
    public void testLoginNegative(String email, String password) {

        PartyInboxLoginPage.writeEmail(email);
        PartyInboxLoginPage.writePassword(password);
        PartyInboxLoginPage.clickButtonPrisijungti();

        String expectedResult = "Įspėjimas: ";
        String actualResult;

        actualResult = PartyInboxLoginPage.warningMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }
}
