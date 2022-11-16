package org.example;
// importing testng annotations for test method
import org.testng.annotations.Test;


// extends shows inheritance concept that TestSuit(child class) and BaseTest (Parent class)
public class TestSuit extends BaseTest {
    //creating object of homepage
    Homepage homepage = new Homepage();
    //creating object of register page
    RegisterPage registerPage = new RegisterPage();
    //creating object for registerResultPage
    RegisterResultPage registerResultPage = new RegisterResultPage();


    //creating test method through testng
    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully(){
        //click on register button
      homepage.verifyRegisterButtonPresent();
      //verify user is on register page
      registerPage.verifyUserIsOnRegistrationPage();
      //enter registration details
      registerPage.enterRegistrationDetails();
      //verify user register successfully
      registerResultPage.verifyRegisterResult();
    }
}
