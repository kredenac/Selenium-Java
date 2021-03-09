package forgotPass;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ErrorPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class forgotPasswordTest extends BaseTests {

    @Test
    public void testRetrievePass(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        // tip imePromenljive = nesto;
        var errorPage = forgotPasswordPage.clickRetrieveButton();
        var errorMsg = errorPage.getErrorMsg();
        assertEquals(errorMsg,"Internal Server Error");
    }
//    public void testRetrievePassword(){
//        var forgotPasswordPage = homePage.clickForgotPassword();
//        var errorPage = forgotPasswordPage.retrievePassword("tau@example.com");
//        assertEquals(errorPage.getErrorMsg(), "Internal Server Error");
//    }

}
