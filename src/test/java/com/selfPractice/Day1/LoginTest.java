package com.selfPractice.Day1;

import com.capabilities.Capabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.selfPractice.Day1.Direction.*;

public class LoginTest {
    AndroidDriver driver;


    @Test
    public void test() {
        try {
            String device = "Pixel_2";
            String buildApk = "app-release.apk";
            String appActivity = "se.welcomeapp.android.MainActivity";
            String appPackage = "se.welcomeapp.android";

            DesiredCapabilities desiredCapabilities = Capabilities.getCapability(device, appActivity, appPackage, "8,0");


            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"English\"));");
            //   AndroidElement element = (AndroidElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"English\"));");
            //    System.out.println("element.getText() = " + element.getText());
//            List<MobileElement> textViewElements = driver.findElements(By.className("android.widget.TextView"));
//            AndroidElement element1 = (AndroidElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"English\"));");


            findByText("Next").click();
            findByText("Learn more").click();

            for (int i = 0; i < 5; i++) {
                findByText("Doorgaan").click();
            }

            findByText("Log in").click();
            findByText("E-mail").sendKeys("jewellromaguera19@triots.com");
            findByText("Wachtwoord").sendKeys("Amsterdam1*");


            findByText("Log in").click();

//            findByText("NEDERLANDS").click();
//            findByText("English").click();
            findByText("Agenda").click();
            findByText("Alle categorieën").click();
            findByText("Taal").click();
            findByText("Lunch en diner").click();
            findByText("klaar").click();
            //  findByText("City").click();
        //    findByText("Search by name").click();
            findByText("Zoeken op naam").click();
            findByText("type name").sendKeys("Start");
            findByText("search").click();
            WebElement homeButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='welcome, tab, 3 of 5']/android.view.ViewGroup[@text='']"));
            WebElement date = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]\n"));
            String actualDate = date.getText();
            System.out.println("actualDate = " + actualDate);
            homeButton.click();


            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private WebElement findByText(String text) {
        WebElement element = driver.findElement(By.xpath("//*[contains(@text,'" +text+"')]"));

        return element;
    }


}

