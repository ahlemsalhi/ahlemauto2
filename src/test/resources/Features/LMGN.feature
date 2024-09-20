@assuren
Feature: Création d'un nouveau assuré
Scenario:Création nouveau assuré type test
  When je me connecte à LMG
  And je rentre mon mail
  Then je reçois le mail avec bouton de simulation
  When je clique sur le bouton simulation
  Then je serai redirigé vers une nouvelle fenétre
  When je chlisis le type test et aiguille
  And je clique sur suivant
  Then je serai redirigé vers l'onglet couverture
  When je rajoute les droits
  And je clique sur suivant
  Then je serai redirigé vers mes infos