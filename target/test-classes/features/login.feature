Feature: Application Login

Scenario: Home page default login
 Given user is on landing page
 When user login in application with "arv" and password "1234"
Then home page is dispayed
And cards are dislayed "true"

Scenario: Home page default login
 Given user is on landing page
 When user login in application with "anu" and password "1235"
Then home page is dispayed
And cards are dislayed "false"

Scenario: Home page default login
 Given user is on landing page
 When user login in application with "arv" and password "1236"
Then home page is dispayed
And cards are dislayed "true"

Scenario: Home page default login
 Given user is on landing page
 When user login in application with "govind" and password "1236"
Then home page is dispayed
And cards are dislayed "flase"

 
