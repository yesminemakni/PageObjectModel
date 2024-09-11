@tag
Feature: Paiement
Je veux payer ma commande

Background: 

   Given Saisir l URL suivant "https://automationexercise.com/"
    When choisir signup login
    And saisir adresse mail "amine.amine@gmail.fr" et le mot de passe "Test123"
    And cliquer sur le bouton login
     Given cliquer sur le bouton Products
    When survoler sur le premier produit et cliquer sur add to product
    And cliquer sur continue shopping
    And survoler sur le deuxieme produit et cliquer sur add to product
    And cliquer sur view cart button


  @tag1
  Scenario: Paiement
    Given cliquer sur le bouton Procced to checkout 
    And cliquer sur le bouton place order
    When saisir le nom du carte "Biat Card"
    And saisir le numero du carte "45632123565487"
    And saisir le code CVC "456"
    And saisir date Expiration "08" et "2028"
    And appuyer sur le bouton pay and confirm order
    Then verifier confirmation de la demande "ORDER PLACED!"
    And telecharger le fichier invoice 
