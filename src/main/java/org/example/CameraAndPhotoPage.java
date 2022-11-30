package org.example;
// importing a package of selenium for by
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

// extends shows inheritance concept that CameraAndPhotoPage(child class) and Utils (Parent class)
public class CameraAndPhotoPage extends Utils {
    public void getProductName() {
        List<WebElement> productTile = driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
     //   System.out.println(productTile);
        for (WebElement element : productTile) {
            System.out.println(element.getText());

        }
    }

    public void cameraAndPhotoResult(){
        waitForUrlToBe("https://demo.nopcommerce.com/camera-photo",20);
    }

}
