Feature: Signup As a user, I want to be able to signup for the site so that I can access the site's features.
 Scenario Outline: Signup with credential
 Given I am on the Signup page
  When I enter a FirstName "<First Name>"
  And I enter a Last Name "<Last Name>"
  And I enter the DOB 
  And I am able to pick the gender
  And I enter the Citizenship
  And I enter the Current Location 
  And I enter the Mobile Number "<Mobile Number>"
  And I enter the Valid Email "<Email>"
  And I am able to enter the create account button
  Then I should be redirected to the dashboard page


 Examples:
    |First Name |Last Name | Mobile Number |Email                   | 
    | Vasanth   | Tester   | 9988776655    |mayilol394@hrisland.com |
  




