package ej.starwars;

import java.util.Scanner;

public class EjercicioStarWars {
	
	static final String PERSONAJE_SECRETO = " Luke ";
	static final String PARENTESCO_SECRETO = " padre ";
	static final String MENSAJE_SECRETO = " TOP SECRET ";
	static final String MENSAJE_NO_SECRETO = " yo soy tu ";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt(); //gestiona mejor la lectura de lineas que tiene varios caracteres 
		sc.nextLine();
		
		String[] personajes = new String[casos];
		String[] parentescos = new String[casos];
		for (int i = 0; i <casos; i++) {
			personajes[i] = sc.nextLine();
			parentescos[i] = sc.nextLine();			// guarda el númer de casos en los arrays
		}

		for (int i=0; i< casos; i++) {
			if (personajes[i].equals(PERSONAJE_SECRETO) && parentescos[i].equals(PARENTESCO_SECRETO))
				System.out.println(MENSAJE_SECRETO);
			else {
				System.out.println(personajes[i] + MENSAJE_NO_SECRETO + parentescos[i]);
			}
		}
		sc.close();
	}

}
