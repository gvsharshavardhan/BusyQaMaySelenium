package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class SeleniumFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the browser name:");
        String browser = sc.nextLine();
        WebDriver driver;

        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha\\myOwnWorkSpace\\BusyQaMaySelenium\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harsha\\myOwnWorkSpace\\BusyQaMaySelenium\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        WebElement passwordText = driver.findElement(By.className("login_password"));
        String pass = passwordText.getText().split("\n")[1].trim();

        WebElement usernametext = driver.findElement(By.className("login_credentials"));
        String un = usernametext.getText().split("\n")[1].trim();

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys(un);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(pass);
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        sleep(3);

        driver.quit();
    }

    public static void sleepForASecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
