package scratch2java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerOhneEingabe {

	public static void main(String[] args) throws IOException {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println ("geben sie x ein ");
	String eingabe = br.readLine();
	double x = Double.parseDouble(eingabe.trim().replace(',', '.'));
	
	System.out.print("Geben sie y ein " );
	eingabe = br.readLine();
	double y = Double.parseDouble(eingabe.trim().replace(',', '.'));
	
	

	double summe= x + y;
	double multiplizieren= x * y;
	double division = x / y;
	double differenz = x - y;
	
	
	System.out.println("Summe = " + summe);
	System.out.println("Multipliezieren = " + multiplizieren);
	System.out.println("Divison = " + division);
	System.out.println("Differenz = " + differenz);  




}

}