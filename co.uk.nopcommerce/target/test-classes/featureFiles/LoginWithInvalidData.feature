Feature: Login functionality with invalid data

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

@satya111
  Scenario: Verify login functionality with invalid data
    Given As a user I am at home page
    When As a user I click on login button
    And As a user I enter invalid data into email and password field
    Then As a user I click on login button tehn user not be able to login into the website
