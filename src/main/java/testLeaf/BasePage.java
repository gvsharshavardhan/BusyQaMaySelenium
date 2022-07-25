package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    //common methods
    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

}