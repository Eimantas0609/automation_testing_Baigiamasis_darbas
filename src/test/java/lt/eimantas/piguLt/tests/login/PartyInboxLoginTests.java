package lt.eimantas.piguLt.tests.login;

import lt.eimantas.piguLt.pages.login.PartyInboxLoginPages;
import lt.eimantas.piguLt.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PartyInboxLoginTests extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        PartyInboxLoginPages.openUrl("https://www.partyinbox.lt/prisijungti-prie-paskyros");
    }

    @Test
    public void testLoginPositive() {
        String email = "jurenkovai@gmail.com";
        String password = "test#2023";
        PartyInboxLoginPages.writeEmail(email);
        PartyInboxLoginPages.writePassword(password);
        PartyInboxLoginPages.closeAlert();
        PartyInboxLoginPages.clickButtonPrisijungti();
        PartyInboxLoginPages.clickOnUserButton();
        String expectedResult = "Eimantas";
        String actualResult = PartyInboxLoginPages.userName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }

    @DataProvider(name = "invalid data")
    public Object[][] provideInvalidDataForLogin() {
        return new Object[][]{
                {"jurenkovai@gmail.co", "test#2023"},
                {"jurenkovai@gmail.com", "test2023"},
                {"jurenkovai@gmail.co", "test2023"},
        };
    }

    @Test(dataProvider = "invalid data")
    public void testLoginNegative(String email, String password) {
        PartyInboxLoginPages.writeEmail(email);
        PartyInboxLoginPages.writePassword(password);
        PartyInboxLoginPages.closeAlert();
        PartyInboxLoginPages.clickButtonPrisijungti();
        String expectedResult = "Įspėjimas: ";
        String actualResult;
        actualResult = PartyInboxLoginPages.warningMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }

}
