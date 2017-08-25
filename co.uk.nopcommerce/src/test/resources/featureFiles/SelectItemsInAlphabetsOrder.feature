Feature: user can able to see the items in alphabets order

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

  Scenario: Verify user can see the items list in alphabets order
    Given as a user I am at homepage
    When As user I click on electronics link on homepage
    And As a user I open cellphones list
    And As a user I click on sort by box
    Then as a user I select a-z order then user can see all items in alphabets order
