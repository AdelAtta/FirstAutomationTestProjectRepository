@smoke
  Feature: search using product name
    Scenario Outline: user could search using product name
      Given user navigates to demo.nopcommerce.com
      When I enter in search bar the name of product as "<username>"
      Then number of search result
      Then for loop
      Then search should be successful
      Examples:
      |username|
        |book|
      |laptop|
      |nike|
    Scenario Outline: user could search using product sku
      Given user navigates to demo.nopcommerce.com
      When I enter in search bar the name of product as "<sku>"
      Then click on the product in search result
      Then found product successfully


      Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|