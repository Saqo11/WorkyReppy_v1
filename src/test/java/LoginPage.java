import org.junit.jupiter.api.Test;

public class LoginPage extends MainPage {

    @Test
    public void Positive ()  {
        loginbase.goTo()
                .login("sargis.harutyunyan@esterox.am")
                .pass("12345678")
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
                .login("blblbl@mail.com")
                .chooseTask()
                .loginMessage();


    }
    @Test

    public void NegativeEmail (){
        loginbase.goTo()
                .pass("1234dddssssd5678" )
                .chooseTask()
                .emailMessage();


    }




}
