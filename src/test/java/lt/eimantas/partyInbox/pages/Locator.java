package lt.eimantas.partyInbox.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Search {

        public static By writeTheDesiredItem = By.xpath("//input[@id='search-input']");
        public static By clickFind = By.xpath("//button[@id='search-icone']");
        public static By findedItem = By.xpath("//div[@id='load_info']/div[1]/div/a[2]");
    }

    public static class Login {

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
        public static By clickButtonAtsijungti = By.xpath(
                "//a[@title='Atsijungti']"
        );
    }

}
