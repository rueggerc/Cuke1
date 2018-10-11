@controller

Feature: CRUD Controller
	Operation is invoked on REST Controller
 
Scenario: Insert Transaction Data
	When User Has Data to Insert
	Then Data is Inserted Into Database