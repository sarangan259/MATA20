package scratch2java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeAllerZahlen {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bis Zu ");
        String eingabe = br.readLine();
        int a = Integer.parseInt(eingabe.trim().replace(',', '.'));



        int zahl = a;
        int summe = 0;
        int ende = 0;

        while (summe < zahl )  {
                summe ++;
                ende += summe;
        }

                System.out.println(ende);


		
		

	}

}
