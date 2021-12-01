package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> listaDesideri = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String elemento;
		String risposta;
		boolean check = true;
		do {
			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			elemento = scan.nextLine().toUpperCase();
			listaDesideri.add(elemento);
			System.out.print("La tua lista contiene " + listaDesideri.size());
			System.out.println(" desideri.");
			System.out.print("Continuare? (s/n) ");
			risposta = scan.nextLine();
			if (risposta.equals("n")) {
				check = false;
			} 
		} while (check);
		//ordianiamo la lista in ordine alfabetico
		Collections.sort(listaDesideri);
		for (int i = 0; i < listaDesideri.size(); i++) {
			System.out.println(listaDesideri.get(i));
		}
		scan.close();
		
	}

}
