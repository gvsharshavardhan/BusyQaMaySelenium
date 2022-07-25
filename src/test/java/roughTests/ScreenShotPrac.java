package roughTests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotPrac {
    public static void main(String[] args) throws IOException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha\\myOwnWorkSpace\\BusyQaMaySelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/checkbox.html");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\Harsha\\myOwnWorkSpace\\BusyQaMaySelenium\\screenshots\\screenshot_1.png"));

    }
}
