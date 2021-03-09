package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextPage {
    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(box)).perform();
    }

    public String getText(){
        return driver.switchTo().alert().getText();
    }

    public void clickOKButton(){
        driver.switchTo().alert().accept();
    }
}
