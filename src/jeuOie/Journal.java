package jeuOie;

public class Journal {
	private String message = "";

	public void ajouterMessage(String message) {
		this.message += message;
		this.message += "\n";
	}

	public void afficherMessage() {
		System.out.println(message);
		message="";
	}
}
