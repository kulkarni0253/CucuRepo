Feature: Facebook login
As a fb user, I want to enter username and pwd as a 

Scenario: validate fb login Scenario1
Given the user is on facebook login page
When he enters "Harshal" as username
And he enters "Kulkarni" as password
Then check username is present in textbox