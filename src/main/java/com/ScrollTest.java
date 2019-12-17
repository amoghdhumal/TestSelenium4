package com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollTest {

    public WebDriver driver;

    // https://www.guru99.com/using-contains-sbiling-ancestor-to-find-element-in-selenium.html
    // http://demo.guru99.com/v1/
    @BeforeClass
    public void init1() {
        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClassTest() {
        driver.quit();
    }

    @Test
    public void scrollWindow() {
        driver.get("http://demo.guru99.com/test/guru99home/");
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
        driver.manage().window().maximize();

        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        
    }
}
