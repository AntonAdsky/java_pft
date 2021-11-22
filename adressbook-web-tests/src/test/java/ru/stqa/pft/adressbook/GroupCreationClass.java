package ru.stqa.pft.adressbook;

import org.testng.annotations.Test;


public class GroupCreationClass extends TestBase{

    @Test
    public void testAddGroup() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test2", "test2", "test2"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
