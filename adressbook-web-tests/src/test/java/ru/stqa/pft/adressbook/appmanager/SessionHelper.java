package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String login, String pass) {
        type(By.name("user"), login);
        type(By.name("pass"), pass);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
}
