package lt.eimantas.partyInbox.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Cart {

        public static By clickOnProductCatalog = By.xpath(
                "//button[@class='menu-burger-desktop']"
        );
        public static By chooseCategory = By.xpath(
                "//a[@title='Karnavalinė atributika']"
        );
        public static By chooseCategoryKind = By.xpath(
                "//li[@class='have-sub']//a[@title='Karnavaliniai kostiumai ir apsiaustai']"
        );
        public static By chooseWhatToBuy = By.xpath("//div[@id='load_info']/div[1]/div/a");
        public static By addItemToCart = By.xpath("//input[@value='Į krepšelį']");
        public static By clickOnCartSign = By.xpath("//button[@id='chart-bt']");
        public static By viewCart = By.xpath("//a[@title='Peržiūrėti krepšelį']");
        public static By checkOrAppearedButtonToPay = By.xpath("//a[@title='Atsiskaitymas']");
    }
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
