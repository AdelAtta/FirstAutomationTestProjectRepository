package org.example.pages;

import org.openqa.selenium.By;

public class LoginPO {
    public By LoginPage =By.className("ico-login");
    public By YourEmail =By.id("Email");
    public By EnterYourPassword =By.id("Password");
    public By LoginButton=By.xpath("//button[@class='button-1 login-button']");
    public By LoginSuccessfully= By.className("ico-account");
    public  By RegisterFailMessage=By.cssSelector("div[class='message-error validation-summary-errors']");

}
