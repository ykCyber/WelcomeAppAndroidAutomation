package com.selfPractice;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class XiaomiMI8Lite {
    AndroidDriver driver;
    DesiredCapabilities desiredCapabilitiesCalculator;

    {
        desiredCapabilitiesCalculator = new DesiredCapabilities();
        desiredCapabilitiesCalculator.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilitiesCalculator.setCapability(MobileCapabilityType.VERSION, 10.0);
        desiredCapabilitiesCalculator.setCapability(MobileCapabilityType.DEVICE_NAME, "2da88156");
        //if you use phone app then you should search for app activity and package
        desiredCapabilitiesCalculator.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilitiesCalculator.setCapability("appPackage", "com.android.calculator2");
    }

    DesiredCapabilities desiredCapsXiaomiWelcome;

    {
        desiredCapsXiaomiWelcome = new DesiredCapabilities();
        desiredCapsXiaomiWelcome.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapsXiaomiWelcome.setCapability(MobileCapabilityType.VERSION, 10.0);
        desiredCapsXiaomiWelcome.setCapability(MobileCapabilityType.DEVICE_NAME, "2da88156");
        //desiredCapsXiaomiWelcome.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\app-release.apk");
        //desiredCapsXiaomiWelcome.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\etsy.apk");
        desiredCapsXiaomiWelcome.setCapability("appActivity", "se.welcomeapp.android.MainActivity");
        desiredCapsXiaomiWelcome.setCapability("appPackage", "se.welcomeapp.android");
        //if you use phone app then you should search for app activity and package
        //desiredCapsXiaomiWelcome.setCapability("appActivity", "com.android.calculator2.Calculator");
        //desiredCapsXiaomiWelcome.setCapability("appActivity", ".cal.CalculatorActivity");
        //desiredCapsXiaomiWelcome.setCapability("appPackage", "com.miui.calculator");
        //desiredCapsXiaomiWelcome.setCapability("appPackage", "com.android.calculator2");
    }

    public void clickWithText(String text) throws InterruptedException {
      //                                                                                                                                                                Thread.sleep(1500);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='" + text + "']")));

        WebElement element = driver.findElement(By.xpath("//*[@text='" + text + "']"));
        element.click();                                               
    }
    public WebElement findByText(String text) throws InterruptedException {
       // Thread.sleep(1500);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='" + text + "']")));

        WebElement element = driver.findElement(By.xpath("//*[@text='" + text + "']"));
        return element;
    }

    @Test

    public void test1() throws MalformedURLException, InterruptedException {

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapsXiaomiWelcome);
        //driver.findElement(By.id("android:id/button1")).click();

        clickWithText("Nederlands");
        clickWithText("Volgende");
        clickWithText("Log in");
        String mail = "gegehag104@yubua.com";
        String password = "Amsterdam1*";
        findByText("E-mail").sendKeys(mail);
        findByText("Wachtwoord").sendKeys(password);
        clickWithText("Log in");

    }

}
