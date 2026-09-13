package com.example.myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/milinakar/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize WebDriver with ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Your test code here
        driver.get("http://www.google.com");
        
    }
}

