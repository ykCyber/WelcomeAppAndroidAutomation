package com.selfPractice.Day1;

import com.capabilities.Capabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScrollToLanguage {
    private AppiumDriver<MobileElement> driver;

    @Test()
    public void verifyNetherlands() {
        try {

            DesiredCapabilities desiredCapabilities = Capabilities.getCapability();

            driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            List<MobileElement> languageElements = driver.findElements(By.xpath("//*[@text]"));

            for (WebElement element : languageElements) {
                String language = element.getAttribute("text");
                System.out.println(language);
            }
//            findByText("Next").click();
//
//
//
//            findByText("Learn more").click();
//
//            for (int i = 0; i < 5; i++) {
//                findByText("Doorgaan").click();
//            }
//
//            findByText("Log in").click();
//            findByText("E-mail").sendKeys("jewellromaguera19@triots.com");
//            findByText("Wachtwoord").sendKeys("Amsterdam1*");
//            findByText("Log in").click();
//            findByText("NEDERLANDS").click();
//            findByText("English").click();
//            findByText("Calendar").click();
//            findByText("All categories").click();
//            findByText("Language").click();
//            findByText("done").click();
//          //  findByText("City").click();
//           findByText("Search by name").click();
//            findByText("type name").click();
//            findByText("type name").sendKeys("DATE");
//            findByText("search").click();
//            WebElement element1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]\n"));
//            System.out.println("element.getText() = " + element1.getText());
//            TouchActions touchActions = new TouchActions(driver);
//            touchActions.move(200, 250).build();
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private WebElement findByText(String text) {
        WebElement webElement = driver.findElement(By.xpath("//*[@text='" + text + "']"));
        return webElement;
    }


}

