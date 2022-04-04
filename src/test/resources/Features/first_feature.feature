Feature: Login to application
	This is a test to check login functionality
	
	Scenario Outline: Check Valid Login
		Given I am on automationpractice
		When I click on SignIn link
		And I enter username <username>
		And I enter password <password>
		And I click SigIn button
		Then I should be logged in to the application
	
	Examples:
	|username|password|
	|shailesh@test.com|password|
	
		


