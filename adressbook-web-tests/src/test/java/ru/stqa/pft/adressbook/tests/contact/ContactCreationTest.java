package ru.stqa.pft.adressbook.tests.contact;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;
import ru.stqa.pft.adressbook.tests.TestBase;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoCreationContactPage();
        ContactData contact = new ContactData(
                "Name",
                "Family",
                "NickName",
                "Title",
                "Company",
                "Address",
                "hometel123",
                "mobtel324",
                "worktel333",
                "email@dot.com",
                "www.homepage.test",
                "1",
                "September",
                "2000",
                "test3"
        );
        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactCreation();
    }
}
