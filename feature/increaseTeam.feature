Feature: 
As a user
I want that the total value of my team increase when a new player is added

  Scenario:
    Given A team with a set of players
     When i add Player1 with the price 1000
     Then the team's total value increases 1000
     
  Scenario:
    Given A team with a set of players
     When i add Player2 with the price 3000
     Then the team's total value increases 3000

  Scenario:
    Given A team with a set of players
     When i add Player3 with the price 1300
     Then the team's total value increases 1300
     
  Scenario:
    Given A team with a set of players
     When i add Player4 with the price 6000
     Then the team's total value increases 6000

  Scenario:
    Given A team with a set of players
     When i add Player5 with the price 10000
     Then the team's total value increases 10000