package org.example;
// importing a testng annotations for afterMethod
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
// importing a testng annotations for beforeMethod
import org.testng.annotations.BeforeMethod;

// extends shows inheritance concept that BaseTest(child class) and Utils (Parent class)
public class BaseTest extends Utils {
    // creating object of driverManager
    DriverManager driverManager = new DriverManager();

    //Executes before each test method
    @BeforeMethod
    //create setup method for open browser
    public void setUp() {
    //    driverManager.openBrowser();
        driverManager.openBrowser();
    }

    //Executes after each test method
    @AfterMethod
    //create shutdown method for close browser
    public void shutDown(ITestResult result) {
        if(!result.isSuccess()){
          captureScreenshot(result.getName());
        }
        driverManager.closeBrowser();
    }
}
