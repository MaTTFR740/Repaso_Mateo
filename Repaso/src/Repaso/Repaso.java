package Repaso;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		String respuesta="";
		
		System.out.println("¿Existe el multiverso?");
		respuesta=ent.nextLine().toUpperCase();
		
	
		switch(respuesta){
			case "SI":
				System.out.println("Correcto");
				break;
			case "NO":
				System.out.println("Incorrecto");
				break;
			default:
				System.out.println("Piensalo mejor");
				break;
		}
			
	//Cambia lo que te de la gana del codigo
		
}
}