package home;

import Home.HomePage;
import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanLoginSuccessfully() {
        driver.get("https://www.google.com/gmail");
        HomePage hp = new HomePage();
        hp.logIn("myautotestmail2020@gmail.com", "test2055");
    }

    @Test
    public void testUserCanCheckInbox() {
        driver.get("https://www.google.com/gmail");
        HomePage hp1 = new HomePage();
        hp1.logIn("myautotestmail2020@gmail.com", "test2055");
        hp1.checkInbox();
    }
}

