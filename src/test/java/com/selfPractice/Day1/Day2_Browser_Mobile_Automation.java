package com.selfPractice.Day1;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Day2_Browser_Mobile_Automation {
    DesiredCapabilities Pixel2_8_Cal;

    {
        Pixel2_8_Cal = new DesiredCapabilities();
        Pixel2_8_Cal.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        Pixel2_8_Cal.setCapability(MobileCapabilityType.VERSION, 8.0);
        Pixel2_8_Cal.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        //if you use phone app then you should search for app activity and package
        Pixel2_8_Cal.setCapability("appActivity", "com.android.calculator2.Calculator");
        Pixel2_8_Cal.setCapability("appPackage", "com.android.calculator2");
    }

    AndroidDriver<MobileElement> driver;

    @Test
    public void day2() {
       MobileElement mb =  driver.findElement(By.xpath("asd"));
    }

    @Test
    public void day3() {

    }
}
