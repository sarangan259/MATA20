package oop;

import java.io.IOException;

public class Quadratsumme {

	private static int zahl;

	public static void main(String[] args) throws IOException {
		System.out.println("Bis zu welche ganzen Zahlen sollen die Quadratsumme berechnet werden?");
		zahl = IO.readInteger();
		int summe = 0;
		for (int i = 1; i <= zahl ; i++) {
			summe = (int) (summe + Math.pow(i, 2));
			System.out.println("Quadratsumme von " + i + "ist" + summe);
			
			
			
		}
		
				

	}

}
