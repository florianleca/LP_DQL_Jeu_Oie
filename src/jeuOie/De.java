package jeuOie;

import java.util.Random;

public class De {
	private static Random rand = new Random();

	public int lancer() {
		return rand.nextInt(6)+1;
	}
	public static void main(String[] args) {
		
	}
};
