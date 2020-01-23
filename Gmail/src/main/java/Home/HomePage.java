package Home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonAPI {

    public void logIn(String email, String password) {
        driver.findElement(By.id("identifierId")).sendKeys(email);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        driver.findElement(By.name("password")).sendKeys(password);
        //driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); //it worked too, how?
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
    }

    public void checkInbox() {
        driver.findElement(By.cssSelector(".Inbox")).click();
    }

    public void checkSentMail() {
        driver.findElement(By.xpath("//*[@id=\":3z\"]/div/div[2]/span/a")).click();
    }
}
