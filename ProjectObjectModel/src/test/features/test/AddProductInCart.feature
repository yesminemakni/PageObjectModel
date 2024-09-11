@AddProductInCart
Feature: Add Product In Cart
  
  I want to add products in cart 
  
  Background: 
    Given Saisir l URL suivant "https://automationexercise.com/"
    When choisir signup login
    And saisir adresse mail "amine.amine@gmail.fr" et le mot de passe "Test123"
    And cliquer sur le bouton login

  @tag1
  Scenario: Add products in cart
    Given cliquer sur le bouton Products
    When survoler sur le premier produit et cliquer sur add to product
    And cliquer sur continue shopping
    And survoler sur le deuxieme produit et cliquer sur add to product
    And cliquer sur view cart button
    Then verifier les deux produits ajoutées to cart
    And verifier leurs prix, quantités et prix totals
