package org.example.pages;

import org.openqa.selenium.By;

public class RegisterPO {
    public  By RegisterPage = By.className("ico-register");
    public By Gender=By.id("gender-male");
    public By FirstName=By.id("FirstName");

    public  By LastName=By.id("LastName");
    public By DropMenuForDay=By.name("DateOfBirthDay");
    public By DropMenuForMonth=By.name("DateOfBirthMonth");
    public By DropMenuForYear=By.name("DateOfBirthYear");
    public By YourSelectEmail=By.id("Email");
    public  By CompanyName=By.id("Company");
    public  By Newsletter=By.id("Newsletter");
    public By NewPassword=By.id("Password");
    public  By ConfirmationPassword=By.id("ConfirmPassword");
   public  By  RegisterationSuccessfully=By.cssSelector("div[class='result']");


}

