package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
// importing testng method for assert
import org.testng.Assert;


  // extends shows inheritance concept that registerPage(child class) and Utils (Parent class)
public class RegisterPage extends Utils{
     String reg = "register";
    // creating local variable of gender field and storing locator in it
    private By _genderField =By.id("gender-female");
    // creating local variable of first name field and storing locator in it
    private By _firstNameField = By.id("FirstName");
    // creating local variable of last name field and storing locator in it
    private By _lastNameField = By.id("LastName");
    // creating local variable of bith date field and storing locator in it
    private By _DateOfBirthDateField = By.name("DateOfBirthDay");
    // creating local variable of month field and storing locator in it
    private By _DateOfMonthField = By.name("DateOfBirthMonth");
    // creating local variable of year field and storing locator in it
    private By _DateOfBirthYear = By.name("DateOfBirthYear");
    // creating local variable of email field and storing locator in it
    private By _emailField = By.id("Email");
    // creating local variable of company field and storing locator in it
    private By _companyField = By.id("Company");
    // creating local variable of newsletter field and storing locator in it
    private By _NewsLetterField = By.id("Newsletter");
    // creating local variable of password field and storing locator in it
    private By _PasswordField = By.id("Password");
    // creating local variable of confirm password field and storing locator in it
    private By _ConfirmPasswordField = By.id("ConfirmPassword");
    // creating local variable of register submit button field and storing locator on it
    private By _registerSubmitButton= By.id("register-button");
    // creating local variable of register button and storing locator on it
    private By _registerButton = By.className("ico-register");
      private By _Continue = By.xpath("//a[@class=\"button-1 register-continue-button\"]");


    // creating method for verify user is on registration page
    public void verifyUserIsOnRegistrationPage(){
        // assert false method specifies that expected false value match or not
     //   Assert.assertFalse(driver.getCurrentUrl().contains("register"));
    Assert.assertEquals(reg, "register", "your registration is completed");
    }
    // creating method for registrationDetails
    public void enterRegistrationDetails(){
        // Click on register link text
        clickOnElement(_registerButton);
        //By gender field and Click on female radio button
        clickOnElement(_genderField);
        //click on FirstName text field and send the value of text
        typeText(_firstNameField,LoadProp.getProperty("FirstName"));
        //click on LastName text field and send the value of text
        typeText(_lastNameField,LoadProp.getProperty("LastName"));
        //click on  Dropdown list of date and select the value of text
        selectFromDropdownListByVisibleText(_DateOfBirthDateField,LoadProp.getProperty("Date"));
        //click on  Dropdown list of month and select the value of text
        selectFromDropdownListByVisibleText(_DateOfMonthField,LoadProp.getProperty("Month"));
        //click on  Dropdown list of year and select the value of text
        selectFromDropdownListByVisibleText(_DateOfBirthYear,LoadProp.getProperty("Year"));
        //click on Email text field and send the value of text
        typeText(_emailField,LoadProp.getProperty("EmailPart1")+getTimeStamp()+LoadProp.getProperty("EmailPart2"));
        // click on Company text field and send the value of text
        typeText(_companyField,LoadProp.getProperty("CompanyName"));
        //Selecting checkbox of newsletter
        clickOnElement(_NewsLetterField);
        //click on password field and type the value of text
        typeText(_PasswordField,LoadProp.getProperty("Password"));
        //click on Email ConfirmPassword field and type the value of sendKeys
        typeText(_ConfirmPasswordField,LoadProp.getProperty("Confirm_Password"));
        // wait on register button for 20 sec
        waitForElementToBeClickable(_registerSubmitButton,20);
        // click on register button
        clickOnElement(_registerSubmitButton);
      //  clickOnElement(_Continue);




    }



}
