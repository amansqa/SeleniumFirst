package com.orangehrmlive.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OrangeWeb {

    public static void main(String[] args) {
        String driverLocation=System.getProperty("user.dir")+ "/src/test/resources/driver/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverLocation);

        WebDriver driver= new FirefoxDriver();
        driver.get ("https://opensource-demo.orangehrmlive.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.id("logInPanelHeading")).getText().trim());

        driver.quit();


    }
}