package Repaso;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		String respuesta="";
		
		System.out.println("�Existe el multiverso?");
		respuesta=ent.nextLine();
		
	
		
		if(respuesta.contentEquals("si")) {
			System.out.println("Correcto, estas listo para el viaje");
		}else if(respuesta.contentEquals("no")) {
			System.out.println("Debes meditar m�s...");
		}else{
			System.out.println("�Eres est�pido?");
		}
			
	//Cambia lo que te de la gana del codigo
		
}
}