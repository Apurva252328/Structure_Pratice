package org.example;

// importing a package of chromeDriver
import org.openqa.selenium.chrome.ChromeDriver;

// extends shows inheritance concept that DriverManger(child class) and Utils (Parent class)
public class DriverManager extends Utils {
    // creating method for open browser
    public void openBrowser() {
        //Set the path of the driver for the Chrome Browser
       System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        //creating object with chromedriver
       driver = new ChromeDriver();
        // To maximize a browser window
       driver.manage().window().maximize();
        //set application URL to navigate
       driver.get("https://demo.nopcommerce.com");
    }
     // creating method for close browser
    public void closeBrowser() {
        driver.close();
    }
}
