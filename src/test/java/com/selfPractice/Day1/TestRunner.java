package com.selfPractice.Day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestRunner {
    private AppiumDriver<MobileElement> driver;

    @Test
    public void test() throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\welcomeApp.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
        // desiredCapabilities.setCapability("appActivity","se.welcomeapp.android.MainActivity");
        //desiredCapabilities.setCapability("appPackage","se.welcomeapp.android");
        driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(3000);
        // WebElement getStarted = driver.findElement(By.xpath("//*[@text='Get Started']"));
        //    getStarted.click();
        Thread.sleep(3000);
        driver.closeApp();
        driver.close();

    }

    @Test
    public void test2() throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "10.0");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\welcomeApp.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_29");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability("appActivity", ".ui.homescreen.HomescreenTabsActivity");
        desiredCapabilities.setCapability("appPackage", "com.etsy.android");
        driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(3000);
        // WebElement getStarted = driver.findElement(By.xpath("//*[@text='Get Started']"));
        //    getStarted.click();
        MobileElement you = driver.findElement(MobileBy.AccessibilityId("You tab, 4 of 5"));
        you.click();
        MobileElement settings = driver.findElement(MobileBy.xpath("//*[@text='Settings']"));

        settings.click();
        Thread.sleep(2000);
        MobileElement checkBox = driver.findElement(By.id("com.etsy.android:id/settings_checkbox"));
        System.out.println("checkBox.isSelected() = BEfore " + checkBox.getAttribute("checked"));
        checkBox.click();
        Thread.sleep(2000);
        System.out.println("checkBox.isSelected() = after " + checkBox.getAttribute("checked"));

        checkBox.isSelected();
        Thread.sleep(5000);
        driver.closeApp();

    }
}