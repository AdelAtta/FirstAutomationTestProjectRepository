@smoke
Feature:need to select random one of the three main categories in home page
    Scenario: should hover on the selected category (computer)
      Given start hover on computer category
      Then select the sub category notebooks
      Then  text of the page title after selected sub category
      And Desk top Header

