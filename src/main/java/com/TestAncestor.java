package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAncestor {
    public WebDriver driver;

    // https://www.guru99.com/using-contains-sbiling-ancestor-to-find-element-in-selenium.html
    // http://demo.guru99.com/v1/
    @BeforeClass
    public void init1() {
        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    // @Test
    public void searchContextUse() {
        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");
        // driver = new ChromeDriver(); It launches new driver as SearchContext is an interface same to WebDriver which extends WebDriver
        // interface public interface WebDriver extends SearchContext {

        SearchContext searchContext;
        searchContext = new ChromeDriver();
    }

    @Test
    public void checkAncestor() {

        System.setProperty("webdriver.chrome.driver", "D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\chromedriver.exe");

        driver.get("http://demo.guru99.com/test/guru99home/");
        // Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
        List<WebElement> dateBox = driver.findElements(By
                .xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

        for (WebElement webElement : dateBox) {
            System.out.println(webElement.getText());
        }

        driver.close();
    }

    @Test
    public void getParentName() {
        driver.get("https://www.guru99.com/");

        // Search the element by using PARENT
        WebElement w = driver.findElement(By.xpath("//*[@id='rt-feature']//parent::div"));

        // Print the text of the searched element
        System.out.println(w.getText());

        // Close the browser
        driver.quit();

    }

    @AfterClass
    public void afterClassTest() {
        driver.quit();
    }

}
