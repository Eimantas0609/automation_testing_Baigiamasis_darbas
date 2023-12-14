package lt.eimantas.piguLt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class login {

        public static By writeEmail = By.xpath(
                "//input[@type='email']"
        );
        public static By writePassword = By.xpath(
                "//input[@type='password']"
        );
        public static By closeAlert = By.xpath(
                "//button[@id='close_btn_alert']"
        );
        public static By clickButtonPrisijungti = By.xpath(
                "//input[@type='submit' and @value='Prisijungti']"
        );
        public static By ClickOnUserButton = By.xpath(
                "//div[@id='user-icone']"
        );
        public static By readUserName = By.xpath(
                "//div[@class='user-name']"
        );
        public static By readWarning = By.xpath(
                "//div[@class='info-message alert']"
        );
    }

}
