package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;

public class BrowserManager extends BasePage {

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
       // System.setProperty("web driver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
        driver = new ChromeDriver();
       // driver = new EdgeDriver();

        // open the browser
        driver.manage().window().maximize();

        // type url
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    public void closeBrowser() {
       // driver.close();
    }

}


