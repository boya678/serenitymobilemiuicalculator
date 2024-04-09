package com.tevolvers.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OwnDriver {
    private static AndroidDriver driver;

    public static AndroidDriver init() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:password", "GranjaT-E2024*");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:platformVersion", "14.0");
        desiredCapabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
        desiredCapabilities.setCapability("appPackage", "com.miui.calculator");
        desiredCapabilities.setCapability("appium:user", "poc@nequi.com");
        try {
            driver = new AndroidDriver(
                    new URL("https://appium.t-evolvers.com/wd/hub"),
                    desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}
