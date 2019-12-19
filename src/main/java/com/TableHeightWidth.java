package com;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ;
        // driver = new ChromeDriver();
    }

    @Test
    public void checkAncestor() {

        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        OutputType<String> str2 = null;
        String baseUrl = "http://demo.guru99.com/test/newtours/";

        driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();

    }

    @AfterClass
    public void afterClassTest() {
        driver.quit();
    }

}
