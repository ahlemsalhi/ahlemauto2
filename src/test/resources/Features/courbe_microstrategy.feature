@courbe
Feature:Vérifier le prix des chambres en fonction de leurs types
Scenario: Vérifier le prix des chambres en fonction de leurs types

  Given je suis connectée à microstategy web en renseignant des données valides
  When j'importe des nouveaux données du fichier excel
  Then les données sont bien importées
  When je drag and drop le prix vers la case vertical
  Then le prix sera glissé avec succés
  When je drag and drop le room type vers horizontal
  Then le room type sera glissé avec succés
  When je vérifie le prix des rooms en fonction de leurs type
  Then les prix de entire home ,private ,share room sont vérifiés