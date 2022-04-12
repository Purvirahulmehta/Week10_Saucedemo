package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get(baseUrl);
        System.out.println("Title:" + driver.getTitle());
        System.out.println("Current Url: " +driver.getCurrentUrl());
        System.out.println("Page Source: " + driver.getPageSource());
        WebElement usernamefield=driver.findElement(By.name("user-name"));
        usernamefield.sendKeys("London");
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("Unitedkingdom");
        driver.close();
    }
}
