@Huk
Feature:verifier le clic et l'affichage des boutons et menus sur le site
Scenario:verifier le clic et l'affichage des boutons et menus sur le site
    Given je rentre l'url de site HUK
    When je rentre des identifiants valide
    Then la page home s'affiche
    When je vérifie les menus horizontals
    Then je les trouve affichés d'une façon horizontale
    When je survolle la souris sur le menu events
    Then je pourrais afficher le sous menu Annual Conference
    When je survolle le sous menu annual conference
    Then je pourrais afficher les options by tickets et exhebition et speakers et sponsors and partners et the uk hydrogen
    When je clique sur l'option uk hydrogen
    Then la page UK hydrogen s'affiche
    When je clique sur le premier bouton nominate
    Then je serai redirigé vers le bas de la page
    When je clique sur le bouton back to top
    Then je pourrais naviguer jusqu'à le haut de la page
    When je scrolle to award catégorie
    Then je pourrais visualiser les six award categories avec le bouton nominate
    When je clique sur le bouton nominate
    Then je serai redirigé vers le nomination form
    When je scrolle en haut de la page jusqu'a FAQs
    Then je serai capable de visualiser cinq FAQ questions dans l' accordion style avec les boutons Nominate et Register
    When je clique sur chaque FAQ questions
    Then chaque question peut etre developpée le contenu s'affiche et tous les hyperlinks répondent bien
    When je clique sur le bouton nominate
    Then je pourrais naviguer à la fin de la page au Nomination Form
    When je Scrolle back up to the FAQs section et je clique sur le bouton registrer
    Then je pourrais naviguer au Buy Tickets page avec le lien correspondant
    When je clique sur le back button du navigateur, et je scrolle jusqu'à Nomination Criteria' section
    #Then j'afficherai six nomination criteria dans l'accordion format chaque criteria contient  plus et détails
    When je clique sur chaque  criteria
    Then j'afficherai tous les details de chaque criteria chaque criteria contient a Nomination Form Download link et seuelement une seule criteria est affiché dans un seul temps
    When je clique sur chaque Download hyperlink
    Then les six Nomination forms de chaque category seront téléchargés sur le pc
    When je scroll en dessous de la page jusquà Timeline</p>
    Then une table affichera les dates et event details
    When je Scrolle de nouveau au Nomination Form area
    Then un formulaire s'affiche avec deux bouttons 'Select files' et 'Submit your nomination'
