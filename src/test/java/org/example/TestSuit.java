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
    //creating object for electronics page
    ElectronicsPage electronicsPage = new ElectronicsPage();
    //creating object for camera and photo page
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    // creating object for details button page
    NewsDetailsButton detailsButton = new NewsDetailsButton();
    // creating object for comment result page
    NewsCommentResult commentResult = new NewsCommentResult();
    // creating object for facebook page
    Facebook facebook = new Facebook();
    // creating object for email a friend page
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();

    //creating test method through testng
    @Test
    public void verifyEmailAFriend(){
        //verifying user is on register page
        registerPage.verifyUserIsOnRegistrationPage();
        //Filling all the details at register page
        registerPage.enterRegistrationDetails();
        //sending details to friend
        emailAFriend.emailDetails();
        //verifying result
        emailAFriendResult.verifyEmailMessageIsSentSuccessfully();

    }
    //creating test method through testng
    @Test
    //verifying facebook page
    public void verifyFacebookPage(){
        facebook.faceBookPage();
    }
    //creating test method through testng
    @Test
    //verifying whatever currency select price display according to that
    public void verifyCurrency(){
        homepage.selectCurrency();
    }
    //creating test method through testng
    @Test
    //checking alert message
    public void verifyAlertMessage(){
        homepage.voteAlert();
    }
    //creating test method through testng
    @Test
    public void verifyDetailsButton(){
        //click details button
        detailsButton.detailsButton();
        //verify comment should comes at last
        commentResult.verifyMessageIsSentSuccessfully();
    }


    @Test
    public void verifyEachProductHasName(){
     homepage.navigateToElectronicPage();
     electronicsPage.navigateToCameraPage();
     cameraAndPhotoPage.getProductName();

    }

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
    //  registerResultPage.verifyRegisterResult();
    }
}
