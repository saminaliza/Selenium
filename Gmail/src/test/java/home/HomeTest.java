package home;

import Home.HomePage;
import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanLoginSuccessfully(){
        driver.get("https://accounts.google.com/signin");
        HomePage hp = new HomePage();
        hp.logIn("myautotestmail2020@gmail.com","test2055");
    }
}
