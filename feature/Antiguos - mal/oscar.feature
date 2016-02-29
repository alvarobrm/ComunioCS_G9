Feature: As an user, I want to press the "Menu" button to see my username and points.

	Scenario: User has not an assigned league
		Given User press the "Menu" button
		And he is not on a league
		When the new page loads
		Then he should see an alert to join a league
	Scenario: User has an assigned league
		Given User press the "Menu" button
		And he is on a private league
		When the new page loads
		Then he should see his username and points
	Scenario: Season isn't started
		Given User press the "Menu" button
		And he is on a private league
		When the new page loads
		Then he should see an alert to wait for the season's start
	Scenario: Season is finished
		Given User press the "Menu" button
		And he is on a private league
		When the new page loads
		Then he should see his username, points and final rank on his league
	Scenario: Session token is expired
		Given User press the "Menu" button
		When the new page loads
		Then he should redirected to the loging page

	