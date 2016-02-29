Feature:Remove a footballer from a first team
	The footballer should be in the first team
	The footballer should not be remove untill I click on him
	
Scenario: Remove the goalkeeper
	Given there is a goalkeeper in my team
	When I click on the goalkeeper in my team
	Then the goalkeeper is removed from the first team
	And the goalkeeper stays in the bench 
	
Scenario: Remove a defender
	Given I have at least one defender in my first team
	When I click on one of the defenders in my team
	Then that defender is removed from the first team
	And the defender stays in the bench

Scenario: Remove a midfield player
	Given I have at least one midfield player in my team
	When I click on one of the midfield players in my team
	Then that midfield player is removed from the first team
	And the midfield player stays in the bench 

Scenario: Remove a forward
	Given I have at least one forward in my team
	When I click on one of the forwards in my team
	Then that forward is removed from the first team
	And the forward stays in the bench

Scenario: Try to remove a void position
	Given I have a void position in my first team
	When I click on the void position
	Then the app should show me an error message