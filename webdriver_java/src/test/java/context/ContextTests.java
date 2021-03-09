package context;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextPage;

import static org.testng.Assert.assertEquals;

public class ContextTests extends BaseTests {
    @Test

    public void testRightClick(){
        var contextPage = homePage.clickContextPage();
        contextPage.clickBox();
        String msg = contextPage.getText();
        contextPage.clickOKButton();
        assertEquals(msg, "You selected a context menu", "Error");
    }


}
