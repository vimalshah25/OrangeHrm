package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    LoadProp loadProp = new LoadProp();

    By _adminLogin = By.xpath("//input[@id='txtUsername']");
    By _adminPassword = By.xpath("//input[@id='txtPassword']");
    By _login = By.xpath("//input[@id='btnLogin']");


    public void enterDetailsAdminLogin() {
        // clickOnElement(_adminLogin);
        // clickOnElement(_adminPassword);
        typeText(_adminLogin, loadProp.getProperty("UserName"));


        typeText(_adminPassword, loadProp.getProperty("Password"));
        clickOnElement(_login);

    }
    public void enterValidAdminLoginDetails(){
        typeText(By.id("txtUsername"),"vimal");
//        typeText(_adminLogin,loadProp.getProperty("vimal"));
        typeText(By.id("txtPassword"),"12345678");
        clickOnElement(_login);

//        typeText(_adminPassword,loadProp.getProperty("12345678"));
    }

    public void clickOnLogin() {


    }
}







