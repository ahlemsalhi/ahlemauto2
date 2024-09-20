@Search
Feature:Search on meteroperators
  Scenario:search invalid and valid text
    Given je rentre lurl de meteroperators
    When je clique sur la barre de recherche en tappant le mot testtest
    And je clique sur la loope
    Then aucune resultat ne sera trouve
    When je rentre le mot test dans la barre de recherche
    And je clique sur le bouton entree
    Then la liste contenant le mot test saffiche
    When je recherche avec autre mot de la liste
    And je clique sur la loupe
    Then la liste contenant la recherche saisie saffiche
