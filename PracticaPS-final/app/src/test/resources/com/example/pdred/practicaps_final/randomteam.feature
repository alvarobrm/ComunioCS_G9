Feature: generate a random team 
	As an user I want to be given a random team when I join a league
	My user should not be in that league before

Scenario:
	Given an user who joins a new league
	And there are at least 2 goalkeepers, 5 defenders, 4 midfield players and 4 forwards in the free agent list
	When the user joins the league
	Then his team is randomly generated with the players in the free agent list
	
Scenario:
	Given an user who joins a new league
	And there are only forwards in the free agent list
	When the user joins the league
	Then the app should show me an error message

Scenario:
	Given an user who joins a new league
	And there are only defenders in the free agent list
	When the user joins the league
	Then the app should show me an error message

Scenario:
	Given an user who joins a new league
	And there are only midfield players in the free agent list
	When the user joins the league
	Then the app should show me an error message

Scenario:
	Given an user who joins a new league
	And there are only goalkeepers in the free agent list
	When the user joins the league
	Then the app should show me an error message
