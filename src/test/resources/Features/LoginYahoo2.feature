@loginyahooo
Feature:Se connecter à yahooo
Scenario: se connecter à yahoopers
Given je me connecte à yahoo
When je rentre des identifiants valides <username> ET <Password>
And je clique sur suivant
 Then la boite yahoo souvre

#Examples:
   #|username|Password|
 # |mutuelleahlemauto@yahoo.com|Talantalan12345@@@@|