Feature: User able to add an item to the whishlist

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

  Scenario: Verify user can able to select item to the whishlist
    Given as a user I am at homepage
    When As a user I click on jewelry link on homepage
    And AS a user I click on flower girl bracelet item
    And As a user I click on whishlist button
    Then user can see selcted item in the whishlist
