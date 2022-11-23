package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;

// extends shows inheritance concept that  EmailAFriend(child class) and Utils (Parent class)
public class EmailAFriend extends Utils {
    // creating local variables and storing locators in it
    private By _appleMacbook = By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]");
    private By _EmailFriendButton = By.xpath("//div[@class=\"email-a-friend\"]");
    private By _friendEmailButton = By.id("FriendEmail");
    private By _personalMsg = By.id("PersonalMessage");
    private By _sendEmailButton = By.className("buttons");

    public void emailDetails()
    {
        //click on apple book pro
        clickOnElement(_appleMacbook);
        //click on email a friend
        clickOnElement(_EmailFriendButton);
        // assign email in text field
        typeText(_friendEmailButton, "abc1234" + getTimeStamp() + "@gmail.com");
        // type text in field
        typeText(_personalMsg, "It's good item");
        // click on email button
        clickOnElement(_sendEmailButton);
    }

}
