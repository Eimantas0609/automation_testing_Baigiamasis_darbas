package lt.eimantas.partyInbox.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();

        option.addArguments("--start-maximized");
        option.addArguments("--force-device-scale-factor=0.70");

        driver.set(new ChromeDriver(option));
    }
    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        driver.get().quit();
        driver.remove();
    }

}
