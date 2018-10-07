@belly
Feature: Belly
  Exercise the Belly Feature
  
Scenario: a few cukes
  Given I have 42 cukes in my belly
  And I reduce the number of cukes
  When I wait 1 hour
  Then my belly should growl