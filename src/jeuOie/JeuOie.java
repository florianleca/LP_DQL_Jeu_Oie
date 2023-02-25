package jeuOie;

public class JeuOie {
	private Oie[] oies;
	private int nbOie = 0;
	private Plateau plateau = new Plateau();
	private De des = new De();

	public JeuOie(int nbOieMax) {
		oies = new Oie[nbOieMax];
	}

	public void ajouterOie(String couleur) {
		if (nbOie < oies.length) {
			oies[nbOie] = new Oie(couleur, plateau, des);
			nbOie++;
		}
	}

	public void jouer() {
		boolean finPartie = nbOie < 2;
		do {
			for (Oie oie : oies) {
				finPartie = oie.action();
			} 
		} while (!finPartie);
	}
}
