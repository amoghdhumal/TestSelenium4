package com;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


/**
 * Hello world!
 *
 */
public class ScreenShotTest

{
    public static WebDriver driver;

    // @Test
    public void elementScreenShot() {
        // WebDriverManager.chromedriver().setup();
     //   WebDriverManager.chromedriver().setup();
         System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        WebElement webElement = driver.findElement(By.xpath(".//a[text()='Daily']"));
        File strFile = webElement.getScreenshotAs(OutputType.FILE);
        driver.findElement(By.xpath(".//table[@class='dataTable']")).getScreenshotAs(OutputType.FILE);
        System.out.println(strFile);
        driver.quit();
    }

    @Test
    public void mouseOver() {
        // WebDriverManager.chromedriver().setup();
  //      WebDriverManager.chromedriver().setup();
         System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(".//li[@class='dropdown']/a[contains(text(),'Selenium')]")));
        driver.findElement(By.xpath(".//li[@class='dropdown']/a[contains(text(),'Selenium')]/child::b")).click();

        WebElement webElement = driver.findElement(By.xpath(".//a[text()='Daily']"));

        List<WebElement> dropDown = driver.findElements(By.xpath(".//ul[@class='dropdown-menu']/li"));

        dropDown.forEach(item -> System.out.println(item.getText()));

        /*
         * File strFile = webElement.getScreenshotAs(OutputType.FILE); driver.findElement(By.xpath(".//table[@class='dataTable']")).getScreenshotAs(OutputType.FILE);
         * System.out.println(strFile);
         */
        driver.quit();
    }

}
