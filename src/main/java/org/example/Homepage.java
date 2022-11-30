package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
// importing testng package for assert
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

// extends shows inheritance concept that HomePage(child class) and Utils (Parent class)

public class Homepage extends Utils{

    private By _currency = By.id("customerCurrency");

    private By _voteButton = By.id("vote-poll-1");
    private By _SearchBar = By.id("small-searchterms");
    private By _SearchButton= By.xpath("//button[@class=\"button-1 search-box-button\"]");
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

    public void hoverOverAndNavigateToDesiredCategoryPage(String category, String subCategory){
        WebElement categoryLink = driver.findElement((By.xpath("//ul[contains(@class,'notmobile')]//a[contains(.,'"+category+"')]")));
        String beforeHover = categoryLink.getCssValue("color");
        System.out.println("Befor hover color for category link = " +beforeHover);

        Actions builder = new Actions(driver);
        Action mouseOverCategory = builder.moveToElement(categoryLink).build();
        mouseOverCategory.perform();

        String afterHover = categoryLink.getCssValue("color");
        System.out.println("After hover color for category link = " +afterHover);

        clickOnElement(By.linkText(subCategory));

    }

    public void searchBar(){
        typeText(_SearchBar,"Nike");
        clickOnElement(_SearchButton);
    }


}
