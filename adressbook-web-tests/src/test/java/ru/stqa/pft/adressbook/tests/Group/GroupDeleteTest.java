package ru.stqa.pft.adressbook.tests.Group;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.tests.TestBase;


public class GroupDeleteTest extends TestBase {
    
    @Test
    public void deleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup("test2");
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
