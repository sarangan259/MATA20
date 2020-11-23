package oop;

import java.io.IOException;

public class Zellwachstum {

	private static int zellenmenge;

	public static void main(String[] args) throws IOException {

		System.out.println("Bitte die aktulle Zellen Menge eingaben: ");
		setZellenmenge(IO.readInteger());
		System.out.println("Bitte den Wachstumsfaktor eingeben: "); 
		int wachstum = IO.readInteger();
		System.out.println("Bitte die Laufzeit der Hochrechnung in Tagen eingeben: ");
		int tage = IO.readInteger();
		int starttag;

		System.out.println("Tag || Zellenwert");

		for (int i = 0; i <= tage; i++) {

			starttag = i;

			double ergebnis = starttag * Math.pow(wachstum, i); 	
			System.out.println(starttag  + "\t" + ergebnis );



		}





	}

	public static int getZellenmenge() {
		return zellenmenge;
	}

	public static void setZellenmenge(int zellenmenge) {
		Zellwachstum.zellenmenge = zellenmenge;
	}



}



