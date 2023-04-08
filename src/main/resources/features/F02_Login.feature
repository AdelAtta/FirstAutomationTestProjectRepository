@smoke
  Feature:  users could use login functionality to use their accounts
    Scenario: Validate the login page with valid email and password
      Given I click on a login page
      Then  I enter the valid email
      Then  I enter the valid password
      And  I click on login button
      And  My account displayed

      Scenario: user could login with invalid email and password
        Given I click on a login page
        Then I enter the invalid email and invalid password
        And  I click on login button
        And Register Fail Messagee
        And Login Failed
        And Fail Message Color
