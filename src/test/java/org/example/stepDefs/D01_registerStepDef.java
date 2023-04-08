package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.pages.P01_register;
import org.example.pages.RegisterPO;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D01_registerStepDef {
    P01_register registerActions= new P01_register();
    @Given("I click on register page")
    public void navigate_to_register_page(){
        registerActions.NavigateToRegisterPage();
    }


@When("I select gender")
public  void  iselectthegender(){
        registerActions.SelectGender("gender-male");
        Assert.assertTrue(registerActions.getGender(),("gender-male"));

}
    @When("I enter a valid firstname")
    public void iEnterAValidFirstname() {
registerActions.sendFirstName("Adel");
        Assert.assertEquals(registerActions.getFirstName(),"Adel");
    }
    @Then("I enter a valid last name")
    public void ientervalidlastname(){
        registerActions.sendLastName("Atta");
        Assert.assertEquals(registerActions.getLastName(),"Atta");
    }
    @And("i select my birthdate day")
    public void ichoosebirthdateday(){
        registerActions.selectFromDropMenuForDay("24");
        Assert.assertEquals(registerActions.getSelectedDay(),"24");
    }
@When("i select my birthdate month")
    public void ichoosebirthdatemonth(){
        registerActions.selectFromDropMenuForMonth("November");
        Assert.assertEquals(registerActions.getSelectedMonth(),"November");
  }
@When("I select my birthdate year")
        public void ichoosebirthdateyear(){
    registerActions.selectFromDropMenuForYear("1993");
    Assert.assertEquals(registerActions.getSelectedYear(),"1993");
        }
        @Then("I enter valid Email")
    public void ientervalidemail(){
        registerActions.SendYourSelectEmail("a_ahmed_atta@hotmail.com");
        Assert.assertEquals(registerActions.getYourSelectEmail(),"a_ahmed_atta@hotmail.com");
        }
        @Then("I enter valid password")
    public void ientervalidpassword(){
        registerActions.SendNewPassword("123456@A");
        Assert.assertEquals(registerActions.getNewPassword(),"123456@A");
        }
        @Then("I confirm the valid password")
    public void iconfirmthevalidpassword(){
        registerActions.SendConfirmationPassword("123456@A");
        Assert.assertEquals(registerActions.getConfirmationPassword(),"123456@A");
        }
        @And("I enter company name")
    public void ientercompanyname(){
        registerActions.SendCompanyName("Test Automation Company");
        Assert.assertEquals(registerActions.getCompanyName(),"Test Automation Company");
        }
        @Then("I select news letter check box")
    public void iselesctcheckbox(){
        registerActions.SelectNewsletter("Newsletter");
        Assert.assertTrue(registerActions.getNewsletter(),"Newsletter");
        }
        @And("I click on register button")
    public void iclicksubmitbutton() {
            Hooks.driver.findElement(By.id("register-button")).click();
        }



    @And("Registration Successfully")
    public void registerationSuccessfully() {
        registerActions.RegisterationSuccessfully();
    }

    @And("get Color")
    public void getColor() {
        registerActions.getColor();
    }
    @And("success message is displayed")
    public void successMessageIsDisplayed() {
        registerActions.SuccessMessageIsDisplayed();
    }


}
