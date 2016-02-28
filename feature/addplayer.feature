Feature: insert a player into my first team
	As an user I want to be able to insert the players i have into my first team
	A player should be inserted in my first team when I click on his button if his position is empty
	A player should not be inserted in my first team if there are enough players in his position

Scenario:
	Given a forward in my team 
	And that forward is not in my fisrt team
	And at least 1 of the forwards' position is empty
	When I click on the button to insert the forward into my first team
	Then the forward should be inserted in my first team
	
Scenario:
	Given a midfield player in my team 
	And that midfield player is not in my fisrt team
	And at least 1 of the midfields' position is empty
	When I click on the button to insert the midfield player into my first team
	Then the midfield player should be inserted in my first team

Scenario:
	Given a defender in my team 
	And that defender is not in my fisrt team
	And at least 1 of the defenders' position is empty
	When I click on the button to insert the defender into my first team
	Then the defender should be inserted in my first team

Scenario:
	Given a goalkeeper in my team 
	And that goalkeeper is not in my fisrt team
	And the goalkeeper's position is empty
	When I click on the button to insert the goalkeeper into my first team
	Then the goalkeeper should be inserted in my first team

Scenario:
	Given two goalkeepers in my team 
	And one goalkeeper is in my fisrt team
	When I click on the button to insert the other into my first team
	Then the app should show me an error message
