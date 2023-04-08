@Smoke
Feature: Register
Scenario: Validate the register page
  Given I click on register page
  When I select gender
  When I enter a valid firstname
  Then  I enter a valid last name
  And i select my birthdate day
  When i select my birthdate month
  When I select my birthdate year
  Then I enter valid Email
  And  I enter company name
  Then I select news letter check box
  Then I enter valid password
  Then I confirm the valid password
  And I click on register button
  And Registration Successfully
  And success message is displayed
  And get Color

