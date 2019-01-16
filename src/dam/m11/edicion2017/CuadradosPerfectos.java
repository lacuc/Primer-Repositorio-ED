package dam.m11.edicion2017;

import java.util.Scanner;

public class CuadradosPerfectos {
	
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		//esta l�nwea en programame no la incluiriamos
		
		int cantidad = solicitarValorEntero("Indica la cantidad de n�meros a introducir");
		
		int num; 
		boolean esCP;
		
		for (int i = 0; i < args.length; i++) {
			
			num = Integer.parseInt("Introduce el n�mero entero i");
			
			//analizar si num es cuadrado perfecto
			esCP = comprobarCuadradoPerfecto(num);
			
		}
		
		
		sc.close();

	}
	
	private static boolean comprobarCuadradoPerfecto(int num) {
		//calculamos la parte entera de la ra�z cuadrada de num
		int rc = (int) Math.floor(Math.sqrt(num)); // sqrt es para pasar a un n�mero entero
		
	if ( num== rc *rc) {
		return true;
	}else {
		return false;
	}
		
	}

	private static int solicitarValorEntero(String mensaje)  {
		System.out.println(mensaje);
		int entero = Integer.parseInt(sc.nextLine());
		return entero;
	}

}
