Feature: CreateLead functionality of Leaftaps Application

Scenario Outline: Create Lead with Multiple data
Given Launch the browser and Load the Url
When Enter the user as Demosalesmanager
And Enter the password as crmsfa
And Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
And Enter CompanyName as <companyname>
And Enter FirstName as <fname>
And Enter LastName as <lname>
And Click on Submit button
Then ViewLeads page should be displayed

Examples:
|companyname|fname|lname|
|'Testleaf1'|'shyam1'|99|
|'Testleaf2'|'shyam2'|kumar2|