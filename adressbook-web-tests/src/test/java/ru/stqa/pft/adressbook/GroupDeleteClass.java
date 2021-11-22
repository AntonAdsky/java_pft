package ru.stqa.pft.adressbook;

import org.testng.annotations.Test;


public class GroupDeleteClass extends TestBase {
    
    @Test
    public void deleteGroup() {
        gotoGroupPage();
        selectGroup("test2");
        deleteSelectedGroup();
        returnToGroupPage();
    }

}
