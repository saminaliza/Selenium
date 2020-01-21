package Home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {

    public void logIn(String email, String password){
        //driver.findElement(By.xpath("//a[@class='h-c-header__nav-li-link']")).click(); //y didn't it work? :(
        driver.findElement(By.id("identifierId")).sendKeys(email);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        driver.findElement(By.name("password")).sendKeys(password);
       // driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); //it worked too, how?
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));  //*[@id="passwordNext"]/span/span
    }
}
