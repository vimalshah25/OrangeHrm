package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Dashboard extends Utils{

    public void UserShouldBeAbleToClickPIMCategoryFromMainMenu(){

        clickOnElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
    }

    public void userShouldBeAbleToSeeEmployeeList(){

        clickOnElement(By.id("menu_pim_addEmployee"));
    }
    public void userVerifyThatUserAtDeshboardPage(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText().equals("Dashboard"));

    }

}
