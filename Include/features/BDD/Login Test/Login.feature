
@tag
Feature: Login with valid account

  @tag1
  Scenario Outline: Login Successfully
    Given The Login is loaded successfully
    When I login the system with valid "<email>" username and "<password>" password


    Examples: 
      | email  						| password 					|
      | yudizdj@gmail.com | sPiHQ&YEa6ST`de+ 	|