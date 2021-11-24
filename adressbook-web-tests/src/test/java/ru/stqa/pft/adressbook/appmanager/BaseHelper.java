package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseHelper {
    protected final WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void dropdown(By locator, String value) {
        //driver.findElement(locator).click();
        WebElement dropdown = driver.findElement(locator);
        dropdown.findElement(By.xpath("//option[. = '" + value + "']")).click();
    }

    public void submitAlert () {
        driver.switchTo().alert().accept();
    }
}
