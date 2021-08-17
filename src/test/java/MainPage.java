import BasePages.LoginBase;
import BasePages.TaskBase;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage {
    WebDriver driver;
    public LoginBase loginbase;
    public TaskBase taskBase;
   // public UserDetailBase userDetailBase;


    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
        loginbase = PageFactory.initElements(driver,LoginBase.class);
        taskBase = PageFactory.initElements(driver,TaskBase.class);
       // userDetailBase = PageFactory.initElements(driver,UserDetailBase.class);

    }

    @AfterEach

    public  void Finish(){
        driver.quit();



    }





}