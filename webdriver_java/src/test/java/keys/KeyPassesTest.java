package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPassesTest extends BaseTests {
    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPressesPage();
        keyPage.enterText("A" + Keys.BACK_SPACE);

        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "Result incorrect");
    }

    @Test
    public void testExclamationPoint(){
       var keyPage = homePage.clickKeyPressesPage();
       keyPage.enterExclamationPoint();
    }
}
