
Feature: Login to Okta and automate Pitchbook.
  I want to use this feature to automate pitchbook.


  Scenario Outline: Verify Login to Okta
    Given User open browser and navigate to okta login page
    When user Enters <Username> and <Password>
    And Click on signin button
    Then User navigates to the homepage of the pitch book
     
     Examples: 
     | Username | Password|
     |rs_demo| CeF1UMchGc0ymcMqIgaTcQ==|