package lt.eimantas.partyInbox.tests.login;

import lt.eimantas.partyInbox.pages.login.ChangePasswordPage;
import lt.eimantas.partyInbox.pages.login.PartyInboxLoginPage;
import lt.eimantas.partyInbox.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangePasswordTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        ChangePasswordPage.openUrl("https://www.partyinbox.lt/mano-paskyra");
        PartyInboxLoginPage.closeAlert();
        ChangePasswordPage.login("jurenkovai@gmail.com", "test#2023");
    }

    @Test
    public void testChangePassword() {
        String newPassword = "test#2023";
        String expectedResult = "Pavyko: Jūsų paskyra sėkmingai atnaujinta.";
        String actualResult;

        ChangePasswordPage.clickOnIconMyAccount();
        ChangePasswordPage.clickOnChangeAccountInfo();
        ChangePasswordPage.enterNewPassword(newPassword);
        ChangePasswordPage.repeatNewPassword(newPassword);
        ChangePasswordPage.clickSubmit();
        actualResult = ChangePasswordPage.readMessageAboutChanges();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(actualResult, expectedResult)
        );
    }
}
