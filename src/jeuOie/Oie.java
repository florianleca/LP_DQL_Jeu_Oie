package jeuOie;

public class Oie{
	private Case casePlateau;
	private Plateau plateau;
	private String couleur;
	private Journal journal = new Journal();
	private De des;

	public Oie(String s, Plateau plateau, De des) {
		couleur = s;
		this.plateau = plateau;
		this.des = des;
		casePlateau = plateau.caseDebutPartie();
	}

	public Plateau getPlateau() {
		return plateau;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public boolean action(){
		casePlateau = casePlateau.depart(this);
		journal.afficherMessage();
		return casePlateau.getNom().equals("numero 63");
	}

	public int lancerDe() {
		int valeurDes = des.lancer();
		journal.ajouterMessage("elle fait " + valeurDes + ".");
		return valeurDes;
	}
	
	public void ajouterMessage(String message){
		journal.ajouterMessage(message);
	}

}
