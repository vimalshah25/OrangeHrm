package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.example.BasePage.driver;

public class MyProfile extends Utils{

    public void userShouldBeAbleToViewProfile(){

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickOnElement(By.id("menu_pim_viewEmployeeList"));

        // click on profile icon
        clickOnElement(By.id("welcome"));


        // click on Logout
        clickOnElement(By.xpath("//a[@href=\"/index.php/auth/logout\"]"));




    }
}
