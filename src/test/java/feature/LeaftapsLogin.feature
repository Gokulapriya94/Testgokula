Feature: Leaftaps Login Testcases

#Scenario: TC001 Positive Flow
#
#	Given Open the Chrome Browser
#	And Maximise the Browser
#	And Set the Timeouts
#	And Load the URL
#	And Enter the Username as DemoSalesManager
#	And Enter the Password as crmsfa
#	When User Click on the Login Button
#	Then Verify Login is success

Background:
   	Given Open the Chrome Browser
	And Maximise the Browser
	And Set the Timeouts
	And Load the URL
	
Scenario Outline: TC001 Positive Flow

	Given Enter the Username as <username>
	And Enter the Password as <password>
	When User Click on the Login Button
	Then Verify Login is success
	
Examples:
	|username|password|
	|Demosalesmanager|crmsfa|
	|DemoCFA|crmsfa|

Scenario Outline: TC002 Negative Flow

	Given Enter the Username as <username>
	And Enter the Password as <password>
	When User Click on the Login Button
	But Verify Login is Failed
	

Examples:
	|username|password|
	|Demosalesmanag|crmsfa|
	|DemoCFA|crmsfa|
#Scenario: TC002 Positive Flow
#
#	Given Open the Chrome Browser
#	And Maximise the Browser
#	And Set the Timeouts
#	And Load the URL
#	And Enter the Username as DemoCSR
#	And Enter the Password as crmsfa
#	When User Click on the Login Button
#	Then Verify Login is success