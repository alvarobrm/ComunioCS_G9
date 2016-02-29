Feature: remove a player away of my first team
	As an user I want to be able to remove the players i have away of my first team
	A player should be removed away when I click on his button and he is already in my first team
	A player should not be removed if he is not in my first team

Scenario:
	Given a forward in my team 
	And that forward is in my fisrt team
	When I click on the button to remove the forward away of my first team
	Then the forward should be removed away 
	And that position should be set as empty
	
Scenario:
	Given a midfield player in my team 
	And that midfield player is in my fisrt team
	When I click on the button to remove the midfield player away of my first team
	Then the midfield player should be removed away
	And that position should be set as empty

Scenario:
	Given a defender in my team 
	And that defender is in my fisrt team
	When I click on the button to remove the defender away of my first team
	Then the defender should be removed away
	And that position should be set as empty

Scenario:
	Given a goalkeeper in my team 
	And that goalkeeper is in my fisrt team
	When I click on the button to remove the goalkeeper away of my first team
	Then the goalkeeper should be removed away
	And that position should be set as empty