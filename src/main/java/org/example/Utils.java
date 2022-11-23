package org.example;
// importing a package of selenium of by
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
// importing a package of selenium of webElement
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
// importing a package of selenium of expectedConditions
import org.openqa.selenium.support.ui.ExpectedConditions;
// importing a package of selenium of select
import org.openqa.selenium.support.ui.Select;
// importing a package of selenium of webDriverWait
import org.openqa.selenium.support.ui.WebDriverWait;
//importing package for date to text format
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
// importing java package of duration
import java.time.Duration;

// extends shows inheritance concept that Utils(parent class) and BasePage (GrandParent class)
public class Utils extends BasePage {
    //creating method for click function
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }

    // creating method with parameter type
    public static void typeText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    // The getText() method simply returns the visible text present between the start and end tags
    public static String getTextFromElement(By by){
        return  driver.findElement(by).getText();
    }
    // creating method and returns timeStamp value corresponding to the given string
    public static String  getTimeStamp(){
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timestamp;
    }
    // creating dropdown method to select value from list
    public static void selectFromDropdownListByValue(By by ,String value){
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByValue(value);
    }
    // creating dropdown method to select value from list
    public static void selectFromDropdownListByVisibleText(By by,String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    // creating dropdown method to select value from list
    public static void selectFromDropdownListByIndex(By by,int num){
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByIndex(num);

    }
    //enables WebDriver to check if one or more web elements are clickable
    public static void waitForElementToBeClickable(By by,int duration){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    //enables WebDriver to check if one or more web elements are visible
    public static void waitForElementToBeVisible(By by ,int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }
    //These methods check that the URL is an expected one. With the timeout parameter that needs to be provided to the method:
    public static void waitForUrlToBe(String url, int duration){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.urlToBe(url));
    }
    public static void screenShotName(Method method){
        method.getName();
    }
    public static void captureScreenshot(String screenShotName){
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile=new File("src/ScreenShots/"+screenShotName+getTimeStamp()+".jpg");
        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
