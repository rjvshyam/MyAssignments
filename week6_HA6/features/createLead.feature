Feature: Create/Edit/Delete Lead from leaftaps application

Background:
#Given Launch the browser and load the leaftaps url
When Enter the Username as 'demosalesmanager'
And Enter the Password as 'crmsfa'
And Click on Login button
Then Homepage should be displayed
And Click on CRM-SFA link
And Click on Leads link

Scenario Outline: Create Lead with Multiple data
When Click on CreateLead link
And Enter the Company name as <company>
And Enter the Firstname as <fname>
And Enter the Lastname as <lname>
And Enter the Phonenumber as <phone>
And Click on Submit button
Then Verify Lead created successfully or not

Examples:
|company|fname|lname|phone|
|'testleaf1'|'shyam1'|'kumar1'|9876543210|
#|'testleaf2'|'shyam2'|'kumar2'|phone2|

Scenario Outline: Edit Lead
When Click on FindLeads link
And Enter the phone number as <phone>
And Click on FindLeads button
And Click on Founded Lead
And Click on Edit button
And Change the Company Name as HCL
Then Click on Edit Submit button

Examples:
|phone|
|'9876543210'|

Scenario Outline: Delete Lead
When Click on FindLeads link
And Enter the phone number as <phone>
And Click on FindLeads button
And Copy the LeadID
And Click on Founded Lead
And Click on Delete button
And Click on FindLeads link again
And Enter the deleted Lead ID
And Click on FindLeads button again
Then Verify Lead is deleted or not

Examples:
|phone|
|'9876543210'|

