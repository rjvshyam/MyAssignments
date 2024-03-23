Feature: w3schools registration process

Background: 
Given Launch the browser and load the url
When Switch to the iframe

Scenario: Login with valid credentials
And Enter the Fullname as shyam
And Enter the Email address as 'shyam@gmail.com'
And Enter the Address as 'Big street, Anakaputhur'
And Enter the City name as chennai
And Enter the State name as tamilnadu
And Enter the Zip name as '600070'
And Enter the Expiry year as '2018'
And Enter the CVV as '123'
And Enter the Expiry month as October
And Enter the Credit card number as '1111-2222-3333-4444'
And Enter the Card name as shyamshyam
And Click on Checkout button
Then Verify the message for successful registration

Scenario: Login with invalid credentials
And Enter the Fullname as shyam
And Enter the Email address as 'gmail.com'
And Enter the Address as 'Big street, Anakaputhur'
And Enter the City name as chennai
And Enter the State name as tamilnadu
And Enter the Zip name as '600070'
And Enter the Expiry year as '2018'
And Enter the CVV as '123'
And Enter the Expiry month as October
And Enter the Credit card number as '1111-2222-3333-4444'
And Enter the Card name as shyamshyam
And Click on Checkout button
But Verify no message for successful registration