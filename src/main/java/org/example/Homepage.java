package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
// importing testng package for assert
import org.testng.Assert;

// extends shows inheritance concept that HomePage(child class) and Utils (Parent class)

public class Homepage extends Utils{
       // creating method for register button is present
    public void verifyRegisterButtonPresent(){
        //methods checks that the two objects are equals or not.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","Register button is present ");
    }
}
