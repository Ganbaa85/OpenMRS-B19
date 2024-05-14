package openMrs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverHelper {

    // Singleton pattern design
    // Main point of Singleton pattern design in our case is
    // to centralize our driver
    //NOTE: Singleton is used not only by testers, but also
    // used by developers

    private static WebDriver driver; // encapsulation

    private DriverHelper(){} // encapsulation

    public static WebDriver getDriver(){

        if (driver == null || ((RemoteWebDriver)driver).getSessionId() == null){

            switch (ConfigReader.readProperty("browser")){

                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    break;

                default:
                    driver = new ChromeDriver();

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        return driver;
    }



}
