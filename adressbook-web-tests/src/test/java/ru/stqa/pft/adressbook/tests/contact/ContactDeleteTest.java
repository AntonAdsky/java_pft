package ru.stqa.pft.adressbook.tests.contact;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.tests.TestBase;

public class ContactDeleteTest extends TestBase {

    @Test
    public void testContactDelete() {
        app.getContactHelper().selectContact("Name", "Family");
        app.getContactHelper().submitDeleteContact();
    }
}
