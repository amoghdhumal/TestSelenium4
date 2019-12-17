package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TableHeightWidth {
    public WebDriver driver;

    // https://www.guru99.com/using-contains-sbiling-ancestor-to-find-element-in-selenium.html
    // http://demo.guru99.com/v1/
    @BeforeClass
    public void init1() {
        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();;
        driver = new ChromeDriver();
    }

    @Test
    public void checkAncestor() {

        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        OutputType<String> str2 = null ;
        driver.get("http://demo.guru99.com/test/table.html");
        // Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
        String str1;
        System.out.println(driver.findElement(By.xpath(".//tbody")).getSize());
        System.out.println("Height" +driver.findElement(By.xpath(".//tbody")).getRect().getHeight());
        System.out.println("width" + driver.findElement(By.xpath(".//tbody")).getRect().getWidth());
        System.out.println("width" + driver.findElement(By.xpath(".//tbody")).getScreenshotAs(str2));
        System.out.println(str2);
        
        
    }

    @AfterClass
    public void afterClassTest() {
        driver.quit();
    }

}


