package lt.eimantas.piguLt.tests.login;

import lt.eimantas.piguLt.pages.login.PartyInboxLoginPages;
import lt.eimantas.piguLt.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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
                "\nActual: %s, \nExpected: %s".formatted(actualResult,expectedResult)
        );
    }

}
