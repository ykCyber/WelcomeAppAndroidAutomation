package com.selfPractice.Day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Day1 {
    AppiumDriver<MobileElement> driver;
    DesiredCapabilities desiredCapabilitiesCalculator;

    {
        desiredCapabilitiesCalculator = new DesiredCapabilities();
        desiredCapabilitiesCalculator.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilitiesCalculator.setCapability(MobileCapabilityType.VERSION, 10.0);
        desiredCapabilitiesCalculator.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_29");
        //if you use phone app then you should search for app activity and package
        desiredCapabilitiesCalculator.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilitiesCalculator.setCapability("appPackage", "com.android.calculator2");
    }

    @Test

    public void test1() throws MalformedURLException, InterruptedException {

        driver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilitiesCalculator);
        Thread.sleep(2500);
        driver.closeApp();
    }
}
