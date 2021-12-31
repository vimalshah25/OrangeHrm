package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager {
    public static void captureScreenshot(String fileName){
        // Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot) driver);

        // Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        // Move image file to new destination
        File destFile=new File("src\\test\\Screenshots\\"+fileName+currentTimeSTamp()+".png");

        // Copy file at destination
        try{
            FileUtils.copyFile(SrcFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void verifyCurrentURL(String url_name){
        Assert.assertTrue(driver.getCurrentUrl().equals(url_name));
    }



    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String currentTimeSTamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }

    public static void waitForClicable(By by, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForVisible(By by, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
    }

}


