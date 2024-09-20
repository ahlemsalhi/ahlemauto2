@datayahoo
Feature:Utiliser des datats sets multiple pour se connecter à yahoo
  Scenario:Utiliser des datats sets multiple pour se connecter à yahoo
    Given je rentre l'url de site de yahoo
    Then la page yahoo s'affiche
    When je rentre différents données  <usernamee> <Passwordd>
    Then le test passe
    Examples:
      | usernamee  | Passwordd  |
      | user1     | password1 |
      | user2     | password2 |