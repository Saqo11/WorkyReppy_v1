package BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class LoginBase extends BasePage{
    String SITE_URL = ("http://worky-reppy-dev.esterox.org/en/login?from=%2Fen%2Ftasks");


    public LoginBase(WebDriver driver) {
        super(driver);
    }
    public LoginBase goTo (){
        driver.get(SITE_URL);

        return this;

    }
    public LoginBase chooseTask  () {
        click(By.xpath("//button[text()='Sign in']"));

        return this;


    }
    public LoginBase isCorrect (){

        isElementDisplayed(By.xpath("//div[text()='TO DO LIST']"));
        return this;

    }


    public LoginBase login (String login )    {

        driver.findElement(By.id("email")).sendKeys(login);
        //driver.findElement(By.id("email")).sendKeys(log);


        return this;

    }

    public LoginBase pass (String pass)  {

        driver.findElement(By.id("password")).sendKeys(pass);
        //driver.findElement(By.id("password")).sendKeys(pas);
        return this;
    }


    public LoginBase emailMessage(){

        isElementDisplayed(By.xpath("//div[text()='Email is required' ]"));
        return this;

    }public LoginBase loginMessage(){

        isElementDisplayed(By.xpath("//div[text()='Password is required' ]"));
        return this;

    }


}
