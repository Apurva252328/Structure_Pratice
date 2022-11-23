package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
// importing testng package for assert
import org.testng.Assert;

// extends shows inheritance concept that CommentResult(child class) and Utils (Parent class)
public class NewsCommentResult extends Utils{
    // creating local variable msg2 and assign value
    String msg2 ="News comment is successfully added.";

    public void verifyMessageIsSentSuccessfully(){
        waitForUrlToBe("https://demo.nopcommerce.com/nopcommerce-new-release",10);
        // storing x path in local variable
        String msg1 = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        // assert equal is comparing two value
        Assert.assertEquals(msg1,msg2,"News comment is successfully added.");
    }
}
