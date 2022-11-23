package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
// importing testng package for assert
import org.testng.Assert;

import static org.example.Utils.clickOnElement;

public class Facebook extends Utils {
    // storing locator in variable
    private By _facebookLogo = By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");
    //creating local variable
    String msg = "http://www.facebook.com/nopCommerce";
    public void faceBookPage(){
      // storing main window
        String MainWindow = driver.getWindowHandle();
        // click on facebook button
        clickOnElement(_facebookLogo);
        // switching to facebook window
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        // getting current url where driver is
        System.out.println(driver.getCurrentUrl());
        // close that window
        driver.close();
        // switching to main window
        driver.switchTo().window(MainWindow);
        // assert equal is used to compare two value
        Assert.assertEquals(msg,"http://www.facebook.com/nopCommerce","You are in facebook page . ");

    }
}
