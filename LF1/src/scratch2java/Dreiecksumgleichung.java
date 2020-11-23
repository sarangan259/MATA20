package scratch2java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksumgleichung {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Geben sie die seite a ein ");
			String eingabe = br.readLine();
			double a = Double.parseDouble(eingabe.trim().replace(',', '.'));
			
			
			eingabe = br.readLine();
			double b = Double.parseDouble(eingabe.trim().replace(',', '.'));
			System.out.println("Geben sie b ein");
			
		
			System.out.println("Geben sie c ein");
			eingabe = br.readLine();
			double c = Double.parseDouble(eingabe.trim().replace(',', '.'));
			
			double summe1 = a + b; 
			double summe2 = b + c; 
			double summe3 = c + a; 
			
			if (summe1 <= c) {
				System.out.println("nicht möglich");
				return;
			}
			if (summe2 <= a) {
				System.out.println("nicht möglich");
				return;
			}	
			if (summe3 <= b) {
				System.out.println("nicht möglich");
				return;
			}
			System.out.println("Dreieck ist möglich");
			
			double umfang = a+b+c;
			
	
	
	




	} 

}
