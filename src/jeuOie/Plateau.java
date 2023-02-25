package jeuOie;

public class Plateau {

	private static final int NB_CASES = 63;
	protected Case cases[] = new Case[NB_CASES];

	public Plateau() {
		for (int i = 0; i < NB_CASES; i++)
			cases[i] = new Case(i+1);
	}


	public Case donnerCase(int numCase) {
		if (numCase >= NB_CASES) {
			numCase = NB_CASES - (numCase-NB_CASES+2);
		}
		return cases[numCase];
	}

	public Case caseDebutPartie() {
		return cases[0];
	}
}
