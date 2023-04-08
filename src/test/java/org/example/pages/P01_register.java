package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class P01_register {
    RegisterPO registerPO= new RegisterPO();

    public void NavigateToRegisterPage(){
        Hooks.driver.findElement(registerPO.RegisterPage).click();
    }
    public void SelectGender(String  gender )
    {
        if(gender.equalsIgnoreCase("gender-male"))
            Hooks.driver.findElement(registerPO.Gender).click();

    }
    public  Boolean getGender() {
        Boolean Name= Hooks.driver.findElement(registerPO.Gender).isSelected();
        return Name;
    }
    public void sendFirstName(String Fname   )
    {
        Hooks.driver.findElement(registerPO.FirstName).sendKeys(Fname);

    }
    public  String getFirstName() {
        String Name= Hooks.driver.findElement(registerPO.FirstName).getAttribute("value");
        return Name;
    }
    public void sendLastName(String Lname )
    {
       Hooks.driver.findElement(registerPO.LastName).sendKeys(Lname);

    }
    public  String getLastName() {
        String Name= Hooks.driver.findElement(registerPO.LastName).getAttribute("value");
        return Name;
    }
    public void selectFromDropMenuForDay(String DateOfBirthDay  )
    {
        Select DropMenuForDay=new Select(Hooks.driver.findElement(registerPO.DropMenuForDay));
        DropMenuForDay.selectByVisibleText(DateOfBirthDay);

    }
    public String getSelectedDay(){
        Select DropMenuForDay= new Select(Hooks.driver.findElement(registerPO.DropMenuForDay));
        return DropMenuForDay.getFirstSelectedOption().getText();
    }
    public void selectFromDropMenuForMonth(String  DateOfBirthMonth  )
    {
        Select DropMenuForMonth=new Select(Hooks.driver.findElement(registerPO.DropMenuForMonth));
        DropMenuForMonth.selectByVisibleText(DateOfBirthMonth);

    }
    public String getSelectedMonth(){
        Select DropMenuForMonth= new Select(Hooks.driver.findElement(registerPO.DropMenuForMonth));
        return DropMenuForMonth.getFirstSelectedOption().getText();
    }
    public void selectFromDropMenuForYear(String  YearOfBirthdate  )
    {
        Select DropMenuForYear=new Select(Hooks.driver.findElement(registerPO.DropMenuForYear));
        DropMenuForYear.selectByVisibleText(YearOfBirthdate);

    }
    public String getSelectedYear()
    {
        Select DropMenuForYear=new Select(Hooks.driver.findElement(registerPO.DropMenuForYear));
        return DropMenuForYear.getFirstSelectedOption().getText();

    }
    public void SendYourSelectEmail (String  EnterYourEmail)
    {
        Hooks.driver.findElement(registerPO.YourSelectEmail).sendKeys(EnterYourEmail);

    }
    public String getYourSelectEmail(){
        String Name=Hooks.driver.findElement(registerPO.YourSelectEmail).getAttribute("value");
        return Name;
    }
    public void SendCompanyName (String EnterCompanyName)
    {
        Hooks.driver.findElement(registerPO.CompanyName).sendKeys(EnterCompanyName);

    }
    public String getCompanyName(){
        String Name=Hooks.driver.findElement(registerPO.CompanyName).getAttribute("value");
        return Name;
    }
    public void SelectNewsletter (String  Newsletter   )
    {
        if(Newsletter.equalsIgnoreCase("Newsletter"))
            Hooks.driver.findElement(registerPO.Newsletter).isSelected();

    }
    public  Boolean getNewsletter  (){
        Boolean value=Hooks.driver.findElement(registerPO.Newsletter).isSelected();
        return value;
    }
    public void SendNewPassword (String  NewPassword   )
    {
        Hooks.driver.findElement(registerPO.NewPassword).sendKeys("123456@A");

    }
    public String getNewPassword(){
        String Name=Hooks.driver.findElement(registerPO.NewPassword).getAttribute("value");
        return Name;
    }
    public void SendConfirmationPassword (String  ConfirmPassword   )
    {
        Hooks.driver.findElement(registerPO.ConfirmationPassword).sendKeys(ConfirmPassword );

    }
    public String getConfirmationPassword(){
        String Name=Hooks.driver.findElement(registerPO.ConfirmationPassword).getAttribute("value");
        return Name;

    }
    public WebElement RegisterationSuccessfully(){
return  Hooks.driver.findElement(registerPO.RegisterationSuccessfully);
    }
public  void getColor(){
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(Color.fromString("rgba(76, 177, 124, 1)").asRgb().equals(RegisterationSuccessfully().getCssValue("color")));
        softAssert.assertAll();
}
    public void SuccessMessageIsDisplayed(){
        SoftAssert softAssert= new SoftAssert();
        Assert.assertEquals("Your registration completed",RegisterationSuccessfully().getText());
        softAssert.assertAll();

    }

}
