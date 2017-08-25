Feature: User can select particular number of items per page

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

  Scenario: Verify user can select particular number of items per page
   Given as a user I am at homepage
    When As a user I open jewelry on homepage
    And As user I click on display per page box
    Then I can select required number of items per page
