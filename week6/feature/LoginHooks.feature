Feature: Hooks Login Functionality of Leaftaps Application1

Scenario: Hooks Login with Positive credentials
#Given Hooks Launch the browser and Load the Url
When Hooks Enter the user as Demosalesmanager
And Hooks Enter the password as crmsfa
And Hooks Click on Login button
Then Hooks Homepage should be displayed
