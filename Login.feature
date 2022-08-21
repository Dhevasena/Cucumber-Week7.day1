Feature: login to TestLeaf applicaation

Background: 
Given Launch the chrome browser
And Load URL and maximize

Scenario: Positive login
Given Type the username as 'demosalesmanager'
And Type the password as 'crmsfa'
When Click on Login button
Then Verify login successful


Scenario: Nagative login
Given Type the username as 'DemoSales1'
And Type the password as 'crmsfa1'
When Click on Login button
But Error invalid username or password

