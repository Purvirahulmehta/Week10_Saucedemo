package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(baseUrl);
        System.out.println("Title of the page: "+ driver.getTitle());
        System.out.println("Current URL:" + driver.getCurrentUrl());
        System.out.println("Page Source: " +driver.getPageSource());
       WebElement emailField=driver.findElement(By.name("user-name"));
       emailField.sendKeys("London");
       WebElement passwordField=driver.findElement(By.name("password"));
       passwordField.sendKeys("Unitedkingdom");
       driver.close();
    }
}
