package org.example;

import org.openqa.selenium.By;

public class AddEmployee extends  Utils{
    LoadProp loadProp = new LoadProp();

    By _firstname = By.id("firstName");
    By _lastname = By.id("lastName");
    By _employeeId = By.id("employeeId");
    By _userName = By.id("user_name");
    By _password = By.id("user_password");
    By _confirmPassword = By.id("re_password");

    public void userShouldBeAbleToFillRequireDetails(){

        // Enter first name
          typeText(_firstname,loadProp.getProperty("firstName"));

        // Enter Last Name
          typeText(_lastname,loadProp.getProperty("lastName"));

        // Type Employee ID
        typeText(_employeeId,loadProp.getProperty("employeeId"));

        // Click on login details
        clickOnElement(By.id("chkLogin"));

        // Type UserName
        typeText(_userName,loadProp.getProperty("user_name"));

        // Type Password
        typeText(_password,loadProp.getProperty("user_password"));

        // Type confirm password
        typeText(_confirmPassword,loadProp.getProperty("re_password"));

        // Click on save button
        clickOnElement(By.id("btnSave"));



    }

}
