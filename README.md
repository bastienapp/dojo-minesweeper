# Démineur

Une grille de démineur de taille variable (sous forme de tableaux) est envoyée en paramètre à une classe Demineur. Sur cette grille, les 0 sont des cases vides, les 1 correspondent à des bombes.

Une méthode sweep(int x, int y) permet de tester une case de la grille d’après ses coordonnées. Le retour de la méthode doit être “boom” si ça tombe sur une bombe, le nombre de bombes adjacente sinon. Une erreur doit être retournée si les coordonnées sont en dehors de la taille de la grille)

Exemple d’une grille de 4x3

	int field[][] = {
		{0,0,0,1},
		{0,1,0,1},
		{1,0,0,0},
	};

* si l’on souhaite tester la case field[1][2] : le retour doit être 3 (il y a en effet 3 bombes autour, diagonales comprises)
* si l’on souhaite tester la case field[2][0] : le retour doit être “boom” car nous sommes sur une bombe


Rappel des commandes junit :

    javac -cp .:junit-4.12.jar MineSweeperTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore MineSweeperTest
