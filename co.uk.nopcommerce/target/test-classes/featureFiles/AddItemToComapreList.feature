Feature: user can add an item to comaprelist

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

  Scenario: Verify user can able to add an item to compare list
   Given as a user I am at homepage
    When As  auserI click on gift cards link homepage
    And As a user I click on 25 pounds virtual gift card
    Then as a user I click on add to compare list the item should be added to compare list
