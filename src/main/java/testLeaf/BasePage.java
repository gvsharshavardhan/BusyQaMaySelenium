package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {


    //common methods
    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

}