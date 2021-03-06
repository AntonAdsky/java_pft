package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    protected WebDriver driver;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private ContactHelper contactHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "D:\\soft\\webDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook");
        groupHelper = new GroupHelper(driver);
        contactHelper = new ContactHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        SessionHelper sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return  contactHelper;
    }
}
