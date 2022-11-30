package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;

// extends shows inheritance concept that ElectronicsPage(child class) and Utils (Parent class)
public class ElectronicsPage extends Utils {
    public void navigateToCameraPage(){
        // click on camera and photo link
        clickOnElement(By.linkText("Camera & photo"));
    }
}
