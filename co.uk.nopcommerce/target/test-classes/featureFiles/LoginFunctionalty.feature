Feature: Checking login fuctionality

  Background: Open a browser and navigate to demo.nopcommerce website
    Given As a user I am at "http://demo.nopcommerce.com/"

@satya
  Scenario: Verify user can login with valid data
    Given as a user I am at homepage
    When I click on login button I enter into login page#
    And as a user I enter email id and password
    Then as a user click on login button then user can be able to login into the website
