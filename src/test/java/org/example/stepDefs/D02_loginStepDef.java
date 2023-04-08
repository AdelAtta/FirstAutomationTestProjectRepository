package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D02_loginStepDef {
    P02_login loginActions = new P02_login();

    @Given("I click on a login page")
    public void navigate_to_login_page(){
        loginActions.navigate_to_login_page();


    }
    @Then("I enter the valid email")
    public void ienterthevalidname(){
        SoftAssert softAssert=new SoftAssert();
      loginActions.SendYourEmail("a_ahmed_atta@hotmail.com");
        softAssert.assertEquals(loginActions.getYourEmail(),"a_ahmed_atta@hotmail.com");
        softAssert.assertAll();
    }
    @Then("I enter the valid password")
    public void ienterthevalidpassword(){
        SoftAssert softAssert=new SoftAssert();
        loginActions.SendYourSelectPassword("123456@A");
        softAssert.assertEquals(loginActions.getYourPassword(),"123456@A");
        softAssert.assertAll();
    }
    @And("I click on login button")
    public void iclickonloginbutton(){
        loginActions.IClickOnLoginButton();

    }
    @And("My account displayed")
    public void  checkmyaccountdisplayed(){
loginActions.AccountLinkDisplayed();

    }

    @Then("I enter the invalid email and invalid password")
    public void ientertheinvalidemail(){
        SoftAssert softAssert =new SoftAssert();
        loginActions.SendYourEmail("a_amed_ata@hotmail.com");
        softAssert.assertEquals(loginActions.getYourEmail(),"a_ahmed_atta@hotmail.com","wrong email.");
        loginActions.SendYourSelectPassword("123456");
       softAssert.assertEquals(loginActions.getYourPassword(),"123456@A","wrong password.");
       softAssert.assertAll();


    }

    @And("Register Fail Messagee")
    public void registerFailMessagee() {
        loginActions.getRegisterFailMessagee();
    }

    @And("Login Failed")
    public void loginFailed() {
        loginActions.LoginFailed();
    }

    @And("Fail Message Color")
    public void failMessageColor() {
        loginActions.FailMessageColor();
    }





}
