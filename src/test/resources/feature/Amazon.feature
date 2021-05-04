@AmazonCart
Feature: Add item to shopping cart
  Scenario Outline: As a user I should be able to add items into shopping cart
    Given user is on amazon homepage
    When user search for "<item>"
    And  click the first result


    Examples:
      | item |
      | mask |