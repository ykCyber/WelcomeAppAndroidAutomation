package com.capabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {
    public static DesiredCapabilities getCapability(String device, String appActivity, String appPacakge,String version) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, version);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\app-release.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
        desiredCapabilities.setCapability("appActivity", appActivity);
        desiredCapabilities.setCapability("appPackage", appPacakge);
        return desiredCapabilities;

    }

    public static DesiredCapabilities getCapability() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\app-release.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
        desiredCapabilities.setCapability("appActivity", "se.welcomeapp.android.MainActivity");
        desiredCapabilities.setCapability("appPackage", "se.welcomeapp.android");
        return desiredCapabilities;
    }
}
