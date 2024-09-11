@AuthentificationAutomationExercice
Feature: Authentification automation exercice

  @tag1
  Scenario: Connexion à l application
    Given Saisir l URL suivant "https://automationexercise.com/"
    When choisir signup login
    And saisir adresse mail "amine.amine@gmail.fr" et le mot de passe "Test123"
    And cliquer sur le bouton login
    Then verifier le nom du profil affiché "Amine"
