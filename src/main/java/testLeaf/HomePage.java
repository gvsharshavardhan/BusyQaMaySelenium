package testLeaf;


import org.openqa.selenium.By;

public class HomePage extends  BasePage{
    static String seleniumInteractionsPageGenericXpath = "//h5[text()='$$']/parent::a";

    public void goToEditPage(){
        getElement(By.xpath(seleniumInteractionsPageGenericXpath.replace("$$", "Edit"))).click();
    }
}
