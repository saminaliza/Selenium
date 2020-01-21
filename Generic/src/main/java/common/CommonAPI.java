package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/samin/IdeaProjects/SeleniumAssignment/Generic/src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}
