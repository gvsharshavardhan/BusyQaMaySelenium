package testleafTests;

import org.testng.annotations.Test;
import testLeaf.EditPage;

public class EditPageTest extends BaseTest {

    EditPage editPage = new EditPage();

    @Test
    public void inputFieldTest() {
        setUp();
        editPage.editPageActions();
        tearDown();
    }

}
