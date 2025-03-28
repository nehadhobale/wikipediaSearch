package com.wikipediaAppiumProject.tests;

import com.wikipediaAppiumProject.pages.SearchBarPages;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AppiumDriver driver;
    SearchBarPages searchBar;


    @BeforeSuite
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:platformVersion","14");
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:deviceName","OnePlus 9 5G");
        caps.setCapability("appium:udid","23bfa286");
        caps.setCapability("appium:automationName", "uiautomator2");
        caps.setCapability("appium:appPackage","org.wikipedia.alpha");
        caps.setCapability("appium:appActivity","org.wikipedia.main.MainActivity");
        caps.setCapability("appium:ignoreHiddenApiPolicyError", true);
        caps.setCapability("appium:noReset", true);

        driver= new AppiumDriver(new URL("http://127.0.0.1:4723/"),caps);
        searchBar = new SearchBarPages(driver);
    }

    @AfterSuite
    public void cleanUp(){
        driver.quit();
    }
}
