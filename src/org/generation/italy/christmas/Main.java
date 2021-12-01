package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		
		ArrayList<String> listaDesideri = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String elemento;
		String risposta = "";
		boolean continua = true;
		//boolean vaBene = false;
		do {
			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			elemento = scan.nextLine();
			listaDesideri.add(elemento);
			if (listaDesideri.size() == 1) {
				System.out.print("La tua lista contiene " + listaDesideri.size());
				System.out.println(" desiderio.");
			}
			else {
				System.out.print("La tua lista contiene " + listaDesideri.size());
				System.out.println(" desideri.");
			}
			System.out.print("Continuare? (s/n) ");
			boolean vaBene = false;
			while(!vaBene) {
				try {
					risposta = scan.nextLine();
					if (risposta.equals("n")) {
						continua = false;
						vaBene = true;
					}
					else if (risposta.equals("s")) {
						continua = true;
						vaBene = true;
					}
					
					else{
						throw new Exception("Errore... non hai inserito i caratteri tra le opzioni");
					}
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println("Riprova (s/n):" + "\t");
				}
			}
			
			
			
			
		} while (continua);
		//ordianiamo la lista in ordine alfabetico
		Collections.sort(listaDesideri);
		System.out.println("Ecco la tua lista:");
		for (int i = 0; i < listaDesideri.size(); i++) {
			System.out.println(listaDesideri.get(i));
		}
		scan.close();
		
	}

}
