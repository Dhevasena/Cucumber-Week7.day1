Feature: Edit lead in Leaftaps Application

Background: Positive login
Given Type the username as 'demosalesmanager'
And Type the password as 'crmsfa'
When Click on Login button
Then Verify login successful

Scenario Outline:Edit a Lead in Leaf Taps
Given Click on CRMSFA edt
And Click on leads tab
And Click on findLeads shortcut
When Click on Duplicate lead button
Then Enter new Company Name as <companyName>
And Enter new first Name as <firstName>
And Enter new  Surname as <surName>
And Click on Submit button on edit Lead page
Then Verify Edit Lead Page

Examples:
|companyName|firstName|surName|
|TCS|Dhevasena|Ravi|
|Virtusa|Dheva|Ravi|