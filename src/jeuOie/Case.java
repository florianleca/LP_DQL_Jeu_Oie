package jeuOie;

public class Case {
	protected int numCase;

	public Case(int numCase) {
		this.numCase = numCase;
	}

	// Appeler en début de tour
	public Case depart(Oie oie) {
		String couleurOie = oie.getCouleur();
		oie.ajouterMessage("Loie " + couleurOie + " est sur la case " + getNom() + ".");
		int valeurDes = oie.lancerDe();
		Case caseArrivee = caseSuivante(oie, valeurDes + numCase - 1);
		return caseArrivee;
	}

	// Appeler au déplacement de l'oie
	private Case arrivee(Oie oie) {
		oie.ajouterMessage("Elle va sur la case " + this.getNom() + ".");
		return this;
	}

	// Calcul de la case suivante en fonction du numéro de la case
	private Case caseSuivante(Oie oie, int numCaseDestination) {
		Plateau plateau  = oie.getPlateau();
		Case caseDestination = plateau.donnerCase(numCaseDestination);
		Case caseArrivee = caseDestination.arrivee(oie);
		return caseArrivee;	
	}

	public String getNom() {
		return "numero " + numCase;
	}
}
