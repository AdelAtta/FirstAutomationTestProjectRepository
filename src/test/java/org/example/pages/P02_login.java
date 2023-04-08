package org.example.pages;


import io.cucumber.java.en.Then;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {
    LoginPO loginPO = new LoginPO();
    SoftAssert softAssert = new SoftAssert();


    public void navigate_to_login_page(){
        Hooks.driver.findElement(loginPO.LoginPage).click();
    }
    public void SendYourEmail(String Enteremail ){
        driver.findElement(loginPO.YourEmail).sendKeys(Enteremail);

    }
    public String getYourEmail(){
        String Name = driver.findElement(loginPO.YourEmail).getAttribute("value");
        return Name;
    }
    public void SendYourSelectPassword(String EnterPassword){
        driver.findElement(loginPO.EnterYourPassword).sendKeys(EnterPassword);

    }
    public  String getYourPassword(){
        String Name= driver.findElement(loginPO.EnterYourPassword).getAttribute("value");
        return Name;
    }
    public void IClickOnLoginButton(){
        Hooks.driver.findElement(loginPO.LoginButton).click();
;
    }
    public WebElement AccountLinkDisplayed(){

     return   Hooks.driver.findElement(loginPO.LoginSuccessfully);

    }
    public void getRegisterFailMessagee(){
        Assert.assertTrue(Hooks.driver.findElement(loginPO.RegisterFailMessage).getText().contains("Login was unsuccessful."));
    }
    public WebElement LoginFailed(){
        return Hooks.driver.findElement(loginPO.RegisterFailMessage);
    }

   public void FailMessageColor(){
    Assert.assertTrue(Color.fromString("rgba(228, 67, 75, 1)").asRgb().equals(LoginFailed().getCssValue("color")));
   }



  }