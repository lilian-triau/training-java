# Cat and mouse

You will be given a string (x) featuring a cat 'C' and a mouse 'm'. The rest of the string will be made up of '.'

You need to find out if the cat can catch the mouse from it's current position. The cat can jump over three characters. So:

C.....m returns 'Escaped!' <-- more than three characters between

C...m returns 'Caught!' <-- as there are three characters between the two, the cat can jump.

## Focus technique

* Créer un projet maven
* Utiliser jUnit
* Avoir un code clair et concis (clean code, Kiss)
* utiliser l'approche TDD (test first -> il plante -> on le fait passer -> on refactor -> on recommence)

## Acknowledgments

Kata trouvé sur https://www.codewars.com/kata/cat-and-mouse-easy-version