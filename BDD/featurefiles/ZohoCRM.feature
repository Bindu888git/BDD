Feature: Lead Module
Scenario: Converting lead into potential
Given User should be present in CRM "Home Page" 
When He clicks on leads module
Then "Custom View Details" page should be displayed in the browser
When He clicks on new Lead button
Then "Create Lead" page should be displayed for a creating lead
When He enters the company name as "Wipro"
And He enters the last name as "Singh"
And He clicks on save button
Then "Lead Details" page should be displayed along with the lead details
When He clicks on convert button
Then "Leads Conversion" page should be for converting the lead
When he enters Potential closing date as "11/14/2024"
And he selects potential stage as negotiation
When he clicks on save btn
Then "Account Details" page should be displayed along with account details
When he clicks on potential link
Then the company name "Wipro" should be displayed in the "Custom View Details" page