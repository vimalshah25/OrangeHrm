package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class DeleteEmployee extends Utils{

    LoadProp loadProp = new LoadProp();

    By _adminLogin = By.xpath("//input[@id='txtUsername']");
    By _adminPassword = By.xpath("//input[@id='txtPassword']");
    By _login = By.xpath("//input[@id='btnLogin']");
    By _pim = By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
//    By _employeeName = By.xpath("//*[@id=\"empsearch_employee_name_empName\"]");
    By _employeeName = By.id("empsearch_employee_name_empName");




    public void enterLoginDetailsToDeleteEmployee(){


//            // clickOnElement(_adminLogin);
//            // clickOnElement(_adminPassword);
//            typeText(_adminLogin, loadProp.getProperty("UserName"));
//
//
//            typeText(_adminPassword, loadProp.getProperty("Password"));
//            clickOnElement(_login);
//            clickOnElement(_pim);

            typeText(_employeeName,loadProp.getProperty("EmployeeName"));
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            clickOnElement(By.xpath("//*[@id=\"searchBtn\"]"));
            clickOnElement(By.xpath("//*[@id=\"ohrmList_chkSelectAll\"]"));
            clickOnElement(By.xpath("//*[@id=\"btnDelete\"]"));
            clickOnElement(By.xpath("//*[@id=\"dialogDeleteBtn\"]"));

    }


}

