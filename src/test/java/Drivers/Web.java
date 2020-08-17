package Drivers;

import Utils.ScreenShotHelper;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    private static WebDriver driver;

   @Before
    public static void inItDriver(String url){
        System.setProperty("webdriver.chrome.driver", "DriverExecFiles/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static void closeDriver(){
        driver.close();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @After
    public static void quitDriver(Scenario scenario){
        if (scenario.isFailed()){
            ScreenShotHelper.takeWebScreenShot(scenario.getName());
        }
        driver.quit();
    }

}
