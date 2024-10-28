Feature: Lead Module
Scenario: Converting lead into potential
Given User should be present in CRm Home page 
When He clicks on leads module
Then Leads Page should be displayed
When He clicks on new Lead button
Then Create Lead page should be displayed
When He enters the company name as "Accenture"
And He enters the last name as "Starc"
And He clicks on save button
Then Lead details page should be displayed
When He clicks on convert button
Then Leads Conversion page should be displayed
When he enters Potential closing date as "11/14/2024"
And he selects potential stage as negotiation
When he clicks on save button
Then account details page should be displayed
When he clicks on potential link
Then the potential link should be displayed in the potential list
