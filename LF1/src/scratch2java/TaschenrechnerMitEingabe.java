package scratch2java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie die erste zahl ein");
        String eingabe = br.readLine();
        double  x = Double.parseDouble(eingabe.trim().replace(',', '.'));
        
        System.out.print("Geben sie die zweite Zahl ein");
		eingabe = br.readLine();
		double y = Double.parseDouble(eingabe.trim().replace(',', '.'));

		System.out.println("Folgende rechenoperationen stehen zur auswahl");
		System.out.println("[+] für Addition");
		System.out.println("[-] für subtrakation");
		System.out.println("[*] für multiplikation");
		System.out.println("[/] für Division");
		System.out.println("Deine Auswahl: ");
		eingabe = br.readLine(); 


		if (eingabe.equals("+")){
			double addition = x + y;
			System.out.println("Addition (+) = " + addition );
		}
		else if (eingabe.equals("-")) {
			double subtrakation = x - y;	
			System.out.println("subtrakation (-) = " + subtrakation);
		}
		else if (eingabe.equals("*")) { 
			double multiplizieren= x * y;
			System.out.println("Multipliezieren(×) = " + multiplizieren); 
		}
		else if  (eingabe.equals("/")) {
			double division = x / y;
			System.out.println("Division (÷) = " + division);
		}
		else {
			System.out.println("Kann ich nicht ");
			
					}

	}

}

