Feature: User can select items by price range

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

  Scenario: Verify user can select items according to the price range
  Given as a user I am at homepage
    When As a user I open books on homepge
    And As a user I select items range under 25 pounds
    Then as a user I can see the items range under 25 pounds
