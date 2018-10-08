# Cat parade

_Les chats sont de sortie !_
_Vous êtes en charge de la logistique du défilé et devez vous assurer que tout va fonctionner le jour J_

A partir d'un projet existant (application simpiste n-tiers), tester toutes les parties du code avec les types de tests suivants : 
- test unitaires sur la couche controller, service et dao
- tests d'intégration sur la couche controller en ne mockant pas la sécurité (mais en mockant le service)
- tests e2e

# Objectif

Maitriser la réalisation des tests les plus courants dans un environnement non Spring

## Focus technique

* [rappel sur les types de tests](https://www.atlassian.com/continuous-delivery/different-types-of-software-testing)
* Utiliser jUnit
* Utiliser [mockito](https://site.mockito.org/)

## Pour en savoir plus

https://stackoverflow.com/questions/1906344/should-you-only-mock-types-you-own
https://8thlight.com/blog/eric-smith/2011/10/27/thats-not-yours.html
https://markhneedham.com/blog/2009/12/13/tdd-only-mock-types-you-own/
https://davesquared.net/2011/04/dont-mock-types-you-dont-own.html