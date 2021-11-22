package ru.stqa.pft.adressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GroupCreationClass {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\soft\\webDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook/group.php");
        login("admin", "secret");
    }

    private void login(String login, String pass) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testAddGroup() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test2", "test2", "test2"));
        submitGroupCreation();
        returnToGroupPage();
    }

    private void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    private void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    private void initGroupCreation() {
        driver.findElement(By.name("group_name")).click();
    }

    private void gotoGroupPage() {
        driver.findElement(By.name("new")).click();
    }
}
