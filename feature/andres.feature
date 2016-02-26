Scenario Outline: Showing the league market
  Given <User> in <League> with <Player> in the league market
  When market button is pressed
  Then <Player> must be shown in the List
  And  <Player> price must be <Cost>

  Examples:
    | User| League | Player | Cost |
    | Mike|  Liga1 | Arbeloa| 10000|
    | Juan|  Liga1 | Giggs  | 300000|
    | David| Liga3 | Zico   | 500000|
    | Daniel| Liga2| Messi  | 400000|
	| Antonio| Liga5| Jesus | 30000|