package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class ScreenShot

{
    public static WebDriver driver;

    public static void main(String[] args) {
        // WebDriverManager.chromedriver().setup();
        // WebDriverManager.chromedriver().setup();

        // WebDriverManager.firefoxdriver().setup();
        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        WebElement webElement = driver.findElement(By.xpath(".//a[text()='Daily']"));
        File strFile = webElement.getScreenshotAs(OutputType.FILE);
        driver.findElement(By.xpath(".//table[@class='dataTable']")).getScreenshotAs(OutputType.FILE);
        System.out.println(strFile);
        // Get Table

        driver.quit();
    }
}
