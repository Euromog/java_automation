package javaClassesAddressbook.tests;

import javaClassesAddressbook.model.GroupData;
import org.testng.annotations.*;


public class groupCreatingTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("javatest3", "javatest4", "javatest5"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
