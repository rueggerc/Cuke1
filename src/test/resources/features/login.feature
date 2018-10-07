@login
Feature: Login Action
  User Logs into System
  
Scenario: Successful Login
	Given User is on Home Page
	When User Navigates to Login Page
	And User enters Username and Password
	Then Message is displayed Login Succeeded
	
Scenario: Successful Logout
	When User LogOut from the Application
	Then Message Displayed Logout Succeeded