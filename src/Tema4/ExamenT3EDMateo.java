package Tema4;
import java.util.Iterator;
import java.util.Scanner;
public class ExamenT3EDMateo {
	
	//Calcula el factorial de un número pedido por teclado

	
	    public static void main(String[] args) {
	    	Scanner teclado=new Scanner(System.in);
	        int fact=1;
	        int num=0;
	        System.out.print ("Introduce número:");
	        num = teclado.nextInt();
	        for(int i=1;i<=num;i++) {
	            fact=fact*i;
	        }
	        System.out.println ("El factorial es: "+fact);	
	    }  
}
