package base;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    //create a WebDriver object
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        //what Selenium will look for; second argument is the location of the WebDriver file
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate WebDriver object
        driver = new ChromeDriver();

        //launching the browser
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        //change window size
        driver.manage().window().maximize();

//        set it to specific size
//        driver.manage().window().setSize(new Dimension(400, 806));

//        checking and printing
        System.out.println(driver.getTitle());

//        closing the window
    }
//        @AfterClass
//        public void tearDown(){
//            driver.quit();
//        }

        //exercise
//        WebElement shiftingLink = driver.findElement(By.linkText("Shifting Content"));
//        shiftingLink.click();
//
//        WebElement exampleOne = driver.findElement(By.linkText("Example 1: Menu Element"));
//        exampleOne.click();
//
//        List<WebElement> linksOne = driver.findElements(By.tagName("li"));
//        System.out.println(linksOne.size()); //yay!


}

