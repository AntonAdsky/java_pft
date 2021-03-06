package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
   private final WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

        driver.findElement(By.linkText("add new")).click();
    }
}
