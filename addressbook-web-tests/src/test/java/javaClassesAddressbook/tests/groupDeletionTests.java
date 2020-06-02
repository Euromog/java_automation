package javaClassesAddressbook.tests;

import org.testng.annotations.Test;

public class groupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }


}
