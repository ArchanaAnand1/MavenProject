@UATTesting
Feature: Youube search validation
#Adding comment
	Scenario Outline: Youtube search positive scenarios
	Given open chrome and enter URL and search "<Search>"
	When enter search criteria

Examples:

	|Search|
	|Bakkappa selenium|
	|Firends|
