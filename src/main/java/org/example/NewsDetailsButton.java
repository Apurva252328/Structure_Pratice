package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

// extends shows inheritance concept that  DetailsButton(child class) and Utils (Parent class)
public class NewsDetailsButton extends Utils{
    // creating local variables and storing locators in it
        private By _NewsDetails = By.xpath("//div[@class=\"news-items\"]/div/div[3]//a[@href=\"/nopcommerce-new-release\"]");
        private By _Tittle = By.id("AddNewComment_CommentTitle");
        private By _Comment = By.id("AddNewComment_CommentText");
        private By _newCommentButton = By.xpath("//button[@class=\"button-1 news-item-add-comment-button\"]");

        public void detailsButton(){
           // click on new details button
            clickOnElement(_NewsDetails);
            //typing text in title
            typeText(_Tittle,"Must try this product");
            //typing comment
            typeText(_Comment,"Excellent services");
            // click on button
            clickOnElement(_newCommentButton);
            //storing xpath in comment list
            List<WebElement> commentList = driver.findElements(By.xpath("//div[@class=\"comments\"]"));
            for (WebElement element:commentList){
                System.out.println(element.getText());
            }
        }
    }

