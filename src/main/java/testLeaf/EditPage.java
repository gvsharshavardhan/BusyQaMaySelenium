package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EditPage extends BasePage {

    static String inputFields_editPageGenericXpath = "//label[contains(text(),'$$')]/following-sibling::input";

    public void editPageActions() {
        //1
        getElement(By.xpath(inputFields_editPageGenericXpath.replace("$$", "email"))).sendKeys("abcd@xyz.com");
        //2
        getElement(By.xpath(inputFields_editPageGenericXpath.replace("$$", "Append"))).sendKeys("decoy effect");
        getElement(By.xpath(inputFields_editPageGenericXpath.replace("$$", "Append"))).sendKeys(Keys.TAB);
        //3
        System.out.println(getElement(By.xpath(inputFields_editPageGenericXpath.replace("$$", "default"))).getAttribute("value"));
        //4
        getElement(By.xpath(inputFields_editPageGenericXpath.replace("$$", "Clear"))).clear();
        //5
        System.out.println(getElement(By.xpath(inputFields_editPageGenericXpath.replace("$$", "edit"))).isEnabled());
    }
}