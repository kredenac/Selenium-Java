package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    private By emailField = By.id("email");
    private By retrieveBtn = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public ErrorPage clickRetrieveButton(){
        driver.findElement(retrieveBtn).click();
        return new ErrorPage(driver);
    }

    public ErrorPage retrievePassword(String email){
        setEmail(email);
        return clickRetrieveButton();
    }
}
