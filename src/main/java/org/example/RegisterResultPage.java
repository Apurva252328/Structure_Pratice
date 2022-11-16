package org.example;
// importing a package of selenium of by
import org.openqa.selenium.By;
// importing testng package for assert
import org.testng.Assert;

// extends shows inheritance concept that registerResultPage(child class) and Utils (Parent class)
public class RegisterResultPage extends Utils {
    // creating local variable regMess and assign value
    String regMess = "Your registration completed";

    // creating verify register result method
    public void verifyRegisterResult() {
        // wait at this location for 20 sec
        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 20);
         // using get text method and store in regMsg variable
        String regMsg =  getTextFromElement(By.className("result"));
        //  assert equal method specifies that expected  value is equal or not
         Assert.assertEquals(regMsg,regMess,"Your registration completed");



    }

}
