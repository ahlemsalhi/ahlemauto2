@calculator
Feature:stimuler le montant à payer
  Scenario:stimuler le montant à payer
    Given je rentre l'url de site de calculator
    Then la page calculator s'affiche
    When je rentre différents données
    Then je trouve le résultat est conforme à l'excpectedd