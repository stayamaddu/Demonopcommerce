Feature: Search an item in search box

  Background: Open a browser and navigate to demo.nopcommerce
    Given As a user I am at "http://demo.nopcommerce.com/"

  Scenario: Verify user can search a product by using search box on homepage
  Given as a user I am at homepage
    When As a user I click on search box
    And Asa user I enter laptops into the search box
    Then I click on search button related items should be displayed
