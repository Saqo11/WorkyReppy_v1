package BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Time;
import java.util.List;

public class TaskBase extends  BasePage{
    String SITE_URL = "http://worky-reppy-dev.esterox.org/en/tasks";

    public TaskBase(WebDriver driver) {
        super(driver);
    }
    public TaskBase goTO () {
        driver.get(SITE_URL);
        return this;

    }
    public TaskBase removeElements ()  {

        try {
            if (driver.findElement(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[1]/div[1]/div/div/div[3]/div/div/button")).isDisplayed()) {
                click(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[1]/div[1]/div/div/div[3]/div/div/button"));


                List<WebElement> Tusks = driver.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));

                for (int i = 0; i < Tusks.size(); i++) {


                    Thread.sleep(200);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]"))).build().perform();

                    driver.findElement(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[5]/div/div[2]/span[2]")).click();
                    Thread.sleep(2000);

                    driver.findElement(By.xpath("//button[text()='Yes']")).click();
                    Thread.sleep(1000);


                }




            }





        }


        catch (Exception e){



        }



        return  this;

    }public TaskBase removeElements2 ()  {

        try {



            List<WebElement> Tusks = driver.findElements(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));

            for (int i = 0; i < Tusks.size(); i++) {


                Thread.sleep(200);
                Actions actions = new Actions(driver);
                actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]"))).build().perform();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[2]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[5]/div/div[2]/span[2]")).click();
                Thread.sleep(300);
                driver.findElement(By.xpath("//button[@class='ant-btn app-btn primary-btn md ant-btn-round']")).click();
                Thread.sleep(2000);




            }










        }


        catch (Exception e){




        }



        return  this;

    }
    public TaskBase addTask(String name){

        driver.findElement(By.xpath("//input[@class='ant-input ant-select-search__field']")).sendKeys(name);


        return  this;


    }

    public  TaskBase play()   {



        click(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[1]/div[1]/div/div/div[3]/div/button"));
        isElementDisplayed(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[1]/div[1]/div/div/div[3]/div/div/button/span[1]"));

        return this;
    }


    public   TaskBase  ChooseProjectTags() throws InterruptedException {
        click(By.xpath("//span[text()='Add project']"));
        //click(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[1]/div/div/div/div[2]/div/div/ul/div/li[3]/span[2]"));
        click(By.xpath("//span[text()=\"internship\"]"));
        //isElementDisplayed(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[1]/div/div/div/div[2]/div/div[2]/ul/div/li[19]/span[2]"));
        Thread.sleep(3000);

        click(By.xpath("//span[text()='content web']"));

        return  this;


    }
    public   TaskBase  ChooseSeveralTags(){
        click(By.xpath("//span[text()='Add project']"));
        click(By.xpath("//span[text()=\"internship\"]"));
        click(By.xpath("//span[text()=\"hj\"]"));
        //isElementDisplayed(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[1]/div/div/div/div[2]/div/div[2]/ul/div/li[19]/span[2]"));
        click(By.xpath("//span[text()='NewProject']"));
       // click(By.xpath("//div[@class='tagsProjectsWrapper___2auP8']"));
        //isElementDisplayed(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[1]/div/div/div/div[2]/div/div[2]/ul/div/li[24]/span[2]"));
        //click(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[1]/div/div/div/div[2]/div/div[2]/ul/div/li[24]/span[2]"));

        return  this;


    }

    public   TaskBase AddTag (){
        click(By.xpath("//div/span[@class='task-bar-text___2VbLx']"));
        click(By.xpath("//button[@class='ant-btn addTagBtn___A4RaI ant-btn-link']"));
        isElementDisplayed(By.xpath("//div[@class='ant-modal-content']"));

        return this;
    }
    public   TaskBase AddTagName (String TestTag) throws InterruptedException {
        click(By.xpath("//div/span[@class='task-bar-text___2VbLx']"));
        click(By.xpath("//button[@class='ant-btn addTagBtn___3wla9 ant-btn-link']"));
        driver.findElement(By.xpath("//input[@placeholder='Tag name...']")).sendKeys(TestTag);
        click(By.xpath("//button[text()='Save']"));
        click(By.xpath("//span[@class='colorBoxCheckmark___2mKEU']"));
        Thread.sleep(6000);
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("//span[@class=\"close-icon\"]"))).build().perform();
        click(By.xpath("//span[@class=\"close-icon\"]"));
        click(By.xpath("//div/span[@class='task-bar-text___2VbLx']"));
        click(By.xpath("//span[text()='TestTag']"));


        return this;
    }
    public   TaskBase ManualClock   ( ) throws InterruptedException {
        click(By.xpath("//div[@class='ant-col gutter-row col-animate tasksModeSection ant-col-lg-5']"));
        Thread.sleep(3000);
        click(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[1]/div[1]/div/div/div[4]/div/div[1]/span[2]/span"));
        Thread.sleep(3000);
        click(By.xpath("//li[text()='04']"));

//        //click(By.xpath("//div[@class='ant-time-picker-panel-select'][2]//li[text()='02']"));
//        Thread.sleep(3000);
//        click(By.xpath("//span[@class='timePickerWrapper___1vw78'][2]"));
//        Thread.sleep(3000);
//        click(By.xpath("//div[@class='ant-time-picker-panel-select'][1]//li[text()='05']"));
//
//        //click(By.xpath("//div[@class='ant-time-picker-panel-select'][2]//li[text()='03']"));
//        Thread.sleep(3000);
        click(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div/div[1]/div[1]/div/div/div[4]/div/div[2]/button[1]"));


        return this;
    }

    public  TaskBase dalilyReportButton(){
        click(By.xpath("//button[@class='ant-btn secondaryBtn___LZHjR']"));
        click(By.xpath("//button[@class='ant-btn modalSubmitBtn___QJig1 ant-btn-primary ant-btn-round']"));
        isElementDisplayed(By.xpath("//button[text()='Reset Daily Report']"));
        click(By.xpath("//div[@class='ant-col flexRow___31Z2Z']"));

        return this;

    }
    public  TaskBase dalilyReportValid(String horse,  String minuts) throws InterruptedException {
        Thread.sleep(3000);

        click(By.xpath("//button[@class='ant-btn app-btn primary-btn-outline md']"));
        Thread.sleep(3000);

        click(By.xpath("//span[@class='plusIcon___2Y6Js']"));
        Thread.sleep(3000);

        click(By.xpath("//div[@class='project___1Wlom ant-select ant-select-enabled']"));
        click(By.xpath("//li[text()='content web']"));
        driver.findElement(By.xpath("//input[@class='hour___3bjxu' ]")).sendKeys(horse);
        driver.findElement(By.xpath("//input[@class='minute___3UX36' ]")).sendKeys(minuts);

        click(By.xpath("//button[text()='Submit']"));
        isElementDisplayed(By.xpath("//button[text()='RESET DAILY REPORT']"));


        return this;

    }

    public  TaskBase TaskTablePlay(){
        isElementDisplayed(By.xpath("//span[@class='iconWrapper___at7Wi']"));
        click(By.xpath("//span[@class='iconWrapper___at7Wi']"));
        isElementDisplayed(By.xpath("//button[@class='ant-btn sectionWrapper___1Ikpf ant-btn-link timerAnim0-enter-done']"));
        click(By.xpath("//button[@class='ant-btn play-btn']"));
        isElementDisplayed(By.xpath("//span[@class='iconWrapper___at7Wi']"));



        return  this;
    }

    public  TaskBase TheTaskTableMenu(){
        isElementDisplayed(By.xpath("//span[@class='iconWrapper___at7Wi']"));
        click(By.xpath("//span[@class='iconWrapper___at7Wi']"));
        isElementDisplayed(By.xpath("//button[@class='ant-btn play-btn']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[4]/div[1]/div/div/div/div/div/div/table/tbody/tr[1]"))).build().perform();
        //isElementDisplayed(By.xpath("//span[@class='icon-with-bg']"));


        return  this;

    }
    public TaskBase viewButton (){
        click(By.xpath("//span[@class='icon-with-bg'][1]"));
        isElementDisplayed(By.xpath("//div[@class='ant-modal-content']"));
        return this;

    }


    public  TaskBase changeNameView(String nameView){
        clear(By.xpath("//input[@class='ant-input taskSect___COJ84']"));
        driver.findElement(By.xpath("//input[@class='ant-input taskSect___COJ84']")).sendKeys(nameView);
        click(By.xpath("//button[text()='Save']"));
        isElementDisplayed(By.xpath("//tr[@class='ant-table-row ant-table-row-level-0']"));

        return this;

    }

    public    TaskBase  buttonChangeTime(String timer, String timerr ){
        click(By.xpath("//span[@class='ant-time-picker modalTimePicker1___3JrhM']"));
        clear(By.xpath("//input[@class='ant-time-picker-panel-input']"));
        driver.findElement(By.xpath("//input[@class='ant-time-picker-panel-input']")).sendKeys(timer);
        click(By.xpath("//span[@class='ant-time-picker modalTimePicker2___gge98']"));
        clear(By.xpath("//input[@class='ant-time-picker-panel-input']"));
        driver.findElement(By.xpath("//input[@class='ant-time-picker-panel-input']")).sendKeys(timerr);
        click(By.xpath("//button[text()='Save']"));
        isElementDisplayed(By.xpath("//button[@class='ant-btn play-btn']"));


        return this;
    }

    public  TaskBase viewChangeProjectTag () throws InterruptedException {
        click(By.xpath("//span[@class='projectName___XDIry']"));
        Thread.sleep(2000);

        click(By.xpath("//span[text()='FortestDoesntdelete']"));


        click(By.xpath("//span[@class='projectName___XDIry']"));
        click(By.xpath("//div//li//span[text()='Iplanner']"));
        click(By.xpath("//button[text()='Save']"));
        isElementDisplayed(By.xpath("//button[@class='ant-btn play-btn']"));


        return this;

    }
    public TaskBase tellUsMore(String more){
        driver.findElement(By.xpath("//textarea[@class='ant-input textDescription___2PHDV']")).sendKeys(more);
        click(By.xpath("//button[text()='Save']"));
        isElementDisplayed(By.xpath("//button[@class='ant-btn play-btn']"));



        return this;
    }
    public  TaskBase    writeCommentEditDelete (String write){

        driver.findElement(By.xpath("//textarea[@class='ant-input textComment___28cRf']")).sendKeys(write);
        click(By.xpath("//button[@class='ant-btn commentSectBtn___ses1D ant-btn-link'][1]"));
        isElementDisplayed(By.xpath("//span[text()='Reply']"));
        click(By.xpath("//div[@class='editDeleteSect___3nMmv']//div//button[@class='ant-btn commentSectBtn___ses1D ant-btn-link'][1]"));
        click(By.xpath("//div[@class='commentSectLeftSideBtns___1xUPM']//button[@class='ant-btn commentSectBtn___ses1D ant-btn-link'][1]"));
        clear(By.xpath("//textarea[text()='efefefefe']"));
        click(By.xpath("//div[@class='commentSectBtnWrapper___1hSZB']//button[@class='ant-btn commentSectBtn___ses1D ant-btn-link'][1]"));
        click(By.xpath("//div[@class='commentSectLeftSideBtns___1xUPM']//button[@class='ant-btn commentSectBtn___ses1D ant-btn-link'][2]"));
        click(By.xpath("//button[@class='popoverConfirmBtn___2bJ9j']"));
        click(By.xpath("//button[text()='Save']"));





        return this;
    }
    public  TaskBase tuskNameClickButton(){
        isElementDisplayed(By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']"));
        click(By.xpath("//td[@class='ant-table-row-cell-ellipsis ant-table-row-cell-break-word']"));
        isElementDisplayed(By.xpath("//textarea[@class='ant-input textDescription___2PHDV']"));


        return  this;
    }



    public  TaskBase groupMultipleTusk (String name) throws InterruptedException {

        for (int i=0; i<5; i++){

            driver.findElement(By.xpath("//input[@class='ant-input ant-select-search__field']")).sendKeys(name);
            Thread.sleep(5000);
            click(By.xpath("//*[@id=\"primaryLayout\"]/main/div/div[1]/div/div/div/div[3]/button"));
            Thread.sleep(5000);
            click(By.xpath("//span[@class='iconWrapper___at7Wi']"));



        }
        click(By.xpath("//label[@class='groupingBtn___1622p ant-radio-button-wrapper']"));
        click(By.xpath("//span[@class='expanded-icon']"));


        return this;
    }

    public  TaskBase  ResetDailyReport () {

        try {

            if (driver.findElement(By.xpath("//button[text()='Reset Daily Report']")).isDisplayed()){
                click(By.xpath("//button[text()='Reset Daily Report']"));




            }

        }
        catch (Exception e){


        }

        return  this;
    }

}


