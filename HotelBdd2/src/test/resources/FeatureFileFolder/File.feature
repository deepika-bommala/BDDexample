Feature: Hotel Login Functinality
Scenario: username password not entered
Given User on login page
When username password is blank
Then Display error message 'please enter username' 

Scenario: username  is entered password not entered
Given User on login page
When username is given but   password is blank
Then Display error message 'please enter password' 

Scenario: Invalid username and password
Given User on login page
When username  or  password is   invalid
Then Display alertBox  

Scenario: valid username and password
Given User on login page
 When username  and  password is  valid
Then navigate to nextpage 

Scenario: details are not entered
Given User on hotelbooking details page
 When firstname lastname are blank
Then Display error message 'please enter firstname'

Scenario: details are not entered
Given User on hotelbooking details page
 When  lastname are blank
Then Display error message 'please enter lastname'