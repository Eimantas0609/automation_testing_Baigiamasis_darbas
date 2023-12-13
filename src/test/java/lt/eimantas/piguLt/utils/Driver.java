package lt.eimantas.piguLt.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
//        option.addArguments("--remote-allow-origins=*");
//        option.addArguments("--headless=new");
        option.addArguments("--start-maximized");
//        option.addArguments("--window-size=2000,2000");
//        option.addArguments("--window-position=4000,0");
        option.addArguments("--force-device-scale-factor=0.70");

        driver.set(new ChromeDriver(option));


    }

    public static void setUpChromeDriver(double scaleFactor, boolean isHeadless) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions option = new ChromeOptions();
        if (isHeadless) option.addArguments("--headless=new");
        option.addArguments("--start-maximized");
        option.addArguments("--force-device-scale-factor=" + scaleFactor);

        driver.set(new ChromeDriver(option));
    }


    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void closeDriver() {
        driver.get().close();
    }

    public static void quitDriver() {
//        driver.quit();
        driver.get().quit();
        driver.remove();
    }

}
