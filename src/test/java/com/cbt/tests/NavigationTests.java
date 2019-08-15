package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {
        // testWithChrome();
        //testWithFirefox();
        testWithSafari();

    }

    public static void testWithChrome() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");
        Thread.sleep(1000);
        String title1 = driver.getTitle();
        driver.get("https://etsy.com");
        Thread.sleep(1000);
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2, driver.getTitle());
        driver.quit();

    }

    public static void testWithFirefox() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");
        Thread.sleep(1000);
        String title1 = driver.getTitle();
        driver.get("https://etsy.com");
        Thread.sleep(1000);
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2, driver.getTitle());
        driver.quit();

    }

    public static void testWithSafari() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");
        Thread.sleep(1000);
        String title1 = driver.getTitle();
        driver.get("https://etsy.com");
        Thread.sleep(1000);
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2, driver.getTitle());
        driver.quit();
    }
}
