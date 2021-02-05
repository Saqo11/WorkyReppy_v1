package Test;


import org.junit.jupiter.api.Test;

public class LoginPage extends MainPage {

    @Test
    public void Positive ()  {
        loginbase.goTo()
                .login("utest202010@gmail.com", "test202010@gmail.com")
                .pass("12345678","2345678" )
                .chooseTask()
                .isCorrect();

    }
    @Test

    public void Negative (){
        loginbase.goTo()
                .chooseTask()
                .emailMessage()
                .loginMessage();


    }
    @Test

    public void NegativePass (){
        loginbase.goTo()
                .login("blblbl@mail.com","blblbl@mail.com")
                .chooseTask()
                .loginMessage();


    }
    @Test

    public void NegativeEmail (){
        loginbase.goTo()
                .pass("1234dddssssd5678", "62626262" )
                .chooseTask()
                .emailMessage();


    }




}
