package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
// importing testng package for assert
import org.testng.Assert;

// extends shows inheritance concept that HomePage(child class) and Utils (Parent class)

public class Homepage extends Utils{

    private By _currency = By.id("customerCurrency");

    private By _voteButton = By.id("vote-poll-1");
       // creating method for register button is present

    String msg = "only register uset can vote.";
    public void verifyRegisterButtonPresent(){
        //methods checks that the two objects are equals or not.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","Register button is present ");
    }
    //creating method for navigating electronics page
    public void navigateToElectronicPage(){
        clickOnElement(By.linkText("Electronics"));
    }

    // creating method for select currency
    public void selectCurrency (){
        // using visible text method to check currency
        selectFromDropdownListByVisibleText(_currency,"Euro");
        selectFromDropdownListByVisibleText(_currency,"US Dollar");
       }
    // creating method for alert
    public void voteAlert(){
        // click on vote button
        clickOnElement(_voteButton);
        // accept the ok from alert message
        driver.switchTo().alert().accept();
        Assert.assertEquals(msg,"User has to must registered to vote");

    }

}
