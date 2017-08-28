Feature: User change the item quantity

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

  Scenario: Verify user can change the selcted item quantity
    Given as a user I am at homepage
    When As a user I click on books link on home page
    And As a user I open First prize pies book
    And As a user I click on quantity button
    Then AS a user I click on change item quantity user can enter required number of items
