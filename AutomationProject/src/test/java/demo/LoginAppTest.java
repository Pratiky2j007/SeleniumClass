package demo;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@Feature("Launch feature")
@Epic("Launch epic")
@Story("Launch verification")
public class LoginAppTest {

    WebDriver driver;
    @Test
    @Description("Verify login to google")
    public void testLaunchGoogleApplication() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platformName", "Windows");
         driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
        launchURL("https://www.google.com");
    }

    @Test
    @Description("Verify login to facebook")
    public void testLaunchFacebookApplication() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("platformName", "Windows");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
        launchURL("https://www.facebook.com");
    }

    @Step("Launch url: {0}")
    public void launchURL(String url){
        driver.get(url);
    }
}
