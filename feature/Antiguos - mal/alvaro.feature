Feature: register in the app
as an user i want to register in my app
I should not be registed until i introduce my info

  Scenario: Correct Sign up
    Given an username and the passwords
      And the user isn´t registed yet
     When i insert the info and click the button 
     Then I should be registed successfully
     
  Scenario: Existing username
    Given an username 
      And the user is already registed 
     When i insert the info and click the button 
     Then the app should show me an error message
     
 Scenario: passwords don´t match 
    Given an username and the passwords
      And the two passwods are difetent 
     When i insert the info and click the button 
     Then the app should show me an error message
     
  Scenario: Connection error
    Given an user name and the passwords
      And the user isn´t register yet
     When i insert the info and click the button 
     Then nothing happends because no connection
     
  Scenario: Cancel Sign up
    Given an user name and the passwords
     When i click the cancel button 
     Then the app returns me to the main menu
