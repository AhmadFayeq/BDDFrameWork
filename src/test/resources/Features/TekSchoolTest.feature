@TekSchoolTest
Feature: Tek School Test 

Background: 
	Given User go to  Tek School page 
	When  User click on test environment 
	
@LoginTest@smoketest@test 
Scenario: Login to test environment 

	When  User should see the test environment page 
	Then  User veriry test environment title 
	
@loginPage@test 
Scenario: Login to My Account 
	When User click on myAccount 
	And  User select login from dropdown 
	Then User should see login page 
	
@test001
Scenario Outline: Testing login with different user and pass 
	When User click on myAccount 
	And  User select login from dropdown 
	Then User should see login page 
	When User enter username <userName> 
	And  User enter password <password> 
	And  Click continue button 
	Then User should be logged in successfully 
	
	Examples: 
	
		|userName|password|
		|tes12@tek.com|test0011|
		#|tes13@tek.com|test0022|
		#|tes14@tek.com|test0033|
		
