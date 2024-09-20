@amazon
  Feature:passer une commande sur amazone et la payer
  Scenario: passer une commande sur amazone et la payer
    Given j'accede à la page d'accueil d'amazon
    When je rentre des identifiants valides du site
    And je cherche un produit spécifique
    And j'ajoute le produit au panier
    Then il sera ajouté avec succés
    When j'accéde au panier
    And je vérifie les détails du produit dans le panier
    Then il sera vérifié avec succés"
    When je procéde au paiement
    Then l'interface de paiement s'ouvre
    When je rentre les informations de livraison
    And je selectionne un mode de payement valide
    And je confirme le payement
    Then le produit sera payé avec succés

