Feature: Static Login Functionality of Leaftaps Application

#common steps in Scenarios can be added under background keyword
Background:
Given Launch the browser and Load the Url

#Tags're cucumber attributes 2 categorize d scenarios(smoke/sanity/reg) & control it

@smoke @regression
Scenario: Login with Positive credentials
#Given Launch the browser and Load the Url
When Enter the user as Demosalesmanager
And Enter the password as crmsfa
And Click on Login button
Then Homepage should be displayed

@sanity @smoke
Scenario: Login with Negative credentials
#Given Launch the browser and Load the Url
When Enter the user as 'Demosalesmanage'
And Enter the password as 'crmsfa'
And Click on Login button
But Homepage should not be displayed