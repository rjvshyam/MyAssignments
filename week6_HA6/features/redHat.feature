Feature: Registration process on the Red Hat portal

Background:
Given Launch the browser and load the Redhat url
When Click on the Register link button
Then Verify Registration form is displayed

Scenario Outline: Successful Registration process
When Enter the redhat Username as 'shyam'
And Enter the redhat Password as 'welcometohat@123'
And Enter the Confirm redhat Password as 'welcometohat@123'
And Enter the redhat Firstname as 'firstName'
And Enter the redhat Lastname as 'lastName'
And Enter the redhat Email as <email>
And Enter the redhat Phone as <phone>
And Choose the redhat AccountType as Personal
And Select the redhat Country as India
And Enter the redhat Address1 as <hNo>
And Enter the redhat Address2 as Big Street
And Enter the redhat Address3 as Main Nagar
And Enter the redhat Address4 as Anakaputhur
And Enter the redhat Postal as <600070>
And Enter the redhat City as Chennai
And Select the redhat State
Then Close the browser

Examples:
|email|phone|hNo|600070|
|'hat@gmail.com'|18887234281|'37'|'600070'|