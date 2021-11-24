package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;


public class GroupDeleteClass extends TestBase {
    
    @Test
    public void deleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup("test2");
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
