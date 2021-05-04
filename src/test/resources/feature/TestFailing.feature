@fail
Feature: I'm testing the rerun
  Scenario:
    Given I run the maven with command line using parameter
    Then I should see failed test rerun

  Scenario:
    Given I run the maven with command line using parameter a
    Then I should see failed test rerun a

  Scenario:
    Given I run the maven with command line using parameter b
    Then I should see failed test rerun b