@assuré
Feature:création assuré et son conjoint
  Scenario:création assuré et son conjoint
    Given je suis connecté au portail mutuelle generale
    When je renseigne mon mail
    Then je reçois un mail contenant un code
    When je renseigne le code
    Then la rubrique mes informations s'affihce
    When je renseigne toutes les informations demandées
    Then un spinner s'affiche et on est transitionné vers la rubrique couverture
    When on remplir toutes les inforamtions demandées pour l'enfant ou le conjoint à adhérer
    And je clique sur suivant
    Then les informations sont bien saisies
   When on Switche le toggle  vers "Mon ayant droit est rattaché au régime "Alsace-Mosell"
   And on ajoute une piéce justificative
   Then le Toggle est switché et le document est chargé avec succés
    When on clique sur suivant
    Then on trouve la télétransmission est activée par défaut
    When on clique sur suivant
    Then On est redirigé vers la rubrique mes coordonnées
    When on renseigne une adresse de contact ,un numéro pour vous joindre
    And je clique sur suivant
    Then on serait redirigé  vers rubrique mon compte
   When on renseigne les données bancaires BIC et IBAN ,
   And je charge une relevée d'identité
   And je clique sur suivant
   Then on sera redirigé vers la rubrique mon récapitulatif
   When je vérifie les données saisies au niveau de l'onglet mon récap
   Then toutes les données saisies sont remontées correctement