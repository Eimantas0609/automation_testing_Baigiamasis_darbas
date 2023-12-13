package lt.eimantas.piguLt.pages;

import lt.eimantas.piguLt.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void setUpChrome() {
        Driver.setUpChromeDriver();
    }

    public static void setUpChrome(int durationOfSeconds) {
        Driver.setUpChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    public static void setUpChrome(int durationOfSeconds, double scaleFactor) {
        Driver.setUpChromeDriver(scaleFactor, false);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    public static void setUpChrome(int durationOfSeconds, double scaleFactor, boolean isHeadless) {
        Driver.setUpChromeDriver(scaleFactor, isHeadless);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(durationOfSeconds));
    }

    public static void openUrl(String url){
        Driver.getDriver().get(url);
    }

    public static void closeWindow(){
        Driver.closeDriver();
    }

    public static void quitDriver(){
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator){
        return Driver.getDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator){
        return Driver.getDriver().findElements(locator);
    }

    public static void addText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public static String getText(By locator){
        return getElement(locator).getText();
    }

    public static void clickOnElement(By locator){
        getElement(locator).click();
    }

    public static boolean checkIfElementSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public static boolean checkIfElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static List<Boolean> checkIfElementsAreSelected(By locator) {
        List<Boolean> statuses = new ArrayList<>();

        for (WebElement element : getElements(locator)) {
            statuses.add(element.isSelected());
        }

        return statuses;
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void waitForElementOnAttributeValueChange(By locator, String attributeName, String valueContains) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(locator, attributeName, valueContains));
    }

    public static void waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static boolean checkIfElementVisible(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator, int seconds) {
        boolean isVisible;
        int duration = 0;

        do {
            try {
                Thread.sleep(500);
                getElement(locator).isDisplayed();
                isVisible = true;
            } catch (NoSuchElementException e) {
                isVisible = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
            duration++;
        } while (!isVisible || duration / 2 >= seconds);

        return isVisible;
    }

    public static void doubleClickOnElementByActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
//                .moveToElement(getElement(locator))
                .doubleClick(getElement(locator))
                .perform();
    }

    public static void scrollWindowByActions() {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .scrollByAmount(0, 1000)
                .perform();
    }

    public static void rightClickOnElementByActions(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions
                .contextClick(getElement(locator))
                .perform();
    }

    public static void clickOnAcceptOfAlertBox() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void waitForAlertIsPresent(int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void addTextIntoAlertBox(String message) {
        Driver.getDriver().switchTo().alert().sendKeys(message);
    }
    public static void clickOnElementAction(By locator){
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("https://testingbot.com");

        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).click().build().perform();

        driver.quit();
    }
}
