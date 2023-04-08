@smoke
  Feature: "Follow us" links at the end of the page
    Scenario:user opens facebook link
      Given open facebook link
      Then  verify that current url is equal facebook link

    Scenario:user opens Twitter link
      Given open Twitter link
      Then verify that current url is equal Twitter link

      Scenario: user opens Rss link
        Given open Rss link
        Then verify that current url is equal Rss link


        Scenario:user opens Youtube link
          Given open Youtube link
          Then verify that current url is equal Youtube link