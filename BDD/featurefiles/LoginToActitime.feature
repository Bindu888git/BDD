Feature: Actitime Login feature
Scenario Outline: Multiple login
Given User should enter "http://localhost/login.do" in the browser
When He enters valid username as "<username>"
And he enters valid password as "<password>"
And he clicks on login button
Then Actitime home page should be displayed

Examples:
|username|password|
|admin|manager|
|nikhil|patil|
|data|driven|

