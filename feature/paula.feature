Feature: Log in
	An User must be able to
	log in entering a username 
	and password

	Scenario: Correct Log in
		Given an username an password correct
		When I try to log in to comunio
		Then I should log in
	Scenario: Correct Username, Incorrect Password
		Given a correct username 
		And an incorrect password
		When I try to log in to comunio
		Then I have to put the username and password again
	Scenario: Incorrect Username, Correct Password
		Given an incorrect username 
		And a correct password
		When I try to log in to comunio
		Then I have to put the username and password again
	Scenario: Incorrect Username, Incorrect Password
		Given an incorrect username 
		And an incorrect password
		When I try to log in to comunio
		Then I have to put the username and password again