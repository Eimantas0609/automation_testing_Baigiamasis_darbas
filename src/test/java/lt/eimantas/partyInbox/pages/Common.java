package lt.eimantas.partyInbox.pages;

import lt.eimantas.partyInbox.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Common {

    public static void setUpChrome(int durationOfSeconds) {
        Driver.setUpChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void addText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }
}
