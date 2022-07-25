package roughTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckboxPrac {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha\\myOwnWorkSpace\\BusyQaMaySelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/checkbox.html");


        String divText = driver.findElement(By.xpath("//label[contains(text(),'languages')]/parent::div")).getText();
        String[] options = divText.split("\n")[2].split(" ");
        List<WebElement> inputElements = driver.findElements(By.xpath("//label[contains(text(),'languages')]/following-sibling::input"));
        Map<String, WebElement> inputMapping = new HashMap<>();
        for (int i = 0; i < options.length; i++) {
            inputMapping.put(options[i], inputElements.get(i));
        }

        List<String> userInputs = new ArrayList<>();
//        userInputs.add("Java");
//        userInputs.add("SQL");
        userInputs.add("VB");
//        userInputs.add("C++");

        for (String ip : userInputs) {
            inputMapping.get(ip).click();
        }

//        driver.quit();

    }
}
