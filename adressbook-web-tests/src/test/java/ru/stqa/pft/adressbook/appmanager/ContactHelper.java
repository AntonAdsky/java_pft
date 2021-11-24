package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactHelper extends BaseHelper {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomeTel());
        type(By.name("mobile"), contactData.getMobileTel());
        type(By.name("work"), contactData.getWorkTel());
        type(By.name("email"), contactData.getEmail());
        type(By.name("homepage"), contactData.getHomePage());
        dropdown(By.name("bday"), contactData.getBday());
        dropdown(By.name("bmonth"), contactData.getBmonth());
        type(By.name("byear"), contactData.getByear());
        dropdown(By.name("new_group"), contactData.getGroup());

    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

}
