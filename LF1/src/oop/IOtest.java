package oop;

import java.io.IOException;

public class IOtest {

	public static void main(String[] args) throws IOException {

		boolean weiter;
		do {
			System.out.print("Wie hei�t du? ");
			String name = IO.readString();
			System.out.println("Hallo " + name);
			System.out.print("Wie alt bist du ? ");
			int alter = IO.readInteger();
			System.out.println(name +" ist " + alter + " Jahre alt ");
			System.out.println("M�chten sie den vorgang wiederholen? ");
			weiter = IO.readBoolean();
		}while(weiter == true);
	}


}
