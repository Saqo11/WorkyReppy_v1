package Test;

import BasePages.TaskBase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TaskPage extends MainPage{



    @BeforeEach
    public void mainTask(){
        loginbase.goTo()
                .login("utest202010@gmail.com")
                .pass("12345678" )
                .chooseTask()
                .isCorrect();


        taskBase    .goTO()
                .ResetDailyReport()
                .removeElements()
                .removeElements2();



    }







    @Test
    public  void TuskPlay ()  {
        taskBase
                .addTask("TestTusk113")
                .play();



    }@Test
    public  void ProjectTag () throws InterruptedException {

        taskBase
                .addTask("A>B>S123!")
                .ChooseProjectTags()
                .play();


    }@Test
    public  void ProjectTags (){

        taskBase
                .addTask("A>B>S123!")
                .ChooseSeveralTags()
                .play();


    }@Test
    public  void AddATag (){

        taskBase   .AddTag();


    }@Test
    public  void  AddATagName (){

        taskBase   .AddTag()
                .AddTagName("TestTag");

    }@Test
    public  void  ManualMode () throws InterruptedException {

        taskBase .addTask("TestTusk113")
                .ManualClock();




    }@Test
    public  void  RunTask () throws InterruptedException {

        taskBase .addTask("TestTusk113")
                //.ChooseProjectTags()
                .ManualClock();



    }@Test
    public  void   dailyReportPopup () throws InterruptedException {

        taskBase  .addTask("TestTusk113")
                .ChooseProjectTags()
                .ManualClock()

                .dalilyReportButton();



    }@Test
    public  void   dailyReportPopupValidData () throws InterruptedException {

        taskBase  .addTask("TestTusk113")
                .ChooseProjectTags()
                .ManualClock()
                .dalilyReportValid("12", "21");





    }@Test
    public  void TheTasksTablePlayButton () {
        taskBase
                .addTask("TestTusk115")
                .play()
                .TaskTablePlay();

    }@Test
    public  void TaskTableHover () {
        taskBase
                .addTask("TestTusk115")
                .play()
                .TheTaskTableMenu();
    }@Test
    public  void ClickViewButton () {
        taskBase
                .addTask("TestTusk115")
                .play()
                .TheTaskTableMenu()
                .viewButton();
    }@Test
    public  void ClickViewButtonChangeName () {
        taskBase
                .addTask("TestTusk115")
                .play()
                .TheTaskTableMenu()
                .viewButton()
                .changeNameView("TestTusk288");
    }@Test
    public  void ClickViewButtonChangeTime () {
        taskBase
                .addTask("TestTusk115")
                .play()
                .TheTaskTableMenu()
                .viewButton()
                .buttonChangeTime("0000","0502");

    }@Test
    public void ClickViewButtonChangeProjectTag  () throws InterruptedException {

        taskBase
                .addTask("TestTusk115")
                .play()
                .TheTaskTableMenu()
                .viewButton()
                .viewChangeProjectTag();


    }@Test
    public  void ClickViewButtonTellUsMore () {
        taskBase
                .addTask("TestTusk115")
                .play()
                .TheTaskTableMenu()
                .viewButton()
                .tellUsMore("sdfsdsfsfsfsfsfsfsfsf");

    }@Test
    public  void ClickViewButtonWED () {
        taskBase
                .addTask("TestTusk115")
                .play()
                .TheTaskTableMenu()
                .viewButton()
                .writeCommentEditDelete("efefefefe");

    } @Test
    public  void   dailyyReportPopup () throws InterruptedException {

        taskBase .addTask("TestTusk113")
                .ManualClock( )
                .dalilyReportButton();



    }@Test
    public  void tuskNameButton() throws InterruptedException{

        taskBase .addTask("TestTusk113")
                .ManualClock( )
                .tuskNameClickButton();





    }@Test
    public  void  groupTusk () throws InterruptedException{
        taskBase
                .groupMultipleTusk("TestTusk113");






    }







}











