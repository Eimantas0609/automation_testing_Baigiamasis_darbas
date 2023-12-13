package lt.eimantas.piguLt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class login {

//        public static By agreeCookies =By.xpath(
//                "//button[@class='button border right']"
//        );
        public static By writeEmail = By.xpath(
                "//input[@type='email']"
        );
        public static By writePassword = By.xpath(
                "//input[@type='password']"
        );
        public static By closeAlert = By.xpath("//button[@id='close_btn_alert']");
        public static By clickButtonPrisijungti = By.xpath(
                "//input[@type='submit' and @value='Prisijungti']"
        );
        public static By ClickOnUserButton = By.xpath("//div[@id='user-icone']");
            public static By getUserName = By.xpath("//div[@class='user-name']");
    }

}
