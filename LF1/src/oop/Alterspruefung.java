package oop;

import java.io.IOException;

public class Alterspruefung {

	public static void main(String[] args) throws IOException {
		System.out.println("gib dein alter ein");
		int eingabe = IO.readInteger();
		if (eingabe <=18){
			System.out.println("du bist noch Minderj�hrig");
		}else if (eingabe >18) {
			System.out.println("Du bist schon Vollj�hrig");
		}
	}

}
