Feature: Create a new lead in Leaftaps Application

Background: Positive login
Given Type the username as 'demosalesmanager'
And Type the password as 'crmsfa'
When Click on Login button
Then Verify login successful

Scenario Outline:Create a new Lead
Given Click on CRMSFA link
And Click on Leads tab
When Enter Company Name as <companyName>
And Enter first Name as <firstName>
And Enter Surname as <surName>
And Enter the Firstname Local as <firstNameLocal>
And Enter the department as <department>
And Enter the Description as <description>
And Enter the Email as <Email>
And Click on Submit button
Then Verify view leads page

Examples:
|companyName|firstName|surName|firstNameLocal|department|description|Email|
|TCS|Dhevasena|Ravi|Ruthika|CS|Computer Science|Dhevasnkr@gmail.com|
|Virtusa|Dheva|Ravi|Rudra|CS|Computer Science|Dhevaravi@gmail.com|

