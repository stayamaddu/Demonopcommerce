Feature: Change products cost from US-Dollars to Euros

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

@satya12
  Scenario: Verify user can see the items rates from us-dollars to euros
    Given as a user I am at homepage
    When As a user I click on books link on homepage
    And As a user I click on currency box
    Then As a user I slected euro option I can see all books cost in euros
