@card
Feature: Issue new card
 
  Background:
  	Given a member provided an access number 5784684
  	When an application is submitted
 
  Scenario: Unfinished card application should be saved and available once member continues application process
    Then the application details should be saved for future use
    
  Scenario: A new card number should be avilable from TSYS API after member submits application
    When a card number is requested by providing the member access number from TSYS API
    Then TSYS API should return a card number
