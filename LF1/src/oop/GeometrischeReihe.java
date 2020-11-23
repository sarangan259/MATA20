package oop;

import java.io.IOException;

public class GeometrischeReihe {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Durchgänge möchten Sie berechnen?");
		int n = IO.readInteger();
		double summe = 0;
		for (int i = 1; i <= n; i++) {
			summe = summe  + 1 / Math.pow(2, i);
			
			
		}
		

	}

}
