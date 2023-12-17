package lt.eimantas.partyInbox.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Cart {

        public static By productCatalog = By.xpath(
                "//button[@class='menu-burger-desktop']"
        );
        public static By category = By.xpath(
                "//a[@title='Karnavalinė atributika']"
        );
        public static By categoryKind = By.xpath(
                "//li[@class='have-sub']//a[@title='Karnavaliniai kostiumai ir apsiaustai']"
        );
        public static By selection = By.xpath(
                "//div[@id='load_info']/div[1]/div/a"
        );
        public static By purchase = By.xpath(
                "//input[@value='Į krepšelį']"
        );
        public static By messageAboutCart = By.xpath(
                "//div[@class='info-message alert']"
        );
    }

    public static class Search {

        public static By inputTheDesiredItem = By.xpath(
                "//input[@id='search-input']"
        );
        public static By signFind = By.xpath(
                "//button[@id='search-icone']"
        );
        public static By nameOfItem = By.xpath(
                "//div[@id='load_info']/div[1]/div/a[2]"
        );
    }

    public static class Login {

        public static By inputEmail = By.xpath(
                "//input[@type='email']"
        );
        public static By inputPassword = By.xpath(
                "//input[@type='password']"
        );
        public static By alert = By.xpath(
                "//button[@id='close_btn_alert']"
        );
        public static By buttonPrisijungti = By.xpath(
                "//input[@type='submit' and @value='Prisijungti']"
        );
        public static By buttonUser = By.xpath(
                "//div[@id='user-icone']"
        );
        public static By userName = By.xpath(
                "//div[@class='user-name']"
        );
        public static By greeting = By.xpath(
                "//div[@class='info-message alert']"
        );
        public static By buttonAtsijungti = By.xpath(
                "//a[@title='Atsijungti']"
        );

        public static By noteChangeAccountInfo = By.xpath(
                "//div[@class='user-menu']//a[@title='Keisti paskyros informaciją']"
        );
        public static By inputNewPassword = By.xpath(
                "//input[@type='password' and @name='password']"
        );

        public static By inputRepeatNewPassword = By.xpath(
                "//input[@type='password' and @name='confirm']"
        );
        public static By submission = By.xpath(
                "//input[@value='Išsaugoti']"
        );

        public static By messageAboutChanges = By.xpath(
                "//div[@class='info-message alert']"
        );
    }

}
