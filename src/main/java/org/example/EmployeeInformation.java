package org.example;

import org.openqa.selenium.By;

public class EmployeeInformation extends Utils{
    // Add employee
    public void userShouldBeAbleToAddEmployee(){
        clickOnElement(By.id("//*[@id=\"menu_pim_addEmployee\"]"));
    }
}
