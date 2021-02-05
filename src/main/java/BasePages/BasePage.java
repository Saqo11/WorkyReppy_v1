package  BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 25);


    }

    //wait Method

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));

    }


    //Click Method

    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();


    }
    // Displayed method

    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);

        assertTrue(driver.findElement(elementBy).isDisplayed());


    }

    // mouseHoverEfect

    public void hover(By elementBy) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(elementBy)).build().perform();

    }

//sendKeys
//    public  void sendKeys(By elementBy){
//        waitVisibility(elementBy);
//        driver.findElement(elementBy).sendKeys();
//
//
//    }


// Clear method

    public  void  clear (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();





    }

}
