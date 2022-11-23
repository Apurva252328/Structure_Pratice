package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
// importing testng package for assert
import org.testng.Assert;

// extends shows inheritance concept that  EmailAFriendRequest(child class) and Utils (Parent class)
public class EmailAFriendResult extends Utils {
    // creating local variable
    String msg1 = "Your message has been sent.";

    public void verifyEmailMessageIsSentSuccessfully(){
        //driver wait 10 sec at this point
        waitForUrlToBe("https://demo.nopcommerce.com/productemailafriend/4",10);
        //from get text method we store that value in variable
        String msg = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        // assert equal we compare two values
        Assert.assertEquals(msg, msg1,"Your message has been sent.");
    }
}
