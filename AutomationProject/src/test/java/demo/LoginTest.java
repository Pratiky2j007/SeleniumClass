package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
    @Test
    public void loginTestMethod() throws MalformedURLException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platformName", "Windows");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
        //WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.quit();
    }
}
