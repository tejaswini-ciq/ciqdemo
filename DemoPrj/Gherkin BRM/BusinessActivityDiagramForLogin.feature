Feature: BusinessActivityDiagramForLogin




@TEST0001
Scenario Outline: Node Activity 'Activity Node 1'
When User enters the valid login credentials. User enter the following:
 <username> 
 <password>
And Click on Sign In Button
Examples:
	|username|password|
	|valid|valid|


@TEST0002
Scenario Outline: Node Business Activity 'ErrorProcessing'
When User enters the valid login credentials. User enter the following:
 <username> 
 <password>
And Click on Sign In Button
When ErrorProcessing is performed
Then ErrorProcessing completes
Examples:
	|username|password|
	|invalid|invalid|


@TEST0003
Scenario Outline: Node Business Activity 'Bill Pay'
When User enters the valid login credentials. User enter the following:
 <username> 
 <password>
And Click on Sign In Button
When Bill Pay is performed
Then Bill Pay completes
Examples:
	|username|password|
	|valid|valid|


