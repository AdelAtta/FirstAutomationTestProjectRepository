package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public  static WebDriver driver;
    @Before
    public static void setup(){
    System.setProperty("webdriver.Edge.driver","src/main/Driver/msedgedriver.exe1");
    driver =new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.navigate().to("https://demo.nopcommerce.com/");


    }
    @After
    public  static  void teardown(){
        driver.quit();

    }
}
