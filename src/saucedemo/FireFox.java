package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(baseUrl);
        System.out.println("Title: "+driver.getTitle());
        System.out.println("Current Url:"+driver.getCurrentUrl());
        System.out.println("Page Source:"+ driver.getPageSource());
        WebElement usernameField=driver.findElement(By.name("user-name"));
        usernameField.sendKeys("London");
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("Unitedkingdom");
        driver.close();
    }
}
