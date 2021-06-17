package org.web3j.sample;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.remote.DesiredCapabilities;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Firebase {

    private AndroidDriver driver;
    @Before
    public void setUp() throws java.lang.Exception{
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("noReset", true);
            desiredCapabilities.setCapability("autoGrantPermissions", true);
            desiredCapabilities.setCapability("automationName", "uiautomator2");
            desiredCapabilities.setCapability("app", "C:\\Users\\HP User\\StudioProjects\\car-list-details\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("platformVersion", "10");
            desiredCapabilities.setCapability("realMobile", "true");
            desiredCapabilities.setCapability("deviceName", "vivo 1917");
            URL remoteUrl = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver(remoteUrl, desiredCapabilities);

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void carViewerValidationTest()
            throws java.lang.Exception
    {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        Thread.sleep(2000);
        AndroidElement listViewCars = ((AndroidElement) driver.findElementById("carsList"));
        Boolean postListViewCarsIsDisplayed;
        try {
            postListViewCarsIsDisplayed = listViewCars.isDisplayed();
        } catch (java.lang.Exception _x) {
            postListViewCarsIsDisplayed = false;
        }
        Assert.assertEquals(postListViewCarsIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carImage = ((AndroidElement) driver.findElementById("coverImage"));
        Boolean postCarImageIsDisplayed;
        try {
            postCarImageIsDisplayed = carImage.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarImageIsDisplayed = false;
        }
        Assert.assertEquals(postCarImageIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carName = ((AndroidElement) driver.findElementById("carName"));
        Boolean postCarNameIsDisplayed;
        try {
            postCarNameIsDisplayed = carName.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarNameIsDisplayed = false;
        }
        Assert.assertEquals(postCarNameIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carMake = ((AndroidElement) driver.findElementById("carMake"));
        Boolean postCarMakeIsDisplayed;
        try {
            postCarMakeIsDisplayed = carMake.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarMakeIsDisplayed = false;
        }
        Assert.assertEquals(postCarMakeIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carType = ((AndroidElement) driver.findElementById("carType"));
        Boolean postCarTypeIsDisplayed;
        try {
            postCarTypeIsDisplayed = carType.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarTypeIsDisplayed = false;
        }
        Assert.assertEquals(postCarTypeIsDisplayed, true);
    }

    @Test
    public void carNameValidationTest()
            throws java.lang.Exception
    {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        Thread.sleep(2000);
        AndroidElement listViewCars = ((AndroidElement) driver.findElementById("carsList"));
        Boolean postListViewCarsIsDisplayed;
        try {
            postListViewCarsIsDisplayed = listViewCars.isDisplayed();
        } catch (java.lang.Exception _x) {
            postListViewCarsIsDisplayed = false;
        }
        Assert.assertEquals(postListViewCarsIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carImage = ((AndroidElement) driver.findElementById("coverImage"));
        Boolean postCarImageIsDisplayed;
        try {
            postCarImageIsDisplayed = carImage.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarImageIsDisplayed = false;
        }
        Assert.assertEquals(postCarImageIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carName = ((AndroidElement) driver.findElementById("carName"));
        Boolean postCarNameIsDisplayed;
        try {
            postCarNameIsDisplayed = carName.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarNameIsDisplayed = false;
        }
        Assert.assertEquals(postCarNameIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carMake = ((AndroidElement) driver.findElementById("carMake"));
        Boolean postCarMakeIsDisplayed;
        try {
            postCarMakeIsDisplayed = carMake.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarMakeIsDisplayed = false;
        }
        Assert.assertEquals(postCarMakeIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement carType = ((AndroidElement) driver.findElementById("carType"));
        Boolean postCarTypeIsDisplayed;
        try {
            postCarTypeIsDisplayed = carType.isDisplayed();
        } catch (java.lang.Exception _x) {
            postCarTypeIsDisplayed = false;
        }
        Assert.assertEquals(postCarTypeIsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement car1 = ((AndroidElement) driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Hyundai Grand i10\")"));
        Boolean postCar1IsDisplayed;
        try {
            postCar1IsDisplayed = car1 .isDisplayed();
        } catch (java.lang.Exception _x) {
            postCar1IsDisplayed = false;
        }
        Assert.assertEquals(postCar1IsDisplayed, true);
        Thread.sleep(2000);
        AndroidElement car2 = ((AndroidElement) driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Nissan Micra\")"));
        Boolean postCar2IsDisplayed;
        try {
            postCar2IsDisplayed = car2 .isDisplayed();
        } catch (java.lang.Exception _x) {
            postCar2IsDisplayed = false;
        }
        Assert.assertEquals(postCar2IsDisplayed, true);
    }
}
